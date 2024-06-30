package com.crlsistemas.booknetwork.email;


import lombok.Getter;

@Getter
public enum EmailTemplateName {
<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/email/EmailTemplateName.java
	ACTIVATE_ACCOUNT("activate_account");
=======

    ACTIVATE_ACCOUNT("activate_account");
>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/email/EmailTemplateName.java

    private final String name;

    EmailTemplateName(String name) {
        this.name = name;
    }
}
