package com.formatter.app;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;

import com.formatter.data.model.NumberModel;
import com.formatter.service.impl.*;

/**
 * Hello world!
 *
 */
public class Examples {
	public static void main(String[] args) throws ParseException {

		DateFormatter df = new DateFormatter();

		/*
		 * Date Formatter Examples
		 */
// Converting date String to Date Object
		System.out.println("**************Date Formatter Examples***********");
		Date d1 = df.toObject("10/12/2021");
		System.out.println("Date Object:" + "\t" + d1);

		// Converting date Object to Date String with a locale
		String sampleDate1 = df.toString(new Date(), "fr-France");
		System.out.println("String Date with French Locale:" + sampleDate1);

		// Converting date Object to Date String without a locale
		String sampleDate2 = df.toString(new Date());
		System.out.println("String Date:" + sampleDate2);

		// Validating a Date String
		System.out.println("is 10/12/2021 a valid Date: " + df.isValid("10/12/2021"));

		/*
		 * To use Number Formatter Examples
		 */ NumberFormatter nf = new NumberFormatter();
		System.out.println("**************Number Formatter Examples***********");
//Convert a number string to an NumberModel object.		
		System.out.println("Converting 22.5 to Object: " + nf.toObject("22.5"));

// Convert Number to String with French Locale.
		String numb = nf.toString(new NumberModel(22.2), "fr-FR");
		System.out.println("Number formatted for FR locale :" + numb);

		// Convert Number to String without Locale.
		String numb2 = nf.toString(new NumberModel(22.2));
		System.out.println("Number formatted without Locale :" + numb2);

// Number validity
		System.out.println("Is 22.5 a valid number : " + nf.isValid("22.5"));

	}
}
