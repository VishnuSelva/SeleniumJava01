package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingPartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement forgottenPasswordLink=driver.findElement(By.partialLinkText("Forgotten"));
		forgottenPasswordLink.click();

	}

}
