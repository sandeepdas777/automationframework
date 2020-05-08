package Demo;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="file:///C:/Users/DAS/eclipse-workspace/Automation/src/main/resources/cities.html";
		driver.get(url);
		WebElement dropdown=driver.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		s.selectByIndex(2);
/*		s.selectByVisibleText("MUM");
		s.selectByValue("BLR");
		System.out.println(s.getFirstSelectedOption().getText());
		
		List<WebElement> list=s.getOptions();
		for(int i=0; i<list.size;i++)
		{
			String txt=list.get(i).getText();
			
		}
		*/
	}

}
