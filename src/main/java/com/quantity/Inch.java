/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 18-Apr-2022
 */
package com.quantity;

public class Inch {

	private final double value;

	public Inch(double value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inch other = (Inch) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}