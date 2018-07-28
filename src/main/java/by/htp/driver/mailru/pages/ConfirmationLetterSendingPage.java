package by.htp.driver.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationLetterSendingPage extends AbstractPage {
	private static final By EXIT_BUTTON = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[2]/a");

	public ConfirmationLetterSendingPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}
     public String getURL() {
    	 return driver.getCurrentUrl();
     }
	public void exitMailBox() {
		driver.findElement(EXIT_BUTTON).click();
	}
	
}
