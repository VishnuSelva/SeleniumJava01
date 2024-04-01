package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        
        Thread.sleep(3000l);
//        By iref=By.id("name");
//        driver.findElement(iref).sendKeys("vishnu");
      
        WebElement start=driver.findElement(By.xpath("//button[text()='Quick Start']"));
        start.click();
        Thread.sleep(3000);
        WebElement usernameTextField=driver.findElement(By.id("name"));
        usernameTextField.sendKeys("vishnu");
        
        
        WebElement emailTextField=driver.findElement(By.id("email"));
        emailTextField.sendKeys("abcd123@gmail.com");
        
        
        WebElement passwordTextField=driver.findElement(By.id("password"));
        passwordTextField.sendKeys("14252gde");    
        
        }
}
