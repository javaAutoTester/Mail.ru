package by.htp.driver.mailru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRuHomePage extends AbstractPage{
	
	private static final String HOME_PAGE_URL = "https://mail.ru/";
	private static final By LOGIN_FIELD = By.xpath("//*[@id=\"mailbox:login\"]");
	private static final By PASS_FIELD = By.xpath("//*[@id=\"mailbox:password\"]");
	private static final By REMEMBER_AUTH = By.xpath("//*[@id=\"mailbox:saveauth\"]");
	private static final By LOGIN_BUTTON = By.xpath("//*[@id=\"mailbox:submit\"]");
	
	public MailRuHomePage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() {
		driver.get(HOME_PAGE_URL);
	}

	
    public void fillInLogin(String login) {
    	driver.findElement(LOGIN_FIELD).sendKeys(login);
    }
    public void fillInPass(String pass) {
    	driver.findElement(PASS_FIELD).sendKeys(pass);
    }
    public void unchekRememberAuth() {
    	driver.findElement(REMEMBER_AUTH).click();
    }
    public void pressLoginButton() {
    	driver.findElement(LOGIN_BUTTON).click();
    }
}
