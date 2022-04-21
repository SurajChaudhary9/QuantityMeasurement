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
	 * Rigorous Test :- For Getting 0 Gallon And 0 Gallon Equality Check
	 */
	@Test
	public void given0Gallonand0GallonWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}
}