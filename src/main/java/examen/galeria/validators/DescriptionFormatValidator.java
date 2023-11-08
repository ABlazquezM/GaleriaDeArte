package examen.galeria.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DescriptionFormatValidator implements ConstraintValidator<DescriptionFormat, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		if (value == null || value.trim().isEmpty()) {
			return false;
		}

		String[] palabras = value.trim().split("\\s+");
		return palabras.length >= 5;

	}

}
