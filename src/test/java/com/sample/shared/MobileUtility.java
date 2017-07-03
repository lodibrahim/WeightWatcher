package com.sample.shared;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sample.page.FinanceMainPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileUtility {

		private DesiredCapabilities capabilities;
		private URL url;
		AndroidDriver driver ;
		FinanceMainPage objHomePage;

		public MobileUtility(AndroidDriver driver){
			this.driver = driver;
		}

		public void setup() throws MalformedURLException{
			capabilities = DesiredCapabilities.android();
			capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 3");
			capabilities.setCapability(MobileCapabilityType.VERSION, "7.1.1");
			capabilities.setCapability("appPackage", "org.dayup.stocks");
			capabilities.setCapability("appActivity", "org.dayup.stocks.StocksActivity");
			url = new URL("http://0.0.0.0:4723/wd/hub");
			driver = new AndroidDriver(url, capabilities);
		}
	}
