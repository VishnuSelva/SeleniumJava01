package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingCssSelector {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		WebElement buttonLink=driver.findElement(By.cssSelector("a[href='/button']"));
		buttonLink.click();
		
		WebElement rightClickLink=driver.findElement(By.cssSelector("a[href='/button/buttonRightClick?sublist=1']"));
		rightClickLink.click();

	}

}
