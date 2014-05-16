package br.org.witt.utilities;

/**
 * This class is intended to help complex validation processes, on which you
 * have many validation steps. At the beginning, the "thing" being validated is
 * considered valid. Each validation step must update the validation status. At
 * the validation end, if any of the validation steps considered the "thing"
 * being validated invalid, then it will be invalid. If none of the
 * validation steps considered the "thing" being validated invalid, then it will
 * be valid.
 * 
 * @author Luciano Witt
 * 
 */
public class ValidationResult {

	private boolean result;

	public ValidationResult() {
		clear();
	}

	public void clear() {
		result = true;
	}

	public boolean isValid() {
		return result;
	}

	public void update(boolean partialResult) {
		if (!partialResult) {
			result = false;
		}
	}
}
