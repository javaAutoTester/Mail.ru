package by.htp.driver.mailru.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import by.htp.driver.mailru.driver.DriverSingleTone2;
import by.htp.driver.mailru.steps.Steps2;
import by.htp.driver.mailru.steps.Steps;

public abstract class BaseTest2 {
	protected DriverSingleTone2 driverWrapper;
	protected Steps2 steps;
	
@BeforeTest
public void initDriver() {
	driverWrapper = driverWrapper.getInstance();
	steps = new Steps2(driverWrapper);
}

@AfterTest
public void closeDriver() {
	driverWrapper.stopWebDriver();
}
	
}
