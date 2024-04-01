package ActionsClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrolling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/infinite");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String mainPageWindowId=driver.getWindowHandle();
		
		WebElement newTab = driver.findElement(By.xpath("//a[text()='Open In New Tab']"));
		newTab.click();
		
		Set<String> AllwindowIds = driver.getWindowHandles();
		AllwindowIds.remove(mainPageWindowId);
		
		for (String ref:AllwindowIds) {
			driver.switchTo().window(ref);
			}

		System.out.println(driver.getCurrentUrl());
		

	}

}
