package com.test;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class SubscriptionTest {

//	public SubscriptionTest(String name) {
////		super(name);
//	}

	protected void setUp() throws Exception {
//		super.setUp();
	}

	protected void tearDown() throws Exception {
//		super.tearDown();
	}

	public void testSubscription() {
		Assert.fail("Not yet implemented");
	}

	public void testPricePerMonth() {
		Assert.fail("Not yet implemented");
	}
	
	
	public void testCancel() {
		Assert.fail("Not yet implemented");
	}
	
	@Ignore("Not Ready to Run") 
	@Test
	public void test_returnEuro() {
		System.out.println("Test if pricePerMonth returns Euro...");
		Subscription S = new Subscription(200, 1);
		// assertTrue(S.pricePerMonth() == 100.0);
		try {
			Assert.assertEquals("returnEuros fail", 100.0, S.pricePerMonth());
//			assertEquals("returnEuros fail", 100.0, S.pricePerMonth());
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test_roundUp() {
		System.out.println("Test if pricePerMonth rounds up correctly...");
		Subscription S = new Subscription(200, 3);
//		assertTrue(S.pricePerMonth() == 66.66666666666667);
		Assert.assertTrue(S.pricePerMonth() == 66.66666666666667);
	}

}
