package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage {
	
	protected WebDriver driver;
	
	@FindBy(xpath=".//*[@id='slider-range-max']/a")
	WebElement slider;
	
	public SliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	public void moveSlider() throws InterruptedException{
		
		Actions navigateSlider = new Actions(driver);
		navigateSlider.dragAndDropBy(slider, -100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);
		navigateSlider.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(1000);

		
	}
}
