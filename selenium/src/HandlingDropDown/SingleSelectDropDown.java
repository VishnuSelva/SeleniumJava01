package HandlingDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdownLink = driver.findElement(By.xpath("//section[text()='Dropdown']"));
		dropdownLink.click();
		
		WebElement countryDropdown = driver.findElement(By.id("select3"));
		Select select=new Select(countryDropdown);
		select.selectByVisibleText("India");

		if(select.isMultiple()==true)
		{
			System.out.println("the country dropdown is multi select");
		}
		else {
			System.out.println("the country dropdown is single select");
		}

		Thread.sleep(3000);
		
		WebElement stateDropdown = driver.findElement(By.id("select5"));
		Select select1=new Select(stateDropdown);
		select1.selectByValue("Tamil Nadu");
		Thread.sleep(3000);
		
		WebElement cityDropdown = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select select2=new Select(cityDropdown);
		select2.selectByIndex(1);
	
	}

}
