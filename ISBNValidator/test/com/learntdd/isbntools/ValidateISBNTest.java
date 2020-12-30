package com.learntdd.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value",result);
		result = validator.checkISBN("0140177396");
		assertTrue("second value",result);
	}
	
	@Test
	public void checkValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781853260087");
		assertTrue("first value",result);
		result = validator.checkISBN("9781853267338");
		assertTrue("second value",result);
	}
	
	@Test
	public void TenDigitIsbnEndingWithXIsValid() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("012000030X");
		assertTrue(result);
	}
	
	@Test
	public void checkInValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test
	public void checkInValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781853267336");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nineDigitIsbnNumberNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("123456789");
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumericIsbnNumberNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		validator.checkISBN("helloWorld");
	}
}
