package by.htp.driver.mailru.tests;

import org.testng.annotations.Test;

import by.htp.driver.mailru.pages.MainPage2;

public class LoginTest2 extends BaseTest2 {
	
	@Test
	public void testLogIn() {
		MainPage2 page = steps.authorize("q", "q");
//		driver.openPage("http://quizful.net");
	}

}
