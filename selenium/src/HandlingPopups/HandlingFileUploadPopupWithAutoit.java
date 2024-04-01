package HandlingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopupWithAutoit {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement fileUploadPopupLink = driver.findElement(By.xpath("//section[text()='File Uploads']"));
	    fileUploadPopupLink.click();

	    WebElement customButton = driver.findElement(By.xpath("//a[text()='Custom Button']"));
	    customButton.click();

	    WebElement uploadFile= driver.findElement(By.xpath("//div[text()='Upload File']"));
	    uploadFile.click();
	    
	    Runtime.getRuntime().exec("C:\\Users\\vishn\\OneDrive\\Documents\\AutoitScript\\sql.exe");
	}

}
