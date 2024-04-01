package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJsPopup {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement jsPopupLink = driver.findElement(By.xpath("//section[text()='Javascript']"));
		jsPopupLink.click();
		
		WebElement alertBox = driver.findElement(By.id("buttonAlert2"));
		alertBox.click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement confirmPopupLink = driver.findElement(By.xpath("//a[text()='Confirm']"));
		confirmPopupLink.click();
		
		WebElement confirmBox = driver.findElement(By.id("buttonAlert5"));
		confirmBox.click();
		
		Thread.sleep(3000);
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.dismiss();
		
	}

}
