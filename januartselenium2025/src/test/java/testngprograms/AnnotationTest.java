package testngprograms;

import org.testng.annotations.Test;

import Basiccodes.launchchrome;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
      webdriver = new chromedriver();
	  driver.get("http://amazon.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before the Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after the Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute before the Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute after the Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This will execute before the Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This will execute after the Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will execute before the Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute after the Suite");
  }

}
