/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 18-Apr-2022
 */
package com.quantity;

public class Feet {
	private double value = 0.0;

	public Feet(double value) {
		this.value = value;
	}

	public Feet() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feet other = (Feet) obj;
		return Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
	}

	/**
	 * @purpose :
	 * @param :
	 * @function :
	 * @return :
	 */
	public void setValue(int i) {
		// TODO Auto-generated method stub

	}

	/**
	 * @purpose :
	 * @param :
	 * @function :
	 * @return :
	 */
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
