package HandlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifingAllOptionsInDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdownLink = driver.findElement(By.xpath("//section[text()='Dropdown']"));
		dropdownLink.click();
		
		WebElement countryDropdown = driver.findElement(By.id("select3"));
		Select select=new Select(countryDropdown);
		select.selectByVisibleText("India");
		
		List<WebElement> allCountries = select.getOptions();
		
		System.out.println("All the options in country drop down");
		for (WebElement option:allCountries)
		{
			System.out.println(option.getText());
		}


	}

}
