package org.testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class A {

	WebDriver driver;

	@BeforeClass
	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Eclipse-workspace\\\\POMFramework\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeMethod
	public void loadur() {
		driver.get("https://www.facebook.com/");

	}

	@Test(groups = "regression")

	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("jackmavles@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selvamidiotismine");
		driver.findElement(By.name("login")).click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("current Url:", "https://www.face.com/", url);
		System.out.println(Thread.currentThread().getId());

	}

//	@DataProvider(name = "dataProvide")
//	public Object[][] data() {
//		return new Object[][] {
//
//				{ "selvam", "selvam" }, { "jack", "jack" }, { "mavles", "mavles" }
//
//		};
//
//	}

}
