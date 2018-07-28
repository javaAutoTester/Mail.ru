package by.htp.driver.mailru.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleton {

	private static WebDriver driver;

	static {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	private DriverSingleton() {

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
		driver = null;
	}
}
