/**
 *@PROBLEM_STATEMENT : UC6 Volume litre Gallon Compare
 *@author Suraj Chaudhary
 *@Date 21-Apr-2022
 */
package com.quantity;

public enum VolumeUnits implements Units {
	GALLON(3.78 * 1000), LITRE(1000), MILLILITER(1);

	public double unit;

	VolumeUnits(double units) {
		this.unit = units;
	}

	@Override
	public double unitConversion(Double value) {
		// TODO Auto-generated method stub
		return unit * value;
	}
}
