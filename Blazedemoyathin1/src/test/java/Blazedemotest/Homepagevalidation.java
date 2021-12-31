package Blazedemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepagevalidation {

	public WebDriver myd;

	public Homepagevalidation(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By fromDD = By.name("fromPort");
	
	By toDD = By.name("toPort");
	
	By Find = By.xpath("//input[@class='btn btn-primary']");
	
	public WebElement fromDD() {
	
		return myd.findElement(fromDD);
		
	}
	
	public WebElement toDD() {
		
		return myd.findElement(toDD);
		
	}
	
	public WebElement find() {
		
		return myd.findElement(Find);
		
	}
	
	
}
