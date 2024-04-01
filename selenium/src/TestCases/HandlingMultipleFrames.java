package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(3000);
		WebElement multipleFrame=driver.findElement(By.xpath("//a[text()='Multiple iframe']"));
		multipleFrame.click();
		
		driver.switchTo().frame(1);
		
		WebElement signInEmailTextField=driver.findElement(By.id("email"));
		signInEmailTextField.sendKeys("vishnu");

	}

}
