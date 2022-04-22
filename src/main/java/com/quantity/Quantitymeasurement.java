/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 20-Apr-2022
 */
package com.quantity;

public class Quantitymeasurement {
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public double unitConversion(Units unitType, Double value) {
		return unitType.unitConversion(value);
	}

	public double unitAddition(Units unitType1, double value1, Units unitType2, double value2) {
		return unitType1.unitConversion(value1) + unitType2.unitConversion(value2);
	}

}
