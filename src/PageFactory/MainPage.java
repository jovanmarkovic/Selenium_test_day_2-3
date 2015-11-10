package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.MainPage;

public class MainPage {
	
	protected WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public MainPage navigateToMainPage() {
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		return new MainPage(driver);
		
	}

}
