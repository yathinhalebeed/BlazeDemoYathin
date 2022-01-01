package Blazedemotest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class FlightBookingtest extends base {
	
	
	@Test
	public void Ts002() throws IOException, Exception {
		
		
		Browsercall(); //Browser call from base class
		myd.manage().window().maximize();
		myd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String title = myd.getTitle();
		if(title.equalsIgnoreCase("blazedemo")) {			
			
			System.out.println("Navigated successfully to blazedemo Homepage");
		}
		else {
			System.out.println("Invalid URL alert......Please verify the URL");
		}
		
		
		Homepagevalidation hv = new Homepagevalidation(myd);	//Calling Homepagevalidation class with reference variable
		Select select1 = new Select(hv.fromDD());
		select1.selectByVisibleText("Boston");
		myd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select select2 = new Select(hv.toDD());
		select2.selectByVisibleText("New York");
		myd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		hv.find().click();
		myd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		String Reserve = myd.getTitle();
		
		if(Reserve.equalsIgnoreCase("BlazeDemo - reserve")) {	
			
			System.out.println("Navigated successfully to Flight Reservation page");
		}	
		
		
		Reservationpage rp = new Reservationpage(myd);		//Calling Reservationpage class with reference variable
		rp.chooseflight().click();
		myd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String flightselect = myd.getTitle();
		if(flightselect.equalsIgnoreCase("BlazeDemo Purchase")) {
			
			System.out.println("Navigated successfully to Flight Purchase page"); 
		}	
		
		
		Purchasepage pg = new Purchasepage(myd);			//Calling purchasepage class with reference variable
		pg.Name().sendKeys("Yathin");
		pg.Address().sendKeys("523 anikethana road");
		pg.City().sendKeys("Mysore");
		pg.State().sendKeys("Karnataka");
		pg.Zipcode().sendKeys("570023");
		pg.Cardnumber().sendKeys("180020190000");
		pg.nameoncard().sendKeys("Yathin H K");
		pg.rememberme().click();
		pg.Purchase().submit();
		
		myd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		String confirmation = myd.getTitle();
		if(confirmation.equalsIgnoreCase("BlazeDemo Confirmation")) {
			
			System.out.println("Navigated successfully to Flight Confirmation page"); 
		}	
		
		
		Confirmationpage cp = new Confirmationpage(myd);   //Calling Confirmationpage class with reference variable
		String amt = cp.amount().getText();
		String Card = cp.card().getText();
		String Exp = cp.expiration().getText();
		
		System.out.println("Amount :"+amt);
		System.out.println("Card Details :"+Card);
		System.out.println("Expiration :"+Exp);
		
		
		myd.switchTo().defaultContent();
		myd.close();
		
				
	}
	
	@AfterTest
	public void Ts003()
	{
		myd.close();
	}

	
}
