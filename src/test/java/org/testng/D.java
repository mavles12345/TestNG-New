package org.testng;

import org.testng.annotations.Test;

public class D {
	
	@Test
	private void AZ1() {
		System.out.println("Amazon 1 :" +Thread.currentThread().getId());

	}
	
	@Test
	private void AZ2() {
		System.out.println("Amazon 2 :" +Thread.currentThread().getId());

	}
	
	@Test
	private void AZ3() {
		System.out.println("Amazon 3 :" +Thread.currentThread().getId());

	}

}
