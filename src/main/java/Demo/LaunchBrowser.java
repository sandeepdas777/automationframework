package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://www.google.com/";
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Power Bank");
		List<WebElement> list= driver.findElements(By.cssSelector("div.aajZCb ul li"));
        System.out.println(list.size());
        for( int i=0;i< list.size();i++)
        {
            WebElement e=list.get(i);
            System.out.println(i+" "+e.getText());
        }
		List<WebElement> list2= driver.findElements(By.partialLinkText("o"));
        System.out.println(list2.size());
        for( int i=0;i< list2.size();i++)
        {
            WebElement e=list2.get(i);
            System.out.println(i+" "+e.getText());
        }
		driver.findElement(By.linkText("gmail")).click();

		
	}

}
