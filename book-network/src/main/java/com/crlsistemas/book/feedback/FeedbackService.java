package com.crlsistemas.book.feedback;


import com.crlsistemas.book.book.Book;
import com.crlsistemas.book.book.BookRepository;
import com.crlsistemas.book.exception.OperationNotPermittedException;

import com.crlsistemas.book.user.User;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    private final BookRepository bookRepository;
    private final FeedbackMapper feedbackMapper;
    private final FeedbackRepository feedbackRepository;

    public Integer save(FeedbackRequest request, Authentication connectedUser) {

            Book book = bookRepository.findById(request.bookId())
                    .orElseThrow(() -> new EntityNotFoundException("No book found with the ID:: " + request.bookId()));
            if (book.isArchived() || !book.isShareable()) {
                throw new OperationNotPermittedException("You cannot give a feedback for an archived or not shareable book");

            }
            User user = ((User) connectedUser.getPrincipal());
            if (Objects.equals(book.getOwner().getId(), user.getId())) {
                //throw an exception
                throw new OperationNotPermittedException("You cannot give a feedback to your own book");
            }
            Feedback feedback = feedbackMapper.toFeedback(request);

        return feedbackRepository.save(feedback).getId();
    }
}
