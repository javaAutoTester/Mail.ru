package by.htp.driver.mailru.pages;

import javax.naming.OperationNotSupportedException;

import by.htp.driver.mailru.driver.DriverSingleTone2;

public abstract class AbstractPage2 {
	
	protected DriverSingleTone2 driverWrapper;

	public AbstractPage2(DriverSingleTone2 driverWrapper) {
		super();
		this.driverWrapper = driverWrapper;
	}
	
	public abstract void openPage() throws OperationNotSupportedException; 

}
