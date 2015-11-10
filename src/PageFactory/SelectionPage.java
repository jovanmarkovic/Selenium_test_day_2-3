package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelectionPage {
	
	protected WebDriver driver;
	public SelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath=".//*[@id='ui-id-2']")
	WebElement selectionTab;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[1]")
	WebElement no1;

	@FindBy(xpath=".//*[@id='selectable_grid']/li[2]")
	WebElement no2;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[3]")
	WebElement no3;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[4]")
	WebElement no4;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[5]")
	WebElement no5;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[6]")
	WebElement no6;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[7]")
	WebElement no7;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[8]")
	WebElement no8;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[9]")
	WebElement no9;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[10]")
	WebElement no10;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[11]")
	WebElement no11;
	
	@FindBy(xpath=".//*[@id='selectable_grid']/li[12]")
	WebElement no12;

	public void select1by1() {
		
		selectionTab.click();
		no1.click();
		no2.click();
		no3.click();
		no4.click();
		no5.click();
		no6.click();
		no7.click();
		no8.click();
		no9.click();
		no10.click();
		no11.click();
		no12.click();
	}
	
	public void multiSelect() {
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL);
		builder.click(no1).perform();
		builder.click(no2).perform();
		builder.click(no3).perform();
		builder.click(no4).perform();
		builder.click(no5).perform();
		builder.click(no6).perform();
		builder.click(no7).perform();
		builder.click(no8).perform();
		builder.click(no9).perform();
		builder.click(no10).perform();
		builder.click(no11).perform();
		builder.keyUp(Keys.CONTROL);
	}
	
	public String captionNo1() {
		
		String str1 = no1.getText();
		System.out.println(str1);
		return str1;
		
	}
	
	public String captionNo2() {
		
		String str2 = no2.getText();
		System.out.println(str2);
		return str2;
		
	}
	
	public String captionNo3() {
		
		String str3 = no3.getText();
		System.out.println(str3);
		return str3;
		
	}
	
	public String captionNo4() {
		
		String str4 = no4.getText();
		System.out.println(str4);
		return str4;
		
	}
	
	public String captionNo5() {
		
		String str5 = no5.getText();
		System.out.println(str5);
		return str5;
		
	}
	
	public String captionNo6() {
		
		String str6 = no6.getText();
		System.out.println(str6);
		return str6;
		
	}
	
	public String captionNo7() {
		
		String str7 = no7.getText();
		System.out.println(str7);
		return str7;
		
	}
	
	public String captionNo8() {
		
		String str8 = no8.getText();
		System.out.println(str8);
		return str8;
		
	}
	
	public String captionNo9() {
		
		String str9 = no9.getText();
		System.out.println(str9);
		return str9;
		
	}
	
	public String captionNo10() {
		
		String str10 = no10.getText();
		System.out.println(str10);
		return str10;
		
	}
	
	public String captionNo11() {
		
		String str11 = no11.getText();
		System.out.println(str11);
		return str11;
		
	}
	
	public String captionNo12() {
		
		String str12 = no12.getText();
		System.out.println(str12);
		return str12;
		
	}
	
	
	/*public void compareText(String element,String number){
		
		Assert.assertEquals(captionNo1(), number);

	};*/
	
		
	public SelectionPage test1(){
		Assert.assertEquals(captionNo1(),"1");
		Assert.assertEquals(captionNo2(),"2");
		Assert.assertEquals(captionNo3(),"3");
		Assert.assertEquals(captionNo4(),"4");
		Assert.assertEquals(captionNo5(),"5");
		Assert.assertEquals(captionNo6(),"6");	
		Assert.assertEquals(captionNo7(),"7");
		Assert.assertEquals(captionNo8(),"8");
		Assert.assertEquals(captionNo9(),"9");
		Assert.assertEquals(captionNo10(),"10");
		Assert.assertEquals(captionNo11(),"13");
		Assert.assertEquals(captionNo12(),"12");
		return new SelectionPage(driver);
		}
}
