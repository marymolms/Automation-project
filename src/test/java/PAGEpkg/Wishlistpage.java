package PAGEpkg;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
      WebDriver driver;
      
      @FindBy (xpath="//*[@id=\"common-navbar\"]/ul/li[1]/a/span")
      WebElement designers;
      @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[1]/a")
       WebElement Alyne;
      @FindBy (xpath="//*[@id=\"main\"]/div/section[1]/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div[3]/div/div[2]/div/a/div/div/h4/span")
      WebElement Haylo;
      @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[8]/a")
      WebElement Karin;
      @FindBy (xpath="//*[@id=\"main\"]/div/section[1]/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div[5]/div/div[2]/div/a/div/div/h5/span")
      WebElement rene;
      @FindBy (xpath="//*[@id=\"main\"]/div/section[2]/div/div/div/div/div[2]/div[3]/div/div/a/span[1]")
      WebElement wishlist;
      
      public Wishlistpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
      }
      
      public void product1()  {
    	  designers.click();
          Alyne.click();
         Haylo.click();
        	        		wishlist.click();
        	        }
        	public void product2() {
        		designers.click();
        		Karin.click();
        		rene.click();
        		wishlist.click();
        	}
}
