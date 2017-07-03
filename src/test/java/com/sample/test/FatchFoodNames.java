package com.sample.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sample.page.HomePage;

public class FatchFoodNames {
	WebDriver driver;
	HomePage objHomePage;
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		String inputFilePath = "src/main/java/com/sample/shared/WebPage.html";
		String url = new File(inputFilePath).getAbsolutePath();
		driver.get("file:///"+url);
	}
	@Test
	public void printsItems(){
		objHomePage=new HomePage(driver);
		Map<String,String> mp=new HashMap<String,String>();
		int numberofTags=objHomePage.getNumberOfTages("span");
		for(int i=1; i<numberofTags;i++){
			String food=objHomePage.printFdSrvg(i);
			String serving=objHomePage.printFdSrvg(i+1);//skipping to servings
			mp.put(food,serving);
			i++; //get next fooditem
		}
		for (String food : mp.keySet()){
			String servigs=mp.get(food);
			System.out.println("food is :"+food);
			System.out.println("servings is :"+servigs);
		}
	}
}
