package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement searchFlied = driver.findElement(By.xpath("//input[@id='search']"));
		searchFlied.sendKeys("api");
		Thread.sleep(3000);
		searchFlied.sendKeys(Keys.ENTER);
		
		WebElement apivideo=driver.findElement(By.xpath("//yt-formatted-string[text()='What is an API (in 5 minutes)']"));
		apivideo.click();
	}

}
