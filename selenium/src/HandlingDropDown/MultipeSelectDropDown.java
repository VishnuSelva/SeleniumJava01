package HandlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipeSelectDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdownLink = driver.findElement(By.xpath("//section[text()='Dropdown']"));
		dropdownLink.click();
		
		WebElement multiSelectLink = driver.findElement(By.xpath("//a[text()='Multi Select']"));
		multiSelectLink.click();
		
		WebElement countryMultiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
		
	    Select select=new Select(countryMultiSelectDropdown);
	    select.selectByIndex(0);
	    select.selectByIndex(1);
	    select.selectByIndex(2);
	    
	    WebElement firstSelectedOption = select.getFirstSelectedOption();
	    System.out.println(firstSelectedOption.getText());
	    
	    System.out.println(select.isMultiple());
	    select.deselectByIndex(0);
	    
	    List<WebElement> allSelectedOption = select.getAllSelectedOptions();
		
	    for (WebElement option:allSelectedOption)
	    {
	    	System.out.println(option.getText());
	    }
	    
	}

}
