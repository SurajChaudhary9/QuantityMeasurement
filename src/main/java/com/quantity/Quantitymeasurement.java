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

	public double unitConversion(VolumeUnits units, Double value) {
		return units.unit * value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quantitymeasurement other = (Quantitymeasurement) obj;
		return Double.doubleToLongBits(feet) == Double.doubleToLongBits(other.feet)
				&& Double.doubleToLongBits(inch) == Double.doubleToLongBits(other.inch);
	}

	public double unitAddition(Units unit1, double value1, Units unit2, double value2) {
		return unitComparison(unit1, value1) + unitComparison(unit2, value2);

	}
}