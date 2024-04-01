package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndNav {

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
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://demoapps.qspiders.com/hidden?sublist=0");
	}

}
