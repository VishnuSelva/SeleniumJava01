package TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingBrowserWindowSize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        
        Thread.sleep(3000l);
        Point point=new Point(300,400);
        driver.manage().window().setPosition(point);
        
        Thread.sleep(3000l);
        Dimension dim=new Dimension(500,300);
        driver.manage().window().setSize(dim);
        
        String sourcecodeOfCurrentPage=driver.getPageSource();
        System.out.println(sourcecodeOfCurrentPage);
        driver.close();
	}

}
