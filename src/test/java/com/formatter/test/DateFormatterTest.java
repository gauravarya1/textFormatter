package com.formatter.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.formatter.service.impl.DateFormatter;

/**
 * Unit test for simple Examples.
 */
public class DateFormatterTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		// Sample Test
		assertTrue(true);
	}

	@Test
	public void validateDateTestFalse() {
		DateFormatter df = new DateFormatter();
		assertFalse(df.isValid("100/12/2021"));

	}

	@Test
	public void validateDateTestTrue() {
		DateFormatter df = new DateFormatter();
		assertTrue(df.isValid("10/12/2021"));
	}

	@Test
	public void DateToStringTestTrue() throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		DateFormatter df = new DateFormatter();
		String testDate = df.toString(new Date());
		System.out.println(testDate);
		assertTrue(testDate.equals(formatter.format(date)));
	}

}
