package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchingOwnHtmlDocument {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vishn/OneDrive/Desktop/seleniumhtml.html");
        
        String sourcecodeOfCurrentPage=driver.getPageSource();
        System.out.println(sourcecodeOfCurrentPage);

	}

}
