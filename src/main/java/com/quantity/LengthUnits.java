/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 22-Apr-2022
 */
package com.quantity;

public enum LengthUnits implements Units {
	FEET(12), INCH(1), YARD(36), CM(1 / 2.5);

	public double unit;

	/**
	 * @param d
	 */
	LengthUnits(double units) {
		this.unit = units;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double unitConversion(Double value) {
		// TODO Auto-generated method stub
		return unit * value;
	}

}
