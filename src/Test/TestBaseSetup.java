package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBaseSetup {

	WebDriver driver;
	

	
	@AfterTest
	public void testTearDown(){
		
		driver.quit();
	}

	
}
