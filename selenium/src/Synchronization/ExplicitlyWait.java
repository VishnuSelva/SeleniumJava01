package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class ExplicitlyWait {

		public static void main(String[] args) {

			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.shoppersstack.com/");
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@name='loginBtn']")));
			
			WebElement login=driver.findElement(By.xpath("//button[@name='loginBtn']"));
			login.click();
			
	}

}
