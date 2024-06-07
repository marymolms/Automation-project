package TESTpkg;

import org.testng.annotations.Test;

import BASEpkg.GownBaseclass;
import EXCELutilitypkg.Gownexcel;
import PAGEpkg.Contactuspage;
import PAGEpkg.Designerspage;
import PAGEpkg.Hiringpage;
import PAGEpkg.Productpage;
import PAGEpkg.SIGNinpage;
import PAGEpkg.SignUppage;
import PAGEpkg.Signoutpage;
import PAGEpkg.Wishlistpage;
import PAGEpkg.menupage;

@Test
public class Gowntestclass extends GownBaseclass{
      
	@Test(priority = 1)
	public void signuptest() throws Exception {
		SignUppage ob1=new SignUppage(driver);
		ob1.signup();
	}
	@Test(priority = 2)
	public void signintest() throws Exception {
		SIGNinpage ob2= new SIGNinpage(driver);
		ob2.accountclick();
		String xl="F:\\MARYMOL\\java\\excel\\Gown.xlsx";
		String sheet="Sheet1";
		
		int rowcount = Gownexcel.getrowcount(xl, sheet);
		for(int i=1; i<=rowcount; i++) {
			String un= Gownexcel.getcellvalue(xl, sheet, i, 0);
			String pwd= Gownexcel.getcellvalue(xl, sheet, i, 1);
			ob2.signinvalues(un, pwd);
			ob2.signinclick();
			Thread.sleep(3000);
			driver.navigate().back();;
		}
	}
	
	@Test(priority = 3)
	public void contacttest() throws Exception {
		Contactuspage ob3= new Contactuspage(driver);
		ob3.contactclick();
		ob3.contactuspagevalues();
		ob3.sendmessageclick();
	}
	@Test(priority = 4)
	public void designertest() {
		Designerspage ob4= new Designerspage(driver);
		ob4.designers();
		
	}
	@Test(priority = 5)
	public void producttest() throws Exception {
		Productpage ob5=new Productpage(driver);
		ob5.alyne();
		ob5.amsale();
		ob5.amsalelittle();
		ob5.atelier();
		ob5.blueenzoani();
		ob5.bywatter();
		ob5.enzoani();
		ob5.karin();
		ob5.nouvelle();
		ob5.privee();
		ob5.Pronovias();
		ob5.Rivini();
		ob5.vera();
		ob5.watters();
		ob5.willow();
		ob5.wtoo();
	}
	
	@Test(priority = 6)
	public void menutest() {
		menupage ob6=new menupage(driver);
		ob6.appointment();
		ob6.dress();
		ob6.menu();
		ob6.aboutus();
		ob6.bride();
	}
	@Test(priority = 7)
	public void hiringtest() throws Exception {
		Hiringpage ob7=new Hiringpage(driver);
		ob7.apply();
		ob7.setvalues();
		ob7.submit();
		
	}
	@Test(priority = 8)
	public void wishlisttest() throws Exception {
		Wishlistpage ob8=new Wishlistpage(driver);
		ob8.product1();
		ob8.product2();
	}
	@Test(priority = 9)
	public void logouttest() {
		Signoutpage ob9= new Signoutpage(driver);
		ob9.logoout();
	}
  }   	 
      

