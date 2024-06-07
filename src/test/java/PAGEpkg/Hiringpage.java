package PAGEpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hiringpage {
                WebDriver driver;
                @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/a/span")
                WebElement about;
             @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[6]/ul/li/ul/li[4]/a/span")
             WebElement  hiring;
             @FindBy (xpath="/html/body/div[3]/main/div/section[3]/div/div/div/div/div/div/div/p[5]/a")
             WebElement apply;
             @FindBy (xpath="//*[@id=\"15\"]")
             WebElement firstname;
             @FindBy (xpath="//*[@id=\"16\"]")
             WebElement lastname;
             @FindBy (xpath="//*[@id=\"17\"]")
             WebElement email ; 
             @FindBy (xpath="//*[@id=\"18\"]")
             WebElement phonenumber; 
             @FindBy (xpath="//*[@id=\"24\"]")
             WebElement experience;
             @FindBy (xpath="//*[@id=\"19\"]")
             WebElement interest; 
             @FindBy (xpath="//*[@id=\"20\"]")
             WebElement bridalexp;
             @FindBy (xpath="//*[@id=\"21\"]")
             WebElement trends;
             @FindBy (xpath="//*[@id=\"22\"]")
             WebElement designers;
             @FindBy (xpath="/html/body/div[3]/main/div/section/div[3]/div/form/div[1]/div[10]/div/div[1]/input")
             WebElement resume;
             @FindBy (xpath="//*[@id=\"25\"]")
             WebElement cover;
             @FindBy (xpath="//*[@id=\"custom-form\"]/div[2]/button")
             WebElement submit;
             
                public Hiringpage(WebDriver driver) {
                	this.driver= driver;
        			PageFactory.initElements(driver, this);
                }
                
                public void apply() throws Exception {
                	Actions act = new Actions (driver);
                	act.moveToElement(about).perform();
                	hiring.click();
                	Thread.sleep(6000);
                	apply.click();
                	
                }
                public void setvalues() throws AWTException, Exception {
                	
                	firstname.sendKeys("NIJA");
                	lastname.sendKeys("VIMAl");
                	email.sendKeys("nija98@gmail.com");
                    phonenumber.sendKeys("9865321470");
                    experience.sendKeys("2");
                    interest.sendKeys("Iam eligible for this position");
                    bridalexp.sendKeys("yes, I have 1 year experience");
                    trends.sendKeys("by following main designers");
                    designers.sendKeys("I am familiar with Rose, Rita and Karin");
                    Thread.sleep(2000);
                	resume.click();
                	fileupload("C:\\Users\\soft\\Downloads\\resume1.docx");
                
            	 cover.click();
            	 fileupload("C:\\Users\\soft\\Downloads\\cover.docx");
             }
				private void fileupload(String p) throws AWTException {
					StringSelection strselection =new StringSelection(p);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
					
					Robot robot=new Robot();
					
					robot.delay(3000);
					
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}
				
				public void submit() {
					submit.click();
				}
                
}
