package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		Select selDay = new Select(dayDD);
		selDay.selectByIndex(21);
		
		Thread.sleep(2000);
		
		WebElement monDD = driver.findElement(By.id("month"));
		Select selMon = new Select(monDD);
		selMon.selectByValue("5");
		
		
		Thread.sleep(2000);
		
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select selYear = new Select(yearDD);
		selYear.selectByVisibleText("2003");
		
		String selectedday = selDay.getFirstSelectedOption().getText();
		String selectedmonth = selMon.getFirstSelectedOption().getText();
		String selectedyear = selYear.getFirstSelectedOption().getText();
		
		System.out.println(selectedday + selectedmonth + selectedyear);
		
		List<WebElement> months = selMon.getOptions();
		for(WebElement i: months)
		{
			System.out.println(i.getText());
		}
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		

	}

}
