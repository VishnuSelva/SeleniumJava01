package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingWithInFrames {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/infinite/verticalScroll");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frameTag=driver.findElement(By.xpath("//iframe[@src=\"../scroll/vertical.html\"]"));
		driver.switchTo().frame(frameTag);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='termsCheckbox']"));
		
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.scrollToElement(checkbox);
		
		

	}

}
