package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Kite']")	private	WebElement	kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")	private	WebElement	zerodhaLogo;
	
	@FindBy(xpath = "//input[@label=\"User ID\"]")private WebElement UsernameTextBox;
	@FindBy(xpath = "(//input[@dynamicwidthsize=\"8\"])[2]")private WebElement passwordtextBox;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement loginbtn;
	@FindBy(xpath="//input[@label=\"PIN\"]")private WebElement pintextbox;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement continuebtn;
	@FindBy(xpath = "//span[text()=\"Akshay\"]")private WebElement nikname;
	
	
	public	LoginPage()
	{
	PageFactory.initElements(driver,	this);
	}
	public String GetTitle()
	{
		return driver.getTitle();
	}
	public	boolean	verifyKiteLogo()
	{
	     return kiteLogo.isDisplayed();
	}
	public	boolean	verifyZerodhaLogo()
	{
	return zerodhaLogo.isDisplayed();
	}
	public String LoginToApp() throws InterruptedException
	{
		UsernameTextBox.sendKeys("AOZ403");
		Thread.sleep(1000);
		passwordtextBox.sendKeys("Akshay@20");
		Thread.sleep(1000);
		loginbtn.click();
		Thread.sleep(1000);
		pintextbox.sendKeys("202020");
		Thread.sleep(1000);
		continuebtn.click();
		Thread.sleep(1000);
		return nikname.getText();
		
		
		
		
		
	}
	}


