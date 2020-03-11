package com.tricentis.automation.pages.AutomobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automobile_EnterVehicleData {
	
	 WebDriver dr;
	 
	 @FindBy(id="engineperformance")
	 WebElement engineperformance;
	
	public Automobile_EnterVehicleData(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}

	public String getTitle() {
			
			return dr.getTitle();
	}
			
	public void enterEnginePerformance(String performanceKW) {
				
				engineperformance.sendKeys(performanceKW);
				
			}
	
	}

