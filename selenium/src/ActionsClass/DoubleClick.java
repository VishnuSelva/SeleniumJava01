package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement UiTesting = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));	
		UiTesting.click();
		
		WebElement buttonLink=driver.findElement(By.xpath("//section[text()='Button']"));
		buttonLink.click();
		
		WebElement doubleClickLink=driver.findElement(By.xpath("//a[text()='Double Click']"));
		doubleClickLink.click();
		
		WebElement satisfiedWithRegistrationYesButton = driver.findElement(By.id("btn20"));
		
		
		Actions action=new Actions(driver);
		
		action.doubleClick(satisfiedWithRegistrationYesButton).perform();
		
		Thread.sleep(3000);
		WebElement rightClickLink=driver.findElement(By.xpath("//a[text()='Right Click']"));
		rightClickLink.click();
		
		WebElement rightClickFirstbutton = driver.findElement(By.id("btn30"));
		
		//Actions action1=new Actions(driver);
		
		action.contextClick(rightClickFirstbutton);
		action.perform();
		
	}

}
