package com.sample.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


	WebDriver driver;
	By thirdItem = By.xpath("//div[@class='itemContent']/span[3]");
	By fifthItem = By.xpath("//div[@class='itemContent']/span[5]");


	public HomePage(WebDriver driver){
		this.driver = driver;
	}

	public String printFdSrvg(int index) {
		return driver.findElement(By.xpath("//div[@class='itemContent']/span[" + index + "]")).getText();

	}
	public int getNumberOfTages(String tagName){
		List<WebElement> items=driver.findElements(By.xpath("//div[@class='itemContent']/"+tagName));
		return items.size();
	}
	public String getThirdItem(){
		return driver.findElement(thirdItem).getText();
	}
	public String getFifthItem(){
		return driver.findElement(fifthItem).getText();
	}
}
