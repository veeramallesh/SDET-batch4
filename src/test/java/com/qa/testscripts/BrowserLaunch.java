package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser="firefox";
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Software\\drivers\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	       
	       			
		} else if(browser.equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.ie.driver", "C:\\Software\\drivers\\IEDriverServer.exe");
		       driver = new InternetExplorerDriver();
		    
		     		
		}else if(browser.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Software\\drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
			 driver.manage().window().maximize();
		     driver.get("https://www.selenium.dev/");
	        
			
					
		}else if(browser.equalsIgnoreCase("edge")){
			
			System.setProperty("webdriver.edge.driver", "C:\\Software\\drivers\\msedgedriver.exe");
			 driver= new EdgeDriver();
			
		}
		
		 
	}

}
