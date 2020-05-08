package test;

import org.testng.annotations.Test;

import page.SearchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Search extends utility.Test{
	WebDriver driver;
  @Test(dataProvider="dp")
  public void searchGoogle(Integer i, String s) {
	  System.out.println("Test " + i +" "+s);
	  SearchPage searchpage =new SearchPage(driver);
	  searchpage.search(s);
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
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test");
  }

}
