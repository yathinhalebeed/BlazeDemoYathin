package Blazedemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reservationpage {
	
	public WebDriver myd;

	public Reservationpage(WebDriver myd) {
		super();
		this.myd = myd;
	}
	
	By chooseflight = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
	
	public WebElement chooseflight() {
		
		return myd.findElement(chooseflight);
		
	}

}
