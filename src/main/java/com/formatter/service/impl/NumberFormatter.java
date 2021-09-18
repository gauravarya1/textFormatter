/**
 * 
 */
package com.formatter.service.impl;

import com.formatter.service.intf.*;
import com.formatter.data.model.NumberModel;
import com.formatter.service.utils.*;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gaurav
 * 
 */

public class NumberFormatter implements Formatter {

	// The toObject(String) Method takes a String date as input in the format
	// "MM/dd/yyyy" and returns a Date object.
	@Override
	public NumberModel toObject(String numberStr) throws ParseException {
		NumberModel num = new NumberModel(Double.parseDouble(numberStr));
		return num;
	}

	// Converts the given Number Object to a String, without Localization.
	@Override
	public String toString(Object numberObj) throws ParseException {
		NumberModel nf = (NumberModel) numberObj;
		return (Double.toString(nf.getNumber()));

	}

	// Validate if the string is a valid number.
	@Override
	public boolean isValid(String numStr) {
		// defaultFormat = "xxxxxx.xxxx";
		String regex = "[+-]?([0-9]*[.])?[0-9]+";
		return DateUtils.checkValidDate(numStr, regex);
	}

	// Convert a Number Object to String with a locale. Localization can be provided
	// as a LangageTag example: "de-Germany" or "en-US"
	@Override
	public String toString(Object obj, String locale) throws ParseException {
		NumberModel fn = (NumberModel) obj;
		Locale lc = Locale.forLanguageTag(locale);
		NumberFormat numFor = NumberFormat.getInstance(lc);
		return numFor.format(fn.getNumber());
	}

}
