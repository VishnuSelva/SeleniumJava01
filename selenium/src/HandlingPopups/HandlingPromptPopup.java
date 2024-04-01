package HandlingPopups;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement jsPopupLink = driver.findElement(By.xpath("//section[text()='Javascript']"));
		jsPopupLink.click();
		
		WebElement promptPopupLink = driver.findElement(By.xpath("//a[text()='Prompt']"));
		promptPopupLink.click();
		
		WebElement promptBox = driver.findElement(By.id("buttonAlert1"));
		promptBox.click();
		
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
//		alt.sendKeys("yes");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_Y);
		robot.keyRelease(KeyEvent.VK_Y);
		
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		
		Thread.sleep(3000);
		alt.accept();

	}

}
