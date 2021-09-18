package com.formatter.test;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.formatter.data.model.NumberModel;
import com.formatter.service.impl.NumberFormatter;

public class NumberFormatterTest {

	NumberFormatter nf = new NumberFormatter();
	
	@Test
	public void testToObject() throws ParseException {
		
		assertTrue(nf.toObject("22.5").getNumber()== ((Double)22.5));
		assertTrue(nf.toObject("25").getNumber()== (25));
	}

	@Test
	public void testToStringObject() throws ParseException {
		NumberModel fn = new NumberModel(22.5);
		String str = nf.toString(fn);
		assertTrue(str.equals(Double.toString(22.5)));
		
		fn = new NumberModel(22);
		str = nf.toString(fn);
		assertTrue(str.equals(Double.toString(22)));
		
	}

	@Test
	public void testIsValid() {
		assertTrue(nf.isValid("23123.22"));
		assertFalse(nf.isValid("23aa123.22"));
		
	}

	@Test
	public void testToStringObjectLocale() throws ParseException {
		
		String numb = nf.toString(new NumberModel(22.2),"fr-FR");
		System.out.println("Locale Number :" + numb.equals("22,2"));
		assertTrue( numb.equals("22,2"));
	}

}
