package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeClickable {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoapps.qspiders.com/");
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  WebElement SynchronizationLink = driver.findElement(By.xpath("//section[text()='Synchronization']"));
		  SynchronizationLink.click();
		  Thread.sleep(5000);
		  WebElement progessBar = driver.findElement(By.xpath("//section[text()='Progress Bar']"));
		  progessBar.click();
		  
		  WebElement withElementLink = driver.findElement(By.xpath("//a[text()='With Element']"));
		  withElementLink.click();
		  
		  WebElement timeInputTextField = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
		  timeInputTextField.sendKeys("10");
		  
		  WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		  startButton.click();
		  
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  
		  wait.until(ExpectedConditions.urlToBe("https://demoapps.qspiders.com/progress/element?sublist=2"));
		  
		  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20) );
		  wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Do you like Automation']")));
		  
		  WebElement text = driver.findElement(By.xpath("//p[text()='Do you like Automation']"));
		  System.out.println(text.getText());

	}

}
