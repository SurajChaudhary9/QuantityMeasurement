/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 20-Apr-2022
 */
package com.quantity;

public enum Units {
	FEET(30.48), INCH(2.5), YARD(90), CM(1);

	public double unit;

	// let us inch as reference
	Units(double unit) {
		this.unit = unit;
	}
}
//custom data type (enumerated data type)
