package examen.galeria.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint (validatedBy = DescriptionFormatValidator.class)
public @interface DescriptionFormat {
	
	String message() default " La descripción de la obra de arte debe contener al menos 5 palabras";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
