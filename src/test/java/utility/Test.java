package utility;


import org.testng.annotations.BeforeSuite;

import testdata.Dp;

import org.testng.annotations.AfterSuite;

public class Test extends Dp{
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
