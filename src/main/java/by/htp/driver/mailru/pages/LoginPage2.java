package by.htp.driver.mailru.pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.WebElement;

import by.htp.driver.mailru.driver.DriverSingleTone2;

public class LoginPage2 extends AbstractPage2 {
private static final String URL = "http://www.quizful.net/LoginAction.loginForm";
private WebElement loginField;
private WebElement passField;
private WebElement submit;
	public LoginPage2(DriverSingleTone2 driverWrapper) {
		super(driverWrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage(){
		driverWrapper.openPage(URL);	
	}
 
	public void logIn(String login, String pass) {
		loginField = driverWrapper.findByName("loginForm.login");
		loginField.sendKeys(login);
		passField = driverWrapper.findByName("loginForm.password");
		passField.sendKeys(pass);
		submit = driverWrapper.findByName("ok");
		submit.click();
	}
	
}
