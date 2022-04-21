/**
 *@PROBLEM_STATEMENT : UC7 Compare Weights Units
 *@author Suraj Chaudhary
 *@Date 22-Apr-2022
 */
package com.quantity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeightQuantityTest {

	private Quantitymeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new Quantitymeasurement();
	}

	/**
	 * Rigorous Test :- For Getting 0 Gram And 0 Gram Equality Check
	 */
	@Test
	public void given0Gramand0GramWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}
}