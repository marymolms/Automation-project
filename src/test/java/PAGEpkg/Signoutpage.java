package PAGEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signoutpage {
     WebDriver driver;
     @FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/a/i")
     WebElement account;
     @FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/div/div/ul/li[3]/a")
     WebElement logoout;
     
     
     
     public Signoutpage(WebDriver driver) {
    		this.driver= driver;
    		PageFactory.initElements(driver, this);
	}
     
     public void  logoout() {
    	 account.click();
    	 logoout.click();
     }
}
