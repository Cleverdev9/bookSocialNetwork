<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/config/ApplicationAuditAware.java
package com.crlsistemas.booknetwork.config;

import com.crlsistemas.booknetwork.user.User;
=======
package com.crlsistemas.book.config;

import com.crlsistemas.book.user.User;
>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/config/ApplicationAuditAware.java
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;
<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/config/ApplicationAuditAware.java
public class ApplicationAuditAware implements AuditorAware<Integer>{
	@Override
=======

public class ApplicationAuditAware implements AuditorAware<Integer> {
    @Override
>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/config/ApplicationAuditAware.java
    public Optional<Integer> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null ||
                !authentication.isAuthenticated() ||
                authentication instanceof AnonymousAuthenticationToken) {

            return Optional.empty();
        }
        User userPrincipal = (User) authentication.getPrincipal();
        return Optional.ofNullable(userPrincipal.getId());
    }
}
