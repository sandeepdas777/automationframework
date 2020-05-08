package page;

import org.openqa.selenium.By;

public interface IPage {
	public void click(By b);
	public void enterText(By b, String value);
}
