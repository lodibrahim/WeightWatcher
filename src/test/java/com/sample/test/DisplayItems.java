package com.sample.test;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sample.page.HomePage;

public class DisplayItems {
	WebDriver driver;
    HomePage objHomePage;

	@Before //BeforeClass also can be used depending on needs
	public void setup(){
	System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	String inputFilePath = "src/main/java/com/sample/shared/WebPage.html";
	String url = new File(inputFilePath).getAbsolutePath();
	driver.get("file:///"+url);
    //Utility.StartBrowser("Chrome", "http://demo.guru99.com/V4/"); //alternate way
	}
	@Test
	public void printItems(){
	objHomePage=new HomePage(driver);
	System.out.println(objHomePage.getThirdItem());
	System.out.println(objHomePage.getFifthItem());
	}
	@After
	public void close(){
		driver.close();
	}
}
