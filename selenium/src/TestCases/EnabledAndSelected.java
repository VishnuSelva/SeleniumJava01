package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EnabledAndSelected {

	public static void main(String[] args) throws Throwable {
				// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://demoapps.qspiders.com/?scenario=1");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
		        WebElement disabledLink = driver.findElement(By.xpath("//li[text()='Disabled']"));
		        disabledLink.click();
		        
		        WebElement nameTextField = driver.findElement(By.id("name"));
		        boolean isEnabled = nameTextField.isEnabled();
		        
		      System.out.println(isEnabled);
		     
		       
		      WebElement radiobuttonLink = driver.findElement(By.xpath("//section[text()='Radio Button']"));
		      radiobuttonLink.click();
		      
		      WebElement upiRadiobutton = driver.findElement(By.id("attended"));
		      boolean selected = upiRadiobutton.isSelected();
		      
		      System.out.println(selected);
		      upiRadiobutton.click();
		      boolean selected1 = upiRadiobutton.isSelected();
		      System.out.println(selected1);

	}

}
