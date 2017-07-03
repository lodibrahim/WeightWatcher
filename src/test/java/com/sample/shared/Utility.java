package com.sample.shared;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {

	static WebDriver driver;
	static WebElement element;

	public static WebDriver StartBrowser(String browserName, String url){
		if(browserName.equalsIgnoreCase("FireFox")){
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}
		driver.get(url);
		return driver;
	}

}
