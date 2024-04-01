package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		
       
		 
		WebElement emailText=driver.findElement(By.id("email"));
		emailText.sendKeys("vishnuselva1981@gmail.com");
		emailText.clear();
		
		WebElement passwordText=driver.findElement(By.id("password"));
		passwordText.sendKeys("Vishnu@21");
		passwordText.clear();
		
		Thread.sleep(2000);
		passwordText.sendKeys(Keys.ENTER);
		
		

	}

}
