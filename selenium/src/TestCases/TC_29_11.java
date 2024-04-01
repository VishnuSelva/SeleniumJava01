package TestCases;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_29_11 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Window window = driver.manage().window();
		Point point = window.getPosition();
		int xcoordinate=point.getX();
		int ycoordinate=point.getY();
		System.out.println(xcoordinate);
		System.out.println(ycoordinate);
		
	}

}
