package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSubmit {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		 
		System.out.println("coodinate of searchBar");
		Point point = searchBar.getLocation();
		int xcoodinate = point.getX();
		int ycoodinate =point.getY();
		System.out.println(xcoodinate);
		System.out.println(ycoodinate);
		
		System.out.println("size of searchBar");
		Dimension size = searchBar.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		
		System.out.println("rect of searchBar");
		Rectangle rect = searchBar.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		

	}

}
