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

}
