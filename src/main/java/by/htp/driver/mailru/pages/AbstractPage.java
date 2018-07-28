package by.htp.driver.mailru.pages;

import org.openqa.selenium.WebDriver;

import by.htp.driver.mailru.driver.DriverSingleton;

public abstract class AbstractPage {
	
	protected WebDriver driver;

	public AbstractPage() {
		super();
		this.driver = DriverSingleton.getDriver();
	}
	
	public abstract void openPage();

}
