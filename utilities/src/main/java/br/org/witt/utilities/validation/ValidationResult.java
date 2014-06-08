package br.org.witt.utilities.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is intended to help complex validation processes, on which you
 * have many validation steps. At the beginning, the "thing" being validated is
 * considered valid. Each validation step must update the validation status. At
 * the validation end, if any of the validation steps considered the "thing"
 * being validated invalid, then it will be invalid. If none of the validation
 * steps considered the "thing" being validated invalid, then it will be valid.
 * 
 * @author Luciano Witt
 * 
 */
public class ValidationResult {

	private Boolean result;
	private List<ValidationMessage> messages;

	public ValidationResult() {
		clear();
	}

	public void clear() {
		result = true;
		messages = new ArrayList<ValidationMessage>();
	}

	public void invalidate(ValidationMessage message) {
		result = false;
		messages.add(message);
	}
	
	public boolean isValid() {
		return result;
	}
	
	public List<ValidationMessage> getMessages() {
		return messages;
	}
}
