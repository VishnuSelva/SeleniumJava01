package JavaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTillWebElement {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement returnPolicyLink = driver.findElement(By.xpath("//a[text()='Return Policy']"));
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", returnPolicyLink);
		
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView(true);", returnPolicyLink);
		
		Thread.sleep(3000);
		WebElement sneakersLink = driver.findElement(By.xpath("//a[@href=\"https://in.puma.com/in/en/sneakers\"]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", sneakersLink);
		
		Thread.sleep(3000);
		String title=(String)jse.executeScript("return document.title;");
		System.out.println(title);
		
		String url=(String)jse.executeScript("return document.URL;");
		System.out.println(url);
	}

}
