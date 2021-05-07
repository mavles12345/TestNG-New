package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {

	WebDriver driver;

	@BeforeClass
	private void browerlaunch() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-workspace\\POMFramework\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@BeforeMethod
	private void startTime() {
		// Date d = new Date();
		// System.out.println("Start time for this project " + d);
		driver.get("https://www.facebook.com/");
	}

	@Parameters({ "email", "pass" })
	@Test(groups="regression", retryAnalyzer=Falied.class)
	private void tc1(String email, String pass) {
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		String url=driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();
		s.assertEquals("facebook", url.contains("selvam"));
		System.out.println("done");
		s.assertAll();
		System.out.println("Tc1 -"+Thread.currentThread().getId());
		

	}

	@Test(groups = "smoke")
	private void tc2() throws InterruptedException {
		System.out.println("TC2 -"+Thread.currentThread().getId());

	}
	@Test(groups="sanity")
	private void tc21() {
		System.out.println("TC21 -" +Thread.currentThread().getId());

	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println("End time for this project " + d);

	}

	@AfterClass
	private void browserclose() {
		// driver.quit();

	}

}
