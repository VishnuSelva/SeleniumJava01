package TestCases;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingPositionForBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        
        Thread.sleep(3000l);
        Point point=new Point(300,400);
        driver.manage().window().setPosition(point);
	}

}
