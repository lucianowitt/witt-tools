package br.org.witt.utilities.validation;

public interface Validator {

	void validate(Object value);

	boolean isValid();

	ValidationMessage getValidationMessage();
}
