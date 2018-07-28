package by.htp.driver.mailru.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SentLettersPage extends AbstractPage {

	public static final By LETTERS_LIST = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[4]/div/div[5]/div/div[2]/div");
	private static final By EXIT_BUTTON = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr/td[2]/div[1]/table/tbody/tr/td[2]/a");
	public SentLettersPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}

	public List<WebElement> getLettersList() {
		List<WebElement> letterList = driver.findElements(LETTERS_LIST);	
	return letterList;
	}
	
	public Boolean letterContains(List<WebElement> letterList, String content) {
		Boolean boo = false;
		for (Iterator iterator = letterList.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if(webElement.getText().contains(content)) {
				boo=true;
				System.out.println("Foud Text:  "+ webElement.getText() );
			}
		}
		return boo;
	}
	
	public void exitMailBox() {
		driver.findElement(EXIT_BUTTON).click();
	} 
}
