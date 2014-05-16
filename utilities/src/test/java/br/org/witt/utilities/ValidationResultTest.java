package br.org.witt.utilities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidationResultTest {

	private ValidationResult validationResult;

	@Before
	public void setUp() {
		validationResult = new ValidationResult();
	}

	@Test
	public void shouldBeValidAtTheBegining() {
		assertTrue(validationResult.isValid());
	}

	@Test
	public void shouldBeValidIfNoPartialValidationIsInvalid() {
		validationResult.update(true);
		validationResult.update(true);
		validationResult.update(true);
		assertTrue(validationResult.isValid());
	}

	@Test
	public void shouldBeInvalidIfOnePartialValidationIsInvalid() {
		validationResult.update(true);
		validationResult.update(false);
		validationResult.update(true);
		assertFalse(validationResult.isValid());
	}

	@Test
	public void shouldBeValidIfValidationIsCleared() {
		validationResult.update(true);
		validationResult.update(false);
		validationResult.update(true);
		validationResult.clear();
		assertTrue(validationResult.isValid());
	}
}
