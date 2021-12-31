package Blazedemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Purchasepage {
	
	public WebDriver myd;

	public Purchasepage(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By Name = By.id("inputName");
	
	By Address = By.id("address");
	
	By City = By.id("city");
	
	By State = By.id("state");
	
	By Zipcode = By.id("zipCode");
	
	By creditnumber = By.id("creditCardNumber");
	
	By Nameoncard = By.id("nameOnCard");
	
	By Rememberme = By.xpath("//input[@id='rememberMe']");
	
	By Purchase = By.xpath("//input[@class='btn btn-primary']");
	
	public WebElement Name() {
		
		return myd.findElement(Name);
	}
	
	public WebElement Address() {
		
		return myd.findElement(Address);
	}
	
	public WebElement City() {
		
		return myd.findElement(City);
	}

	public WebElement State() {
		
		return myd.findElement(State);
	}

	public WebElement Zipcode() {
		
		return myd.findElement(Zipcode);
	}

	public WebElement Cardnumber() {
	
	return myd.findElement(creditnumber);
	}
	
	public WebElement nameoncard() {
		
		return myd.findElement(Nameoncard);
	}
	
	public WebElement rememberme() {
		
		return myd.findElement(Rememberme);
	}
	
	public WebElement Purchase() {
		
		return myd.findElement(Purchase);
	}

}
