package org.testng2;

import org.testng.annotations.Test;

public class C {

	@Test(groups="smoke")
	private void tc7() {

		System.out.println("TC7:" + Thread.currentThread().getId());

	}

	@Test(groups="sanity")
	private void tc8() {
		System.out.println("TC8:" + Thread.currentThread().getId());

	}

	@Test(groups="regression")
	private void tc9() {
		System.out.println("TC9:" + Thread.currentThread().getId());

	}
}
