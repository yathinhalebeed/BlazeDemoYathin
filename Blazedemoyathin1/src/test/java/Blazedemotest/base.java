package Blazedemotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {
	
	public WebDriver myd;
	public String CBrowser;
	public String URL;
	public Properties properties;
	public FileInputStream fis;
	
	@Test
	public void Browsercall() throws IOException, InterruptedException {
		
		properties = new Properties(); // Properties variable declaration for reading the properties from data.properties file
		fis = new FileInputStream("C:\\Users\\00004945\\eclipse-workspace\\Blazedemoyathin1\\data.properties");
		properties.load(fis); // Loading the properties from data.properties file
		CBrowser = properties.getProperty("Browser");//Storing the browser details read from data.properties onto CBrowser
		URL = properties.getProperty("URL");
		
		if (CBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
			myd = new ChromeDriver();
			myd.get(URL);
			
		}
		
		else if(CBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Bin\\msedgedriver.exe");
			myd = new EdgeDriver();
			myd.get(URL);
			
		}
		else if(CBrowser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Bin\\geckodriver.exe");
			myd = new FirefoxDriver();
			myd.get(URL);
		
		}
		else {
			System.out.println("Browser not supported");
		}
		
	}

}
