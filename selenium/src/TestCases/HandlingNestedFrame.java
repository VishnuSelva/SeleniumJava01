package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrame {

	public static void main(String[] args) throws Throwable {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(3000);
		WebElement nestedFrame=driver.findElement(By.xpath("//a[text()='Nested iframe']"));
		nestedFrame.click();
		WebElement parentFrameTag=driver.findElement(By.xpath("//iframe[@id='nestedframe']"));
		driver.switchTo().frame(parentFrameTag);
		
		WebElement childFrameTag=driver.findElement(By.xpath("//iframe[@id='newWindow']"));
		driver.switchTo().frame(childFrameTag);
		
		WebElement emailTextFiled=driver.findElement(By.id("email"));
		emailTextFiled.sendKeys("akalsl@gmail.com");
		
		driver.switchTo().defaultContent();
		WebElement defaultLink=driver.findElement(By.xpath("//a[text()='Default']"));
		defaultLink.click();
		
		
	
	}

}
