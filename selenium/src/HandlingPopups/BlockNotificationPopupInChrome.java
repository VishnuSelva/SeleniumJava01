package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockNotificationPopupInChrome {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement notificationPopupLink = driver.findElement(By.xpath("//section[text()='Notifications']"));
		notificationPopupLink.click();
		
		WebElement notificationBox = driver.findElement(By.id("browNotButton"));
		notificationBox.click();

	}

}
