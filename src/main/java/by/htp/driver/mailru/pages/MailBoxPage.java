package by.htp.driver.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailBoxPage extends AbstractPage{
	
	private static final By NEW_LETTER = By.cssSelector("a.b-toolbar__btn");
	private static final By SENT_LETTERS = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[1]/div[1]/div/div[2]/a");
	private static final By EXIT_BUTTON = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[2]/a");
	private static final By AUTH_INFO = By.xpath("//*[@id='PH_user-email']");
	public MailBoxPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}

	public void createNewLetter() {
		driver.findElement(NEW_LETTER).click();
	}
	
	public void sentLetters() {
		driver.findElement(SENT_LETTERS).click();
	}
	
	public void exitMailBox() {
		driver.findElement(EXIT_BUTTON).click();
	}
	
	public String getMailBoxURL() {
		return driver.getCurrentUrl().trim();
	}
	
	public String getAuthEmail() {
		return driver.findElement(AUTH_INFO).getText().trim();
	}
	
	
}
