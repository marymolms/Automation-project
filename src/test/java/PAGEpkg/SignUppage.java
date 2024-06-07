package PAGEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUppage {
    
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/a/i")
	WebElement account;
	
	@FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/div/div/ul/li[2]/a")
	WebElement signup;
	@FindBy (xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	@FindBy (xpath="//*[@id=\"FirstName\"]")
	WebElement firstname;
	@FindBy (xpath="//*[@id=\"LastName\"]")
	WebElement lastname;
	@FindBy (xpath="//*[@id=\"Password\"]")
	WebElement password;
	
	@FindBy (xpath="//*[@id=\"ConfirmPassword\"]")
	WebElement confirmpassword;
	@FindBy (xpath="//*[@id=\"ReceivePromotions\"]")
	WebElement receivepromo;
	@FindBy (xpath="//*[@id=\"register-form\"]/div[8]/button")
	WebElement register;
	
	@FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[2]/ul/li[4]/div/div/ul/li[3]/a")
	WebElement logout;
	
	  
	public SignUppage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	         public void signup() throws Exception {
	        	 account.click();
	        	 signup.click();
	        	 email.sendKeys("kinvihh@gmail.com");
	        	 firstname.sendKeys("hhgi");
	        	 lastname.sendKeys("vimakkjrgl");
	        	 password.sendKeys("hidear2027");
	        	 confirmpassword.sendKeys("hidear2027");
	        	 receivepromo.click();
	        	 Thread.sleep(3000);
	        	 register.click();
	        	 Thread.sleep(8000);
	        	 account.click();
	        	 logout.click();
	         }
	
	
}
