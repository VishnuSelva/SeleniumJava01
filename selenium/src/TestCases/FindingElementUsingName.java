package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingName {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        
        Thread.sleep(3000l);
        
    
        WebElement usernameTextField=driver.findElement(By.name("name"));
        usernameTextField.sendKeys("vishnu");
        
        
        WebElement emailTextField=driver.findElement(By.name("email"));
        emailTextField.sendKeys("abcd123@gmail.com");
        
        
        WebElement passwordTextField=driver.findElement(By.name("password"));
        passwordTextField.sendKeys("14252gde");    

	}

}
