package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://www.isibang.ac.in/~adean/infsys/cal/time.html";
		driver.get(url);
		Thread.sleep(25000);
        String xpath=getX(2,3);
        WebElement element=driver.findElement(By.xpath(xpath));
        System.out.println(element.getText());
	}
	
	public static String getX(int row,int col)
    {
        String x="//b[contains(text(), 'B.Math (Hons.) I,  Semester I')]/ancestor::tr/following-sibling::tr[1]//table//tr["+row+"]/td["+col+"]";
        return x;
    }

}
