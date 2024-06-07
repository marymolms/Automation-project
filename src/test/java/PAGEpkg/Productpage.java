package PAGEpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
    WebDriver driver;
    
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[1]/a")
    WebElement Alyne;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[2]/a")
    WebElement Amsale;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[3]/a")
    WebElement Amsalelittle;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[4]/a")
    WebElement Atelier;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[5]/a")
    WebElement Blueenzoani;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[6]/a")
    WebElement Bywatters;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[7]/a")
    WebElement Enzoani;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[8]/a")
    WebElement Karin;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[9]/a")
    WebElement Nouvelle;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[10]/a")
    WebElement Privee;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[11]/a")
    WebElement Pronovias;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[12]/a")
    WebElement Rivini;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[13]/a")
    WebElement Vera;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[14]/a")
    WebElement Watters;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[15]/a")
    WebElement Willow;
    @FindBy (xpath="//*[@id=\"section-designers-list\"]/div[1]/div/div/div/div[16]/a")
    WebElement Wtoo;
    
    
    public Productpage(WebDriver driver) {
    	   this.driver= driver;
           PageFactory.initElements(driver, this);
	}
    
    public void alyne() throws Exception {
    	Alyne.click();
    	product();
    }
    public void amsale() throws Exception{
    	Amsale.click();
          product();	
    }
    public void amsalelittle() throws Exception{
    	Amsalelittle.click();
          product();	
    }
    public void atelier() throws Exception{
    	Atelier.click();
          product();	
    }
    public void blueenzoani() throws Exception{
    	Blueenzoani.click();
          product();	
    }
    public void bywatter() throws Exception {
    	Bywatters.click();
    	product();
    }
    public void enzoani() throws Exception{
    	Enzoani.click();
          product();	
    }
    public void karin() throws Exception{
    	Karin.click();
          product();	
    }
    public void nouvelle() throws Exception{
    	Nouvelle.click();
          product();	
    }
    public void privee() throws Exception{
    	Privee.click();
          product();	
    }
    public void Pronovias() throws Exception{
    	Pronovias.click();
          product();	
    }
    public void Rivini() throws Exception{
    	Rivini.click();
          product();	
    }
    public void vera() throws Exception {
    	Vera.click();
    	product();
    }
    public void watters() throws Exception{
    	Watters.click();
          product();	
    }
    public void willow() throws Exception{
    	Willow.click();
          product();	
    }
    public void wtoo() throws Exception{
    	Wtoo.click();
          product();	
    }
    private void product() throws Exception {
  	  System.out.println("Product  name");
    	List<WebElement>list= driver.findElements(By.xpath("//*[@id=\"main\"]/div/section[1]/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div/div[2]/div/a/div/div"));
        for(WebElement ele:list) {
      	  System.out.println(ele.getAttribute("title"));
      	 
        }
      	  driver.findElement(By.xpath("//*[@id=\"common-navbar\"]/ul/li[1]/a/span")).click(); 	
        System.out.println();
        Thread.sleep(3000);
    }
    
    
}
