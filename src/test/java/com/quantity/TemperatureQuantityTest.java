/**
 *@PROBLEM_STATEMENT : UC8 Compare Temperature
 *@author Suraj Chaudhary
 *@Date 21-Apr-2022
 */
package com.quantity;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureQuantityTest {
	static Quantitymeasurement quantityMeasurement = new Quantitymeasurement();

	/*
	 * 0 CELSIUS = 0 CELCIUS
	 */
	@Test
	public void given0celsiousAnd0cesious_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * 0 CELSIUS != 1 CELSIUS
	 */
	@Test
	public void given0celsiousAnd1cesious_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * 1 CELSIUS = I CELSIUS
	 */
	@Test
	public void given1celsiousAnd1cesious_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * 0 CELSIUS != 0 FAHRENHEIT
	 */
	@Test
	public void given0celsiousAnd1faherenheit_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 0.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * 100 CELSIUS == 212 FAHRENHEIT
	 */
	@Test
	public void given100celsiousAnd212faherenheit_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIOUS, 100.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 212.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

}
