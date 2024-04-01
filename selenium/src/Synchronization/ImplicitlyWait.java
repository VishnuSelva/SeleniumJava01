package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitlyWait {
	
		public static void main(String[] args) {
	
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement login=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
			login.click();
			
			WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			email.sendKeys("vishnu123@gmail.com");
		}

	}
