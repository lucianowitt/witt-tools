package br.org.witt.utilities.validation;

import java.util.Arrays;
import java.util.List;

public class Validation {

	private ValidationResult result;
	private List<Validator> validators;

	public Validation(Validator... validators) {
		result = new ValidationResult();
		this.validators = Arrays.asList(validators);
	}

	public void run(Object item) {
		result.clear();
		for (Validator validator : validators) {
			validator.validate(item);
			if (!validator.isValid()) {
				result.invalidate(validator.getValidationMessage());
			}
		}
	}

	public ValidationResult getResult() {
		return result;
	}
}
