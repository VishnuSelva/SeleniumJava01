package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/frames");
		
		WebElement frameTag=driver.findElement(By.xpath("//iframe[@src=\"./login.html\"]"));
		driver.switchTo().frame(0);
		
		WebElement usernameTextfiled = driver.findElement(By.id("username"));
		usernameTextfiled.sendKeys("vishnu");
		
		WebElement passwordTextfiled = driver.findElement(By.id("password"));
		passwordTextfiled.sendKeys("1223546");
		
		WebElement clickLogin= driver.findElement(By.xpath("//button[text()='Login']"));
		clickLogin.click();
		System.out.println("logined successfully");
		
		
		

	}

}
