package com.ostmodern.bfiplayer.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumHelper {

	//private static WebDriver driver = new MyDriver(PropertyWebdriver.getDriver());
	private static WebDriver driver = new FirefoxDriver();
	
	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static WebElement findElement(By element) {
		return (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(element));
	}

	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void click(By elementSelector) {
		WebElement element = findElement(elementSelector);
		element.click();
	}
	
	public static void type(By elementSelector, String text) {
		WebElement element = findElement(elementSelector);
		element.sendKeys(text);
	}
	
	public static void selectCheckBox(By elementSelector) {
		WebElement element = findElement(elementSelector);
		if ( !element.isSelected()){
			element.click();
		}
	}

	public static void unSelectCheckBox(By elementSelector) {
		WebElement element = findElement(elementSelector);
		if (element.isSelected()){
			element.click();
		}
	}
	
	public static String getVisibleText(By elementSelector) {
		WebElement element = findElement(elementSelector);
		return element.getText();
	}

	public static String getDataContentOfTooltip(By elementSelector) {
		WebElement element = findElement(elementSelector);
		return element.getAttribute("data-content");
	}
	
	public static void exit() {
		driver.quit();
	}	
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}		

}
