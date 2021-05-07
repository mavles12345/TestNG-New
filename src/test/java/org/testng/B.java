package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {

	WebDriver driver;

	@Test
	private void tc3() {
		System.out.println("TC3 -"+Thread.currentThread().getId());

	}

	
	@Test(dataProvider="sampledata", groups="smoke")
	private void tc4(String email1, String pass1) {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-workspace\\POMFramework\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(email1);
		driver.findElement(By.id("pass")).sendKeys(pass1);
		driver.findElement(By.name("login")).click();
		System.out.println("TC4 -" +Thread.currentThread().getId());

	}

	@Test(enabled = false)
	private void tc5() {
		System.out.println("TC5");

	}

	@DataProvider(name = "sampledata")
	private Object[][] data() {
		return new Object[][] {

				{ "jackmavles", "selvamidiotismine" }, { "mavles", "12345" }, { "viji", "12345" }

		};

	}
	
	@Test(groups = "smoke")
	private void tc22() throws InterruptedException {
		System.out.println("TC22 "+Thread.currentThread().getId());

	}
	@Test(groups="sanity")
	private void tc23() {
		System.out.println("TC23 "+Thread.currentThread().getId());


}}
