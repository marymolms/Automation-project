package BASEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GownBaseclass {
       
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://thewhitegown.com");
		
	    driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@AfterTest
	  public void teardown() {
		   driver.close();
	   }
}
