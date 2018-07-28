package by.htp.driver.mailru.steps;

import javax.naming.OperationNotSupportedException;

import by.htp.driver.mailru.driver.DriverSingleTone2;
import by.htp.driver.mailru.entity.User;
import by.htp.driver.mailru.pages.LoginPage2;
import by.htp.driver.mailru.pages.MainPage2;
import by.htp.driver.mailru.pages.UserProfilePage2;

public class Steps2 {
	
private DriverSingleTone2 driverWrapper;

	public Steps2(DriverSingleTone2 driverWrapper) {
	super();
	this.driverWrapper = driverWrapper;
}


	public MainPage2 authorize(String login, String pass){
		LoginPage2 loginPage2 = new LoginPage2(driverWrapper);
		loginPage2.openPage();
		loginPage2.logIn(login, pass);
		MainPage2 mainPage2 = new MainPage2(driverWrapper);
		return mainPage2;
	}
	
	
	public UserProfilePage2 editProfile(User user) {
		UserProfilePage2  page =new UserProfilePage2(driverWrapper); 
		return page;
	}
	
}
