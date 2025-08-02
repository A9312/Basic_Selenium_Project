package working_with_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pass"));
		
		Thread.sleep(2000);
		
		password.sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("F")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
