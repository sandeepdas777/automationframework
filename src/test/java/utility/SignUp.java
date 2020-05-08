package utility;

import org.testng.annotations.Test;

import page.SearchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SignUp {
	WebDriver driver;
  @Test
  public void googleSignUp() {
	  SearchPage searchPage = new SearchPage(driver);
	  searchPage.clickSignIn();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://www.google.com/";
		driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
