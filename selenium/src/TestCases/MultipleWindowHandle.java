package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

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
		
		WebElement browserLink=driver.findElement(By.id("browserLink1"));
		browserLink.click();
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for (String ref:allWindowIds)
		{
			if (driver.getCurrentUrl().equals("https://demoapps.qspiders.com/popup/newWindos.html")) {
				
				break;
			}
		}
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		

	}

}
