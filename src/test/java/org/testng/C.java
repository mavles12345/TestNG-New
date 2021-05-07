package org.testng;

import org.testng.annotations.Test;

public class C {

	@Test(priority = 1)
	private void tc6() {
		System.out.println("TC6 -"+Thread.currentThread().getId());

	}

	@Test(groups="regression")
	private void tc7() {
		System.out.println("TC7 -"+Thread.currentThread().getId());

	}

	@Test(groups="smoke")
	
	private void tc8() {
		System.out.println("TC8 -"+Thread.currentThread().getId());

	}
	

	@Test(groups = "regression")
	private void tc24() throws InterruptedException {
		System.out.println("TC24 -"+Thread.currentThread().getId());

	}
	@Test(groups="sanity")
	private void tc25() {
		System.out.println("TC25 -"+Thread.currentThread().getId());


}

}