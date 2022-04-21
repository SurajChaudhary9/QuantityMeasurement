/**
 *@PROBLEM_STATEMENT : UC5 Volume litre Gallon Compare
 *@author Suraj Chaudhary
 *@Date 21-Apr-2022
 */
package com.quantity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VolumeQuantityTest {
	private Quantitymeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new Quantitymeasurement();
	}

	/**
	 * TC 1.1 :- For Getting 0 Gallon And 0 Gallon Equality Check
	 */
	@Test
	public void given0Gallonand0GallonWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.2 :- For Getting 1 Gallon And 3.78 Litres Equality Check
	 */
	@Test
	public void given1GallonandThreepointSevenEightLitersWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 1.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 3.78);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.3 :- For Getting 1 Litre And 1000 Ml Equality Check
	 */
	@Test
	public void given1litreand1000MilliLitersWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 1.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.MILLILITER, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * TC 1.4 : For Getting 1 Gallon + 3.78 Litre = 7.56 Liter Check
	 */
	@Test
	public void givenOneGallonAndThreePointSevenEightLitersWhenAdded_ShouldReturnSevenPointFiveSixLiters() {
		double value1 = quantityMeasurement.unitAddition(VolumeUnits.GALLON, 1.0, VolumeUnits.LITRE, 3.78);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITRE, 7.56);
		Assert.assertEquals(value1, value2, 0);
	}
}