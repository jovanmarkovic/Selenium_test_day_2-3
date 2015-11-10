package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.SliderPage;

public class TestSlider {
	
	WebDriver driver;
	SliderPage objSlide;
	
	@BeforeTest
	public void setup() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/slider/");
		Thread.sleep(2000);
		
	}

	@Test
	public void test_slide() throws InterruptedException{
		
		objSlide = new SliderPage(driver);
		objSlide.moveSlider();
			
		}
}
