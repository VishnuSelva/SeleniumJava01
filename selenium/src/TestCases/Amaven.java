package TestCases;

import java.io.File;
import java.io.FileInputStream;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaven {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
		
        File file=new File("C:\\Users\\vishn\\OneDrive\\Documents\\testdata.properties");
        
        FileInputStream fis = new FileInputStream(file);
        
        //Properties pr = new Properties();

	}

}
