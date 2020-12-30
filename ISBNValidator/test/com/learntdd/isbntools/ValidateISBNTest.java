package com.learntdd.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);
		assertTrue(result);
	}
	
	public void checkInValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(140449116);
		assertFalse(result);
	}

}
