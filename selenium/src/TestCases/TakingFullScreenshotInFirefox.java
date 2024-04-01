package TestCases;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;

public class TakingFullScreenshotInFirefox {

		public static void main(String[] args) throws Throwable {
//			FirefoxDriver driver=new FirefoxDriver();
//			driver.get("http://www.amazon.in/");
//			driver.manage().window().maximize();
//			
//			Thread.sleep(3000);
//			File temp=driver.getFullPageScreenshotAs(OutputType.FILE);
//			String time=LocalDateTime.now().toString().replace(':', '_');
//			File location=new File("./screenshots/fire"+time+".png");
//			
//			FileHandler.copy(temp, location);
//			
//			Thread.sleep(3000);
//			driver.quit();
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.amazon.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			HasFullPageScreenshot shot=(HasFullPageScreenshot)driver;
			
			File temp=shot.getFullPageScreenshotAs(OutputType.FILE);
			String time=LocalDateTime.now().toString().replace(':', '_');
			File location=new File("./screenshots/fire"+time+".png");
			
			FileHandler.copy(temp, location);
			
			Thread.sleep(3000);
			driver.quit();
		}

	}
