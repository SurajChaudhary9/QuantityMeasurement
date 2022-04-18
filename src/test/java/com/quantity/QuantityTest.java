/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 18-Apr-2022
 */
package com.quantity;

import org.junit.Assert;
import org.junit.Test;

//import junit.Assert;

//Test Case 1.1
public class QuantityTest {
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

//TC 1.1 Values 0 ,1
	@Test
	public void given0Feetand1Feet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

//TC 1.2 Null Check	
	@Test
	public void givenNullFeetValue_shouldReturnFalse() {
		Feet feet = new Feet(0.0);
		Feet feet1 = new Feet(0.0);
		// Optional Assert
//	        Assert.assertFalse(feet.equals(null));
//	        Assert.assertNotNull(feet);
		Assert.assertNotEquals(null, feet);
	}

//TC 1.3 Ref Check
	@Test
	public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
		Feet feet = new Feet(0.0);
		Assert.assertSame(feet, feet);
	}

	@Test
	public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
		Feet feet = new Feet(0.0);
		Feet feet1 = new Feet(0.0);
		Assert.assertNotSame(feet, feet1);
	}

//TC 1.4 Value Check
	@Test
	public void giveSameTypesOfObjects_shouldReturnEqual() {
		Feet feet = new Feet();
		Assert.assertEquals(feet, feet);
	}

	@Test
	public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
		Feet feet = new Feet();
		Inch inch = new Inch();
		Assert.assertNotEquals(feet, inch);
	}

	// TC 1.5 Value Check for equality
	@Test
	public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
		Feet feet = new Feet();
		feet.setValue(3);
		Feet feet1 = new Feet();
		feet1.setValue(3);
		Assert.assertEquals(feet.getValue(), feet1.getValue(), 0.0);
	}

	@Test
	public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
		Feet feet = new Feet();
		feet.setValue(3);
		Feet feet1 = new Feet();
		feet1.setValue(4);
		Assert.assertNotEquals(feet.getValue(), feet1.getValue(), 0.0);
	}
}
