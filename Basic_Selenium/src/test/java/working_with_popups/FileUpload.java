package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		
		Thread.sleep(2000);
		
		WebElement file = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(file).build().perform();
		
		file.sendKeys("file:///E:/Software%20testing/BASIC_SELENIUM.pdf");
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
