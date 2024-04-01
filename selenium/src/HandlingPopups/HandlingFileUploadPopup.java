package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement fileUploadPopupLink = driver.findElement(By.xpath("//section[text()='File Uploads']"));
	    fileUploadPopupLink.click();
	    
	    WebElement  choseFileButton = driver.findElement(By.id("fileInput"));
	    choseFileButton.sendKeys("C:\\Users\\vishn\\OneDrive\\Desktop\\SQL_Queries.pdf");

	}
}
