/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 18-Apr-2022
 */
package com.quantity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {

	private Quantitymeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new Quantitymeasurement();
	}

	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given0Feetand1Feet_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	@Test
	public void givenNullFeetValue_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		Assert.assertNotNull(value1);
	}

	@Test
	public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
		Assert.assertSame(quantityMeasurement, quantityMeasurement);
	}

	@Test
	public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
	}

	@Test
	public void giveSameTypesOfObjects_shouldReturnEqual() {
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		Assert.assertEquals(quantityMeasurement1, quantityMeasurement1);
	}

	@Test
	public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		QuantityTest quantityTest = new QuantityTest();
		Assert.assertNotEquals(quantityMeasurement1, quantityTest);
	}

	@Test
	public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		double value2 = quantityMeasurement1.unitComparison(Units.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 0.0);
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		double value2 = quantityMeasurement1.unitComparison(Units.FEET, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * check for 0 inch and 0 inch
	 */
	@Test
	public void given0Inchand0Inch_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * 0 inch and 1 inch not equal
	 */
	@Test
	public void given0Inchand1Inch_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * comparing the object with null
	 */
	@Test
	public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
		Assert.assertNotNull(quantityMeasurement);
	}

	/*
	 * reference check
	 */
	@Test
	public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
		Assert.assertSame(quantityMeasurement, quantityMeasurement);
	}

	@Test
	public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
		Quantitymeasurement quantityMeasurement1 = new Quantitymeasurement();
		Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
	}

	/*
	 * type check for two objects
	 */
	@Test
	public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnTrue() {
		QuantityTest quantityTest = new QuantityTest();
		Assert.assertNotEquals(quantityTest, quantityMeasurement);
	}

	/*
	 * value equality check
	 */
	@Test
	public void givenTwoSameValuesOfDifferentObjects_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
		double value2 = new Quantitymeasurement().unitComparison(Units.INCH, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void givenTwoDifferentValuesOfDifferentObjects_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 0.0);
		double value2 = new Quantitymeasurement().unitComparison(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

//UC2
	/*
	 * TC 1.11 for comparing lengths of 2 yard variables
	 */
	@Test
	public void given0YardAnd0YardWhenCompared_shouldReturnTrue() {
		double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given0YardAnd1YardWhenCompared_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparison(Units.YARD, 0.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.12 for comparing lengths 1: 3ft = 1yd
	 */
	@Test
	public void given3FeetAnd1YardWhenCompared_shouldReturnTrue() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 3.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.13 for comparing lengths 2: 1 ft != 1 yd
	 */
	@Test
	public void given1FeetAnd1YardWhenCompared_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparison(Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.13 for comparing lengths 3: 1 inch != 1 yard
	 */
	@Test
	public void given1InchAnd1YardWhenCompared_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 1.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.14 for comparing lengths 4: 1 yard = 36 inch
	 */
	@Test
	public void given1YardAnd36InchWhenCompared_shouldReturnTrue() {
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 36.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.15 for comparing lengths 5: 36 in = 1 yd
	 */
	@Test
	public void given36InchAnd1YardWhenCompared_shouldReturnTrue() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 36.0);
		double value2 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.16 for comparing lengths 6: 1 yd = 3 ft
	 */
	@Test
	public void given1Yard3FeetWhenCompared_shouldReturnTrue() {
		double value1 = quantityMeasurement.unitComparison(Units.YARD, 1.0);
		double value2 = quantityMeasurement.unitComparison(Units.FEET, 3.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	// UC3
	/*
	 * For comparing lengths 2 inch = 5 cm variables
	 */
	@Test
	public void given1CMAnd1CMWhenCompared_shouldReturnTrue() {
		double value2 = quantityMeasurement.unitComparison(Units.CM, 5.0);
		double value1 = quantityMeasurement.unitComparison(Units.CM, 5.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

//UC4
	// ADD TWO LENGTH IN INCHES
	@Test
	public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() {
		double value1 = quantityMeasurement.unitComparison(Units.INCH, 2.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 2.0);
		Assert.assertEquals(4, value1 + value2, 0.0);

	}

	// UC4
	/*
	 * TC 1.24 to add two lengths in inches 2 in + 2 in = 4 in
	 */
	@Test
	public void given2InchAnd2Inch_WhenAdded_ShouldReturnCorrect() {
		double value1 = quantityMeasurement.unitAddition(Units.INCH, 2.0, Units.INCH, 2.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 4);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.25 to add two lengths in inches 1 ft + 2 in = 14 in
	 */
	@Test
	public void given1FeetAnd2Inch_WhenAdded_ShouldReturnCorrect() {
		double value1 = quantityMeasurement.unitAddition(Units.FEET, 1.0, Units.INCH, 2.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 14);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/*
	 * TC 1.26 to add two lengths in inches 1 ft + 1 ft = 24 in
	 */
	@Test
	public void given1FeetAnd1Feet_WhenAdded_ShouldReturnCorrect() {
		double value1 = quantityMeasurement.unitAddition(Units.FEET, 1.0, Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparison(Units.INCH, 24);
		Assert.assertEquals(value1, value2, 0.0);
	}
}
