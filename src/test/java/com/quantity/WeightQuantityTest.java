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
	 * TC :- For Getting 0 Gram + 0 Gram Equality Check
	 */
	@Test
	public void given0Gramand0GramWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.6 : 1 kg = 1000 grams check
	 */
	@Test
	public void given1KGand1000GramsWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.KG, 1.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.7 : 1 tonne = 1000 kgs
	 */
	@Test
	public void given1Tonneand1000KGWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 1.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.8 : 1 tonne + 1000 gm = 1001 kg
	 */
	@Test
	public void givenOneTonneAndThousandgramsWhenAdded_ShouldReturn1001KG() {
		double value1 = quantityMeasurement.unitAddition(WeightUnits.TONNE, 1.0, WeightUnits.GRAM, 1000.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1001.0);
		Assert.assertEquals(value1, value2, 0);
	}
}