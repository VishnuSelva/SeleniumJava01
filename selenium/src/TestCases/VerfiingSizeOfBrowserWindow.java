package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiingSizeOfBrowserWindow {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	
	
	Dimension dim=driver.manage().window().getSize();
	System.out.println("width = "+dim.getWidth());
	System.out.println("heigth = "+dim.getHeight());

	}

}
