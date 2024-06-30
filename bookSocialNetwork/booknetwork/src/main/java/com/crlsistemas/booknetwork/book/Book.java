package com.crlsistemas.booknetwork.book;

import java.util.List;

import com.crlsistemas.booknetwork.common.BaseEntity;
import com.crlsistemas.booknetwork.feedback.Feedback;
import com.crlsistemas.booknetwork.history.BookTransactionHistory;
import com.crlsistemas.booknetwork.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book extends BaseEntity{
	 private String title;
	    private String authorName;
	    private String  isbn;
	    private String synopsis;
	    private String bookCover;
	    private boolean archived;
	    private boolean shareable;

	    @ManyToOne
	    @JoinColumn(name = "owner_id")
	    private User owner;

	    @OneToMany(mappedBy = "book")
	    private List<Feedback> feedbacks;

	    @OneToMany(mappedBy = "book")
	    private List<BookTransactionHistory> histories;

	    @Transient
	    public double getRate(){
	        if (feedbacks == null || feedbacks.isEmpty()){
	            return 0.0;
	        }
	        var rate = this.feedbacks.stream()
	                .mapToDouble(Feedback::getNote)
	                .average()
	                .orElse(0.0);
	        //3.23 --> 3.0 || 3.54 --> 4.0
	        double roundedRate = Math.round(rate * 10.0) / 10.0;
	        return roundedRate;
	    }
}