package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mouseAction=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		mouseAction.click();
		
		WebElement  clickAndHold =driver.findElement(By.xpath("//section[text()='Click & Hold']"));
		clickAndHold.click();
		
		WebElement circle = driver.findElement(By.id("circle"));
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.clickAndHold(circle).perform();
		
		//action.moveByOffset(0, 0).clickAndHold().perform();

	}

}
