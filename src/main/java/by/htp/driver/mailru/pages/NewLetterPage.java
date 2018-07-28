package by.htp.driver.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewLetterPage extends AbstractPage{

	private static final By LETTER_TO = By.cssSelector("textarea.js-input:nth-child(6)");
	private static final By SUBJECT = By.cssSelector(".compose-head__row_nohr > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)");
//	private static final String FRAME_NAME = "toolkit-153148202098645composeEditor_ifr_name";
//	private static final By FRAME = By.cssSelector("#toolkit-153148444472644composeEditor_ifr");
	private static final By FRAME = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[5]/div[2]/table/tbody/tr/td[1]/div[3]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/span/table/tbody/tr/td/iframe");
	private static final By TEXT_FIELD = By.id("tinymce");
//	private static final By SEND_BUTTON = By.cssSelector("div.b-toolbar__item_:nth-child(1) > div:nth-child(1) > span:nth-child(1)");
	private static final By SEND_BUTTON = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[1]/div");
	
	public NewLetterPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}
	
	public void letterTo(String email) {
		driver.findElement(LETTER_TO).sendKeys(email);
	}
	public void fillSubject(String subject) {
		driver.findElement(SUBJECT).sendKeys(subject);
	}
    public void insertMessage(String message) {
    	System.out.println("driver.getWindowHandle(): "+driver.getWindowHandle());
    	WebElement elem = driver.findElement(FRAME);
//    	driver.switchTo().frame(FRAME_NAME);
    	driver.switchTo().frame(elem);
    	driver.findElement(TEXT_FIELD).sendKeys(message);
    	driver.switchTo().defaultContent();
    }
    public void sendLetter() {
    	driver.findElement(SEND_BUTTON).click();
    }
}
