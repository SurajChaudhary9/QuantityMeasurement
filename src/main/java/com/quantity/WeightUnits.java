/**
 *@PROBLEM_STATEMENT : UC7 Compare Weights Units
 *@author Suraj Chaudhary
 *@Date 22-Apr-2022
 */
package com.quantity;

public enum WeightUnits implements Units {
	GRAM(1), KG(1000), TONNE(1000 * 1000);

	public double unit;

	WeightUnits(double units) {
		this.unit = units;
	}

	/**
	 * @purpose :
	 * @param :
	 * @function :
	 * @return :
	 */
	int unitConversion(double value1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double unitConversion(Double value) {
		// TODO Auto-generated method stub
		return unit * value;
	}

}
