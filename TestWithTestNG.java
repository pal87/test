package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestWithTestNG {
  @Test//(dataProvider = "dp")
  public void f () {
	  System.out.println("Inside @test1");
  }
  
  @Test//(dataProvider = "dp")
  public void f1 () {
	  System.out.println("Inside @test1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside @AfterMethod");
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside @Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside @After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Inside @Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside @After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside @Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside @After Suite");
  }

}
