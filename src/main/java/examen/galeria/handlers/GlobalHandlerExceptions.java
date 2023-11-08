package examen.galeria.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import examen.galeria.exceptions.ArtworkCreationException;

@RestControllerAdvice
public class GlobalHandlerExceptions {

	@ExceptionHandler(ArtworkCreationException.class)
	public ProblemDetail ArtworkCreationException(ArtworkCreationException e) {
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Artist Exception Occuder");
		problemDetail.setType(URI.create("http://GaleríaArte.com"));
		problemDetail.setProperty("errorCategory", "Artist");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}

}
