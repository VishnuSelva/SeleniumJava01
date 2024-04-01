package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingTag {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement loginbutton=driver.findElement(By.tagName("button"));
		loginbutton.click();
		
		List<WebElement> allInputTags=driver.findElements(By.tagName("div"));
		System.out.println(allInputTags.size());
		
		
		
		
	}

}
