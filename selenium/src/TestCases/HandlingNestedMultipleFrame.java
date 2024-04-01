package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedMultipleFrame {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(3000);
		WebElement nestedMultipleFrame=driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']"));
		nestedMultipleFrame.click();
		
		WebElement parentFrameTag=driver.findElement(By.xpath("//iframe[@src=\"../newWindow-1.html\"]"));
		driver.switchTo().frame(parentFrameTag);
		
		WebElement childFrameTag=driver.findElement(By.xpath("//iframe[@src=\"./login-2.html\"]"));
		driver.switchTo().frame(childFrameTag);
		
		WebElement emailFrameTag=driver.findElement(By.xpath("//iframe[@src=\"./Email.html\"]"));
		driver.switchTo().frame(emailFrameTag);
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		emailTextField.sendKeys("vishnu123@gmail.com");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(parentFrameTag);
		driver.switchTo().frame(childFrameTag);
		
		WebElement passwordFrameTag=driver.findElement(By.xpath("//iframe[@src=\"./password.html\"]"));
		driver.switchTo().frame(passwordFrameTag);
		
		WebElement passwordTextField=driver.findElement(By.id("password"));
		passwordTextField.sendKeys("12547892");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(parentFrameTag);
		driver.switchTo().frame(childFrameTag);
		
		WebElement confirmPasswordFrameTag=driver.findElement(By.xpath("//iframe[@src=\"./confirmpassword.html\"]"));
		driver.switchTo().frame(confirmPasswordFrameTag);
		
		WebElement confirmPasswordTextField=driver.findElement(By.id("confirmpassword"));
		confirmPasswordTextField.sendKeys("12547892");
		
		

	}

}


//               (//tbody[@class='w-full']/tr/th/following-sibling::td[4])[1]
