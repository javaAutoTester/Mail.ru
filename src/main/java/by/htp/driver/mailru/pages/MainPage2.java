package by.htp.driver.mailru.pages;

import javax.naming.OperationNotSupportedException;

import by.htp.driver.mailru.driver.DriverSingleTone2;

public class MainPage2 extends AbstractPage2{

	public MainPage2(DriverSingleTone2 driverWrapper) {
		super(driverWrapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() throws OperationNotSupportedException {
		throw new OperationNotSupportedException("Only for authorized users");
	}
	
	

}
