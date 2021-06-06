package com.qa.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.GooglePage;

public class TC_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\drivers\\chromedriver.exe");
	      WebDriver  driver = new ChromeDriver();
	      driver.get("https://www.google.com/");
	      
	      GooglePage page=new GooglePage(driver);
	      
	      page.getGoogleSearchField().sendKeys("automation testing");
	      page.getGoogleSearchField().submit();
	    //  page.getGoogleSearchField().sendKeys(Keys.ENTER);
	      String title=driver.getTitle();
	      System.out.println(title);
	      
	      driver.close();
	}

}
