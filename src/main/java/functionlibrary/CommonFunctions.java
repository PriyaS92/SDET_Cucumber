package functionlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
	
		public static WebDriver driver;
		
		public CommonFunctions(){
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
}
