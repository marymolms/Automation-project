package PAGEpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class menupage {
         WebDriver driver;
         @FindBy (xpath="//*[@id=\"preheader\"]/div/div/div/div[1]/ul/li[2]/a/span")
         WebElement appointment;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[2]/a/span")
         WebElement weddingdress;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[2]/ul/li/ul/li/a/span")
         WebElement curvydress;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[7]/a/span")
         WebElement events;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[3]/a/span")
         WebElement sale;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[4]/a/span")
         WebElement accessories;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[5]/a/span")
         WebElement bride;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[5]/ul/li/ul/li/a/span")
         WebElement testimony;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/a/span")
         WebElement about;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/ul/li/ul/li[3]/a/span")
         WebElement blog;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/ul/li/ul/li[2]/a/span")
         WebElement sevices;
         @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/ul/li/ul/li[5]/a/span")
         WebElement FAQ;
         
         public menupage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
         
         public void appointment() {
        	 appointment.click();
         }
         
         public void dress() {
        	 weddingdress.click();
        	   Actions act=new Actions(driver);
        	 act.moveToElement(weddingdress).perform();
        	 curvydress.click();
        	 
         }
         public void menu() {
        	 sale.click();
        	 accessories.click();
        	 events.click();
         }
         public void aboutus() {
        	 about.click();
        	 Actions acts=new Actions(driver);
        	 acts.moveToElement(about).perform();
        	 blog.click();
        	 
        	 acts.moveToElement(about).perform();
        	 sevices.click();
        	 
        	 acts.moveToElement(about).perform();
        	 FAQ.click();
         }
         public void bride() {
        	 bride.click();
        	 Actions actn=new Actions (driver);
        	 actn.moveToElement(bride).perform();
        	 testimony.click();
         }
}
