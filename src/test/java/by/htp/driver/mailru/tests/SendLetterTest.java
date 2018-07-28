package by.htp.driver.mailru.tests;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.htp.driver.mailru.pages.ConfirmationLetterSendingPage;
import by.htp.driver.mailru.pages.MailBoxPage;
import by.htp.driver.mailru.pages.SentLettersPage;
import by.htp.driver.mailru.steps.Steps;

public class SendLetterTest extends BaseTest {
	// private static final String E_MAIL_TO_SEND ="sviatlana.zakharenka@gmail.com";
	private static final String E_MAIL_TO_SEND = "kazutov@tut.by";
	private static final String SUBJECT = "Hi from Max";
//	private static final String MESSAGE = "Hi from Max";
	private static final String MESSAGE = (new Date()).toString();
	private static final String LOGIN = "tathtp";
	private static final String PASS = "Klopik123";
	private static final String CONFIRMATION_PAGE_URL = "https://e.mail.ru/sendmsgok";

	@BeforeMethod
	public void loginBefore() throws InterruptedException {
		steps.logIn(LOGIN, PASS);
	}

	@Test(priority = '1')
	public void letterIsSentCorrectly() {
		System.out.println("@Test(priority='1')");
		SentLettersPage sentLetters = steps.goToSentLetters();
		Boolean boo = steps.sentLetterContains(sentLetters, MESSAGE);
		sentLetters.exitMailBox();
		Assert.assertTrue(boo);
	}

	@Test(priority = '0')
	public void oneCanSendLetter() {
		System.out.println("@Test(priority='0')");
		steps.sendLetter(E_MAIL_TO_SEND, SUBJECT, MESSAGE);
		ConfirmationLetterSendingPage confirmationLetterSendingPage = new ConfirmationLetterSendingPage();
		String actualURL = confirmationLetterSendingPage.getURL();
		confirmationLetterSendingPage.exitMailBox();
		Assert.assertTrue(actualURL.trim().contains(CONFIRMATION_PAGE_URL));
	}

}
