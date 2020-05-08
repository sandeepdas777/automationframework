package testdata;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dp {

  @DataProvider
  public Object[][] dp() {
	  System.out.println("Data Provider");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
