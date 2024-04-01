package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectApi {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        
        WebElement start=driver.findElement(By.xpath("//button[text()='Quick Start']"));
        start.click();
        Thread.sleep(3000);
         WebElement dropDown = driver.findElement(By.id("options"));
         Select select = new Select(dropDown);
         select.selectByVisibleText("API");
	}

}
