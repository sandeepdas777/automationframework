package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page implements IPage{
	
	WebDriver driver;
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
	}

	public void click(By b) {
		// TODO Auto-generated method stub
		driver.findElement(b).click();
	}

	public void enterText(By b, String value) {
		// TODO Auto-generated method stub
		driver.findElement(b).sendKeys(value);		
	}
	

}
