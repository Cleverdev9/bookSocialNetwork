<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/config/OpenApiConfig.java
package com.crlsistemas.booknetwork.config;
=======
package com.crlsistemas.book.config;

>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/config/OpenApiConfig.java

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/config/OpenApiConfig.java
                        name = "Cleverson",
                        email = "crlsistemas7@gmail.com",
                        url = ""
=======
                name = "Cleverson",
                email = "crlsystemas7@gmail.com",
                url = ""
>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/config/OpenApiConfig.java
                ),
                description = "OpenApi documentation for Spring security",
                title = "OpenApi specification - Cleverson",
                version = "1.0",
                license = @License(
                        name = "Licence CRLSistemas",
                        url = ""
                ),
                termsOfService = "Terms of services"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8088/api/v1"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://crlsistemas.com"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth" // the same name must to be name's @SecurityScheme
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
<<<<<<< HEAD:bookSocialNetwork/booknetwork/src/main/java/com/crlsistemas/booknetwork/config/OpenApiConfig.java

=======
>>>>>>> 48bb36c90ceba905ee7280c6d4d4264e7fb98473:book-network/src/main/java/com/crlsistemas/book/config/OpenApiConfig.java
}
