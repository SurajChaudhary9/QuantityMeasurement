/**
 *@PROBLEM_STATEMENT : UC
 *@author Suraj Chaudhary
 *@Date 22-Apr-2022
 */
package com.quantity;

import java.util.function.Function;

public enum TemperatureUnits implements Units {
	CELSIOUS(false), FAHRENHEIT(true);

	final Function<Double, Double> degFToCelcius = (degF) -> {
		return ((degF.doubleValue() - 32) * 5 / 9);
	};

	final Function<Double, Double> degCToCelcius = (degC) -> {
		return degC.doubleValue();
	};
	private final Function<Double, Double> conversion_value;

	TemperatureUnits(boolean isFahrenheit) {
		if (isFahrenheit) {
			this.conversion_value = degFToCelcius;
		} else {
			this.conversion_value = degCToCelcius;
		}
	}

	public double unitConversion(Double value) {
		return conversion_value.apply(value);
	}
}
