package com.tricentis.automation.libraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ApplicationLibrary {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("http://sampleapp.tricentis.com/101/"); 
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	

		
		  File scrFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		  String screenshotName = "H://Hazzel.png"; FileHandler.copy(scrFile,new
		  File(screenshotName));
		 
	}

}
