package examen.galeria.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ArtworkCreationException extends RuntimeException {

	String msg;

	public ArtworkCreationException(String msg) {
		super(msg);
	}

}
