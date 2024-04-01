package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		String currentDateAndTime = LocalDateTime.now().toString().replace(':', '_');
		System.out.println(currentDateAndTime);
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		  File ref = ts.getScreenshotAs(OutputType.FILE);
		  
		  File imageLocation = new File("./screenshots/demoappsHomepage"+currentDateAndTime+".png");
		  FileHandler.copy(ref, imageLocation);
		
	
	
}
}
