package com.crlsistemas.book.feedback;

import com.crlsistemas.book.book.Book;
import org.springframework.stereotype.Service;

@Service
public class FeedbackMapper {
    public Feedback toFeedback(FeedbackRequest request){
        return Feedback.builder()
                .note(request.note())
                .comment((request.comment()))
                .book(Book.builder()
                        .id(request.bookId())
                        .archived(false) // not required and has no impact :: just to satisfy lombok
                        .shareable(false) // not required and has no impact :: just to satisfy lombok
                        .build()
                )

                .build();
    }
}
