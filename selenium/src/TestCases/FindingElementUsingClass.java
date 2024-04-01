package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementUsingClass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		System.out.println("The Text of First Elements");
     	WebElement kannadaLink=driver.findElement(By.className("_sv4"));
     	String kannadaLinkText=kannadaLink.getText();
     	System.out.println(kannadaLinkText);
		
		List<WebElement> indiaMajorLanguage=driver.findElements(By.className("_sv4"));
		System.out.println("The Text of Fourth Elements");
		 String fourthElementText=indiaMajorLanguage.get(3).getText();
		 System.out.println(fourthElementText);
		 
		 System.out.println("The Text of All Elements");
		 for (int i=0;i<indiaMajorLanguage.size();i++)
		 {
			 String text=indiaMajorLanguage.get(i).getText();
			 System.out.println(text);
		 }
		 WebElement loginButton=driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		 loginButton.click();
		 
          
	}

}
