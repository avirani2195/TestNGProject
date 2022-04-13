package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority = 1, groups = "arjav")
	public void createuser() { 
		System.out.println("Hello user");
		System.out.println("before assertion"); 
		Assert.assertEquals("abc", "abc");
		System.out.println("after assertion");
		Assert.assertTrue(3>2, "verifying Element"); //Regular Assert
	}
  
	@Test (priority = 2, dependsOnMethods = "createuser")
	public void edituser() { 
	  	System.out.println("we are in edit page");
		System.out.println("before assertion"); 
		softAssert.assertTrue(2>3, "Verifying Element"); 
		System.out.println("after assertion"); 
		softAssert.assertAll(); //similar to error collector like try and catch
	}
  
	@Test (priority = 3, dependsOnMethods = "edituser")
	public void deleteuser() { 
	  	System.out.println("we are in delete page");
		System.out.println("before assertion"); 
		softAssert.assertTrue(2>3, "Verifying Element"); 
		System.out.println("after assertion"); 
		softAssert.assertEquals("abc", "abc");
		System.out.println("after 2nd assertion");
		softAssert.assertAll();
	}
  
}
