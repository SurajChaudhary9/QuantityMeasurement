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

}
