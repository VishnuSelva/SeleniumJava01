package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
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
		String currentWindowId=driver.getWindowHandle();
		System.out.println(currentWindowId);
		Thread.sleep(3000);
		
		WebElement browserLink=driver.findElement(By.id("browserLink1"));
		browserLink.click();
		
		System.out.println("all Window ids");
		Set<String> allWindowIds=driver.getWindowHandles();
		for (String ref:allWindowIds)
		{
			System.out.println(ref);
		}

	}

}
