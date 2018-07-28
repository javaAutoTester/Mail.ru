package by.htp.driver.mailru.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleTone2 {
	
	private static DriverSingleTone2 instance = null;
	private static WebDriver driver = null;
	
	static {
		instance = new DriverSingleTone2();
		initWebDriver();
	}
	
	private DriverSingleTone2() {
		
	}
private static void initWebDriver() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
}

public static void stopWebDriver() {
	driver.close();
	driver = null;
}

	public static DriverSingleTone2 getInstance() {

		return instance;
	}
	
	public void openPage(String url) {
		driver.get(url);
	}
	//here you can create universal method findElement
	public WebElement findByName(String elementName) {
		// TODO Auto-generated method stub
		return driver.findElement(By.name(elementName));
	}
	
}
