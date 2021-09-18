/**
 * 
 */
package com.formatter.service.impl;

import com.formatter.service.intf.*;
import com.formatter.service.utils.*;

import java.text.DateFormat;
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

public class DateFormatter implements Formatter {

	// The toObject(String) Method takes a String date as input in the format
	// "MM/dd/yyyy" and returns a Date object.
	@Override
	public Date toObject(String dateStr) throws ParseException {

		// Convert the . and - characters to /, in order to return a standardized output.
		dateStr = dateStr.replace(".", "/");
		dateStr = dateStr.replace("-", "/");
		String defaultFormat = "MM/dd/yyyy";
		Date dateObj = DateUtils.toDateFromString(dateStr, defaultFormat);

		return dateObj;
	}

	// Converts the given date Object to a String, uses Date Utils, utility
	@Override
	public String toString(Object dateObj) throws ParseException {

		String format = "MM/dd/yyyy";
		String dateStr = DateUtils.toStringFromDate((Date) dateObj, format);

		return dateStr;

	}

//Validates the date format with the default format which is "MM/dd/yyyy"	
	@Override
	public boolean isValid(String dateStr) {
		// defaultFormat = "MM/dd/yyyy";
		String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
		return DateUtils.checkValidDate(dateStr, regex);
	}

	// Allows localization when converting a date object to String, Localization can
	// be provided as a LangageTag example: "de-Germany" or "en-US"
	@Override
	public String toString(Object obj, String locale) throws ParseException {
		Locale lc = Locale.forLanguageTag(locale);
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, lc);
		return df.format((Date) obj);
	}

}
