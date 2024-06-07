package PAGEpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Designerspage {
      WebDriver driver;
      
      @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[1]/a/span")
      WebElement designers;
      
      public Designerspage(WebDriver driver) {
         this.driver= driver;
         PageFactory.initElements(driver, this);
      
      }
      
      public void designers() {
    	  designers.click();
      
      List<WebElement>li= driver.findElements(By.xpath("//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div/a"));
	  System.out.println("Designer name");

      for (WebElement ele:li) {
    	  
    	  String name=ele.getAttribute("title");
    	  System.out.println(name);
         
         
    

      }
}
      }   	  
   
      
      
      
                                               
