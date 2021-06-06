package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\drivers\\chromedriver.exe");
      WebDriver  driver = new ChromeDriver();
      driver.get("https://www.rediff.com/");
      driver.findElement(By.linkText("Create Account")).click();
      String regStr = driver.findElement(By.id("Register")).getAttribute("value");
      System.out.println(regStr);
      if(regStr.contains("Create my account")) {
    	  System.out.println("Registser page is opened");
      } else {
    	  System.out.println("Registser page is NOT opened");
      }
      
      driver.close();
	}

}
