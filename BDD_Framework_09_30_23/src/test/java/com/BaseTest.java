package com;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import page.HomePage;

public class BaseTest {
	
	/*WebDriver dr;
	
	
	public void openBrowser() throws IOException {
		
		String s = System.getProperty("Browser");
		//mvn test  -DBrowser=Chrome  -Durl=https://www.facebook.com
		if (s.equals("Chrome")) {
			dr = new ChromeDriver();
		} else if(s.equals("Firefox")) {
			dr = new FirefoxDriver();
		} else if (s.equals("Safari")) {
			dr = new SafariDriver();
		}
		
	}
	
	public HomePage gotoURL() {
		
		dr.get(System.getProperty("url"));
		
		return new HomePage(dr);
		
	}*/
	
	//From data Table
	
	WebDriver dr;
	
	
	public void openBrowser(String s) throws IOException {
		
		
		
		if (s.equals("Chrome")) {
			dr = new ChromeDriver();
		} else if(s.equals("Firefox")) {
			dr = new FirefoxDriver();
		} else if (s.equals("Safari")) {
			dr = new SafariDriver();
		}
		
	}
	
	public HomePage gotoURL() {
		
		dr.get(System.getProperty("url"));
		
		return new HomePage(dr);
		
	}

}
