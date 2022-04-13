package selenium; // arjavvirani

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

public class Testing1 {
	
  @Test(dataProvider = "dp")
  public void testDataProvider(Integer n, String s) {
	  System.out.println(n+s);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 1, "m" },
      new Object[] { 2, "k" },
    };
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest  
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }
  
  @Test (dataProvider = "dp1")
  public void test1(Integer a, String b) {
	  System.out.println("Test1");
  }
  
  @Test (groups = "arjav")
  public void test2() {
	  System.out.println("Test2");
  }
  
  @Test
  public void test3() {
	  System.out.println("Test3");
  }

}
