package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByUsingActionsClass {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		Thread.sleep(3000);
		
		Actions action1=new Actions(driver);
		action1.scrollToElement(aboutUs).perform();

	}

}
