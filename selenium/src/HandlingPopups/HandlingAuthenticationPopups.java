package HandlingPopups;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPopups {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupLink = driver.findElement(By.xpath("//section[text()='Popups']"));
		popupLink.click();
		
		WebElement authenticationpopupLink = driver.findElement(By.xpath("//section[text()='Authentication']"));
		authenticationpopupLink.click();
		
		WebElement loginButton = driver.findElement(By.id("AuthLink"));
		loginButton.click();
		
		String mainWindowId = driver.getWindowHandle();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(mainWindowId);
		
		for(String ref:allWindowIds) {
			driver.switchTo().window(ref);
		}
	   
		System.out.println(driver.getCurrentUrl());
		
		Runtime.getRuntime().exec("C:\\Users\\vishn\\OneDrive\\Documents\\AutoitScript\\authentication.exe");
	}
	
}
