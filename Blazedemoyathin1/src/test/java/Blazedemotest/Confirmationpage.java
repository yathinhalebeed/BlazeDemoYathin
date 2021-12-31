package Blazedemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmationpage {
	
	public WebDriver myd;

	public Confirmationpage(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By amount = By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
	
	By card = By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]");
	
	By Expiration = By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");

	
	public WebElement amount() {
		return myd.findElement(amount);
	}
	
	public WebElement card() {
		return myd.findElement(card);
	}
	
	public WebElement expiration() {
		return myd.findElement(Expiration);
	}
}
