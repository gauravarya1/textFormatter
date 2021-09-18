/**
 * 
 */
package com.formatter.data.model;

/**
 * @author Gaurav
 *
 */
public class NumberModel {

	private double number;
	
	public NumberModel(double num)
	{
		this.setNumber(num);
	}

	/**
	 * @return the number
	 */
	public double getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(double number) {
		this.number = number;
	}
	
	
}
