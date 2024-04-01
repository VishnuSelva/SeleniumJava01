package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		
		WebElement popupLink=driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		Thread.sleep(3000);
		WebElement browserWindow=driver.findElement(By.xpath("//section[text()='Browser Windows']"));
		browserWindow.click();
		Thread.sleep(3000);
		System.out.println("Current Window id");
		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		Thread.sleep(3000);
		
		WebElement browserLink=driver.findElement(By.id("browserLink1"));
		browserLink.click();
		
		System.out.println("all Window ids");
		Set<String> allWindowIds=driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for (String ref:allWindowIds)
		{
			driver.switchTo().window(ref);
		}
		if (driver.getCurrentUrl().equals("https://demoapps.qspiders.com/popup/newWindos.html")) {
			
			System.out.println("Switched to New Window");
		}
		else {
			System.out.println("Not Switched to New Window");
		}
		
		
		
		WebElement frameTag=driver.findElement(By.xpath("//iframe[@src=\"../signup.html\"]"));
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		WebElement emailTextFiled=driver.findElement(By.xpath("//input[@id='email']"));
		emailTextFiled.sendKeys("abcd123@gmail.com");
		
	
		WebElement passwordTextFiled=driver.findElement(By.id("password"));
		passwordTextFiled.sendKeys("12jshlak");
		
		
		WebElement confirmPasswordTextFiled=driver.findElement(By.id("confirm-password"));
		confirmPasswordTextFiled.sendKeys("12jshlak");
		
		
		Thread.sleep(5000);
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
	}
		
}


