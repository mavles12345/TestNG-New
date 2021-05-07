package org.testng2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class B {

	@Test(groups = "smoke")
	private void tc3() {

		System.out.println("TC4:" + Thread.currentThread().getId());

	}

	@Test(groups = "sanity", retryAnalyzer = Failedsecond.class)
	private void tc5() {
		Assert.assertTrue(false);
		System.out.println("TC5:" + Thread.currentThread().getId());

	}

	@Test(groups = "regression")
	private void tc6() {
		System.out.println("TC6:" + Thread.currentThread().getId());

	}

}
