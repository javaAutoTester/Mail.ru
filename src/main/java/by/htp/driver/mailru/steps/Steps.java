package by.htp.driver.mailru.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.htp.driver.mailru.driver.DriverSingleton;
import by.htp.driver.mailru.pages.MailBoxPage;
import by.htp.driver.mailru.pages.MailRuHomePage;
import by.htp.driver.mailru.pages.NewLetterPage;
import by.htp.driver.mailru.pages.SentLettersPage;

public class Steps {
	
	private WebDriver driver;

	public Steps() {
		super();
		this.driver = DriverSingleton.getDriver();
	}
	
	public void logIn(String login, String pass){
		MailRuHomePage homePage = new MailRuHomePage();
		homePage.openPage();
		homePage.fillInLogin(login);
		homePage.fillInPass(pass);
		homePage.unchekRememberAuth();
		homePage.pressLoginButton();
	}
	
	public void sendLetter(String email, String subject, String message) {
		MailBoxPage boxPage = new MailBoxPage();
		boxPage.createNewLetter();
		NewLetterPage letterPage = new NewLetterPage();
		letterPage.letterTo(email);
		letterPage.fillSubject(subject);
		letterPage.insertMessage(message);
		letterPage.sendLetter();
	}
	
	public SentLettersPage goToSentLetters() {
		MailBoxPage boxPage = new MailBoxPage();
		boxPage.sentLetters();
		SentLettersPage sentLetters = new SentLettersPage();
		return sentLetters;
	}

	public Boolean sentLetterContains(SentLettersPage sentLettersPage, String content) {
		List<WebElement> letterList = sentLettersPage.getLettersList();
		return sentLettersPage.letterContains(letterList, content);
	}
	
}
