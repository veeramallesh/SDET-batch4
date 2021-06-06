package com.qa.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Software\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String str=driver.getTitle();
		if (str.equals("GOOGLE")) {
			System.out.println("title is in upper case");
		}
		else {
			System.out.println("title is not in upper case");

		}

		driver.close();
	}

}
