/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 20-Apr-2022
 */
package com.quantity;

public enum Units {
	FEET(12), INCH(1), YARD(36);

	public double unit;

	// let us inch as reference
	Units(double unit) {
		this.unit = unit;
	}
}
//custom data type (enumerated data type)
