package com.sample.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sample.page.FinanceMainPage;
import com.sample.shared.MobileUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest {
	private DesiredCapabilities capabilities;
	private URL url;
	AndroidDriver driver ;
	FinanceMainPage objHomePage;
	MobileUtility objMbl;

	@Before
	public void setup() throws MalformedURLException{
		//Utility class also replace blew codes
		capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 3");
		capabilities.setCapability(MobileCapabilityType.VERSION, "7.1.1");
		capabilities.setCapability("appPackage", "org.dayup.stocks");
		capabilities.setCapability("appActivity", "org.dayup.stocks.StocksActivity");
		url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
	}
	@Test
	public void test1() throws MalformedURLException {
		objHomePage=new FinanceMainPage(driver);
		objHomePage.clickSearchbtn();
		objHomePage.search("NYSE");
		objHomePage.clickByVisibleText("NYSE Composite Index");
		objHomePage.clickByVisibleText("1Y");
		double lasttrade = objHomePage.getCurrentPrice();
		System.out.println(lasttrade);
		double highestPrce = objHomePage.getHighstTrdPric();
		double lowstPrce = objHomePage.getLowstTrdPric();
		double a=objHomePage.getPercentFromTotal(lasttrade, highestPrce);
		double b=objHomePage.getPercentFromTotal(lasttrade, lowstPrce);
		System.out.println("Stock is down by :"+a+"%");
		System.out.println("Stock is up by :"+b+"%");

	}
}