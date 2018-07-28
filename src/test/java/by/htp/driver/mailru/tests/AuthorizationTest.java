package by.htp.driver.mailru.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import by.htp.driver.mailru.pages.MailBoxPage;

public class AuthorizationTest extends BaseTest {
	
	private static final String LOGIN = "tathtp";
	private static final String PASS = "Klopik123";
	private static final String MAIL_BOX_URL = "https://e.mail.ru/messages/inbox/?back=1";
	private static final String AUTH_EMAIL = "tathtp@mail.ru";
	
	@Test
	public void oneCanAuthorize() throws InterruptedException{
//		Steps steps = new Steps(driver); //look up BaseTest
		steps.logIn(LOGIN, PASS);
		
		Thread.sleep(3000);
		
		MailBoxPage boxPage = new MailBoxPage();
		String actualURL = boxPage.getMailBoxURL();
		String actualAuthEmail = boxPage.getAuthEmail();
		boxPage.exitMailBox();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualURL, MAIL_BOX_URL);
		softAssert.assertEquals(actualAuthEmail, AUTH_EMAIL);
		softAssert.assertAll();
	}
	
	
	
}
