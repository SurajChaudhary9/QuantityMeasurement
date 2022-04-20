/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 20-Apr-2022
 */
package com.quantity;

public class Quantitymeasurement {
	double feet;
	double inch;

	// Units -data type units - object ENUM
	public double unitComparison(Units units, double value) {
		return value * units.unit;
	}
}
