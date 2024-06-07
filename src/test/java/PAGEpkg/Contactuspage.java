package PAGEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
      WebDriver driver;
      
      @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[8]/a/span")
      WebElement contactus ; 
      @FindBy (id="name")
      WebElement  Name;
      @FindBy (id="email")
      WebElement Email;
      @FindBy (id="phone")
      WebElement phonenumber;
      @FindBy (id="subject")
      WebElement Subject;
      @FindBy (id="message")
      WebElement Message;
      @FindBy (name="newsletter")
      WebElement newsletter;
      @FindBy (xpath="/html/body/div[3]/main/div/section[3]/div/div/div[1]/div/form/div[7]/button")
      WebElement sendmessage;
      
      public Contactuspage(WebDriver driver) {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
	}
      public void contactclick() {
    	  contactus.click();
 
      }
      public void contactuspagevalues() throws Exception {
    	  Name.sendKeys("arya");
    	  Email.sendKeys("arya@gmail.com");
    	  phonenumber.sendKeys("98765421");
    	  Subject.sendKeys("book an appointment");
    	  Message.sendKeys("Hi, I am Arya. I want to book an appointment");
    	  newsletter.click();
    	  Thread.sleep(2000);
      }
      public void sendmessageclick() {
    	  sendmessage.click();

      }
      
}
