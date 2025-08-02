package web_driver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_navigate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		Navigation nav = driver.navigate();
		
		Thread.sleep(4000);
		nav.back();
		
		Thread.sleep(4000);
		
		nav.forward();
		Thread.sleep(2000);
		
		nav.refresh();
		Thread.sleep(2000);
		
		nav.to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
