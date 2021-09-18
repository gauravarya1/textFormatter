/**
 * 
 */
package com.formatter.service.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gaurav
 *
 */
public class DateUtils {

	public static Date toDateFromString(String dateStr, String format) throws ParseException {
		// Example Date input : String sDate1="10/30/2001";
		Date dateObj = new SimpleDateFormat(format).parse(dateStr);
		return dateObj;
	}

	// Varifies if the given date string matches the provided Regex.
	public static boolean checkValidDate(String dateStr, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dateStr);

		return matcher.matches();
	}

	public static String toStringFromDate(Date dateObj, String format) throws ParseException {
		// Example Date input : String sDate1="10/30/2001";
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String dateStr = formatter.format((Date) dateObj);
		return dateStr;

	}
}
