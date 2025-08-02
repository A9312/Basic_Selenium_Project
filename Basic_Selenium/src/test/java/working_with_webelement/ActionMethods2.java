package working_with_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethods2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));
		
		male.click();
		
		String tagofmale = male.getTagName();
		System.out.println(tagofmale);
		
		String valueoftype = male.getAttribute("type");
		System.out.println(valueoftype);
		
		
		Thread.sleep(2000);
		
		if(male.isSelected())
		{
			System.out.println("male is selected");
		}
		else
		{
			System.out.println("gender is not selected");
		}
		
		
		driver.quit();
		
		
		
		
		

	}

}
