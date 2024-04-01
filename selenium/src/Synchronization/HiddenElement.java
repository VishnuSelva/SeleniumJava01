package Synchronization;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HiddenElement {

	public static void main(String[] args) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  WebElement SynchronizationLink = driver.findElement(By.xpath("//section[text()='Synchronization']"));
	  SynchronizationLink.click();
	  
	  WebElement progessBar = driver.findElement(By.xpath("//section[text()='Progress Bar']"));
	  progessBar.click();
	  
	  WebElement withElementLink = driver.findElement(By.xpath("//a[text()='With Element']"));
	  withElementLink.click();
	  
	  WebElement timeInputTextField = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
	  timeInputTextField.sendKeys("10");
	  
	  WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
	  startButton.click();
	  
	  WebElement text = driver.findElement(By.xpath("//p[text()='Do you like Automation']"));
	  System.out.println(text.getText());
	  
	  

	}

}
