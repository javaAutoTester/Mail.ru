package by.htp.driver.mailru.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import by.htp.driver.mailru.driver.DriverSingleton;
import by.htp.driver.mailru.steps.Steps;

public class BaseTest {
	
	protected WebDriver driver;
	protected Steps steps;
	
	@BeforeTest
	public void initDriver() {
		driver = DriverSingleton.getDriver();
		steps = new Steps();
		System.out.println("@BeforeTest+initDriver()");
	}

	@AfterTest
	public void stopDriver() {
		DriverSingleton.quitDriver();
		System.out.println("@AfterTest+stopDriver()");
	}
	
	
}
