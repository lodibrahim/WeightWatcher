package com.sample.page;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class FinanceMainPage {

	AndroidDriver driver;
	By searchButton = By.id("menu_insert");
	By searchBox = By.id("search_input");

	By high = By.id("details_yearRangeText_high");
	By low = By.id("details_yearRangeText_low");
	By lastTrade = By.id("details_lastTradedPrice");

	public FinanceMainPage(AndroidDriver driver) {
		this.driver = driver;
	}

	public String printFdSrvg(int index) {
		return driver.findElement(By.xpath("//div[@class='itemContent']/span[" + index + "]")).getText();

	}

	public void clickSearchbtn() {
		driver.findElement(searchButton).click();
	}

	public void search(String value) {
		driver.findElement(searchBox).sendKeys(value);
	}

	public double getCurrentPrice() {
		String price = driver.findElement(lastTrade).getText();
		double prin = Double.parseDouble(price);
		return prin;
	}

	public double getHighstTrdPric() {
		String price = driver.findElement(high).getText();
		double prin = Double.parseDouble(price);
		return prin;
	}

	public double getLowstTrdPric() {
		String price = driver.findElement(low).getText();
		double prin = Double.parseDouble(price);
		return prin;
	}

	public void clickByVisibleText(String visibleText) {
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")").click();
	}

	public static double getPercentFromTotal(double subtotal, double total) {
		return ((subtotal - total) / total);
	}

}
