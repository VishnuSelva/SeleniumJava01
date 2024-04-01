package JavaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Rdocumentation = driver.findElement(By.xpath("//a[text()='Requirement documentation']"));
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.scrollToElement(Rdocumentation).perform();
		
		WebElement menMenuLink = driver.findElement(By.id("men"));
		Thread.sleep(3000);
		action.moveToElement(menMenuLink).perform();
		
		WebElement SwaggerDocumentLink = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", SwaggerDocumentLink);

	}

}
