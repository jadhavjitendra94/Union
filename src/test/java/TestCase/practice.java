package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Union\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement upload= driver.findElement(By.cssSelector("*[name=\"upfile\"]"));
		WebElement press=driver.findElement(By.cssSelector("*[type=\"submit\"]"));
		
		upload.sendKeys("D:\\winko\\winko1\\jitu");
		Thread.sleep(2000);
		press.click();
		Thread.sleep(2000);
		
		
		
		
	}
}

	





	




