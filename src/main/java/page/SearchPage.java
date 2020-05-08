package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Page{

	WebDriver driver;
	By SignInButton=By.id("gb_70");
	By searchBox=By.name("q");
	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickSignIn() {
		super.click(SignInButton);
	}
	public void search(String value)
	{
		super.enterText(searchBox, value);
	}
}
