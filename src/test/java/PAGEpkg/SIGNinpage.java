package PAGEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SIGNinpage {
    WebDriver driver;
    
    @FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/a/i")
	WebElement account;
	
    @FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/div/div/ul/li[1]/a")
    WebElement signin;
    
    @FindBy (xpath="//*[@id=\"Email\"]")
    WebElement email;
    
    @FindBy (xpath="//*[@id=\"Password\"]")
    WebElement password;
    @FindBy (xpath="//*[@id=\"sign-in-form\"]/div[4]/button")
    WebElement signinbtn;
    
    
    public SIGNinpage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);	
	}
    public void accountclick() {
    	account.click();
    	signin.click();

    }
    
    public void signinvalues(String un, String pwd) {
    	email.sendKeys(un);
    	password.sendKeys(pwd);
    }
    
    public void signinclick() {
    	signinbtn.click();

    }
}
