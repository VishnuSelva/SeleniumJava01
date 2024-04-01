package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BlockNotificationPopupInFirefox {

	public static void main(String[] args) {
		FirefoxOptions option=new FirefoxOptions();
		option.addPreference("dom.webnotifications.enabled", false);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement notificationPopupLink = driver.findElement(By.xpath("//section[text()='Notifications']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", notificationPopupLink);
		
		WebElement notificationBox = driver.findElement(By.id("browNotButton"));
		notificationBox.click();

	}

}
