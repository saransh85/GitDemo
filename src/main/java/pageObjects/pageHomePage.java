package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class pageHomePage {

	
	public WebDriver driver;
	
	By searchBox = By.name("query");

	
	
	
	
	public pageHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	

	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	

	
	
	
}
