package com.ostmodern.bfiplayer.steps;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertyWebdriver {
	public enum browserType{FIREFOX, IE}
	public static WebDriver getDriver() {
		browserType browser = browserType.valueOf(System.getProperty("browser", "FIREFOX"));
		switch (browser) {
		case FIREFOX:
			WebDriver driver = new FirefoxDriver();
			return driver;
		case IE:
			File file = new File("C:\\selenium\\IEDriverServer.exe");
  	       System.setProperty("webdriver.ie.driver", file.getAbsolutePath() );  
			return new InternetExplorerDriver();
		default: 
			break;
		}
		return null;
	}
}
