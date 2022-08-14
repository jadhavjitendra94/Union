package Pages;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase{
	@FindBy(xpath = "//span[@class=\"user-id\"]")private WebElement userid;
	@FindBy(xpath = "//h4[@class=\"username\"]")private WebElement username;
	@FindBy(xpath="//div[@class=\"email\"]")private WebElement emailid;
	@FindBy(xpath="//button[text()=\"Start investing \"]")private WebElement startinvestingbtn;
	@FindBy(xpath="(//input[@icon=\"search\"])[2]")private WebElement serchproduct;
	@FindBy(xpath="//ul[@class=\"omnisearch-results\"]//li")private WebElement Autosuggation;
	@FindBy(xpath="//li[@class=\"search-result-item\"][3]")private WebElement product;
	@FindBy(xpath = "//button[text()=\"Create GTT \"]")private WebElement creatbtn;
	@FindBy(xpath="//input[@label=\"Trigger price\"]")private WebElement triggerprize;
	@FindBy(xpath="//input[@label=\"Qty.\"]")private WebElement qty;
	@FindBy(xpath = "//input[@label=\"Price\"]")private WebElement prize;
	@FindBy(xpath = "//button[normalize-space(text())=\"Cancel\"]")private WebElement cancelbtn;
	
	public DashBoardPage() throws IOException, InterruptedException
	{
		PageFactory.initElements(driver, this);
		
	}
	public String Verifyusername() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		return username.getText();
	}
	public String Verifyemailid() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		return emailid.getText();
	}
	public void PlaceGTTorder() throws InterruptedException
	{
		startinvestingbtn.click();
		Thread.sleep(1000);
		serchproduct.sendKeys("tcs");
		Actions act=new Actions(driver);
		act.moveToElement(Autosuggation).build().perform();
		for(int a=0;a<4;a++)
		{
			Thread.sleep(1000);
			act.sendKeys(Keys.DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
//		product.click();
//		Thread.sleep(1000);
		creatbtn.click();
		Thread.sleep(1000);
		triggerprize.clear();
		Thread.sleep(1000);
		triggerprize.sendKeys("1450");
		Thread.sleep(1000);
		qty.clear();
		Thread.sleep(1000);
		qty.sendKeys("100");
		Thread.sleep(1000);
		prize.clear();
		Thread.sleep(1000);
		prize.sendKeys("1500");
		Thread.sleep(1000);
		cancelbtn.click();
		
		
		
		
		
		
		
		
		
		
	}
	

}
