/**
 * 
 */
package com.formatter.service.intf;

import java.text.ParseException;

/**
 * @author Gaurav Arya
 * 
 *
 */
public interface Formatter {

	// Convert strings to object of a certain type.
	public Object toObject(String str) throws ParseException;
	
	// Converts the object of a certain type to Text.
	public String toString(Object obj) throws ParseException;

	// Converts the object of a certain type to Text, also provides localization.
	public String toString(Object obj, String locale) throws ParseException;

		
	// Validates the String with the default format of the Formatter.
	public boolean isValid(String str) throws ParseException;
}
