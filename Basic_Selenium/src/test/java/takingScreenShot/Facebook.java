package takingScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Facebook 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		File source = tks.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Hp\\Desktop\\screenshot.png");
		
		FileHandler.copy(source, destination);
		
//		System.out.println("Screenshot saved to: " + destination.getAbsolutePath());
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		File source1 = loginbtn.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\\\Users\\\\Hp\\\\Desktop\\\\screenshot1.png");
		
		FileHandler.copy(source1, destination1);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
