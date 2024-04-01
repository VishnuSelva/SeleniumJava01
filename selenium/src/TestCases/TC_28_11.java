package TestCases;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_28_11 {

	public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://demoapps.qspiders.com/");
       String currentUrl=driver.getCurrentUrl();
       System.out.println(currentUrl);
       String currentTitle=driver.getTitle();
       System.out.println(currentTitle);
       
//      Options option=driver.manage();
//      Window window=option.window();
//      window.maximize();                     
//      Thread.sleep(3000l);
//      window.minimize();
//      Thread.sleep(3000l);
//      window.fullscreen();
          
      driver.manage().window().maximize();
      Thread.sleep(3000l);
      driver.manage().window().minimize();
      Thread.sleep(3000l);
      driver.manage().window().fullscreen();
  
	}

}
