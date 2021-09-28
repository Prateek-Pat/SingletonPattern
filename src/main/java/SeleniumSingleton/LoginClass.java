package SeleniumSingleton;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginClass {

	public SingletonDriver sdriver;
	String currentUrl = "https://www.amazon.in/";

	@BeforeMethod
	public void setUp(){
		
		sdriver = SingletonDriver.getInstance();	
	}
	
	@Test
	public void launchApp(){
			
		SingletonDriver.driver.manage().window().maximize();
		SingletonDriver.driver.get("https://amazon.in");
		String actualUrl = SingletonDriver.driver.getCurrentUrl();		
		Assert.assertEquals(actualUrl, currentUrl);
	}

	@AfterMethod
	public void tearDown(){			
		SingletonDriver.driver.close();	
	}
}
