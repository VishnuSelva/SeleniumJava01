package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mouseAction=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		mouseAction.click();
		
		WebElement mouseHover=driver.findElement(By.xpath("//section[text()='Mouse Hover']"));
		mouseHover.click();

		WebElement passwordInfoImg=driver.findElement(By.xpath("//img[@src=\"/static/media/message-hint.b2a6e0d93a0cc13121a0.png\"]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(passwordInfoImg);
		Thread.sleep(3000);
		//action.moveByOffset(929, 181);
		action.perform();
		
		
	}

}
