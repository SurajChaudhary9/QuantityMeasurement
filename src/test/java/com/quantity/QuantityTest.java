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

		// Optional Assert
//	        Assert.assertFalse(feet.equals(null));
//	        Assert.assertNotNull(feet);
		Assert.assertNotEquals(null, feet);
	}
}