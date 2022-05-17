package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
  @Test //5
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }
  @Test //5
  public void test2() {
	  System.out.println("This is test 2 annotation");
  
  }
  @BeforeClass //executed 3
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass //7
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest // executed second - 2
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest //8
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {//executed first - 1
	  System.out.println("This is before suit annotation");
  }

  @AfterSuite //9
  public void afterSuite() {
	  System.out.println("This is after suit annotation");
  }

}
