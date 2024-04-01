package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Login_001 {

	public static void main(String[] args) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	  String  currentUrl=driver.getCurrentUrl();
	  System.out.println(currentUrl);
	  if (driver.getCurrentUrl().equals("https://www.facebook.com/r.php?locale=en_GB&display=page"))
	  {
		  System.out.println("test case is passed");
	  }
	  else {
		  System.out.println("test case is failed");
	  }
	  String titleForSignUpPage=driver.getTitle();
	  System.out.println(titleForSignUpPage);
	  
	}

}
