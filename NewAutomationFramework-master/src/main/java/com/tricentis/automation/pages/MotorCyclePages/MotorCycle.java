package com.tricentis.automation.pages.MotorCyclePages;

import org.openqa.selenium.WebDriver;

public class MotorCycle {
	public MotorCycle_EnterInsuranceData insuranceData ;
	public MotorCycle_EnterProductData productData ;
	public MotorCycle_EnterVehicleData vehicleData;
	public MotorCycle_SelectPriceOption selectPrice ;
	public MotorCycle_SendQuote sendQuote;
	
	public MotorCycle(WebDriver dr)
	{
		insuranceData = new MotorCycle_EnterInsuranceData(dr);
		productData = new MotorCycle_EnterProductData(dr);
		vehicleData = new MotorCycle_EnterVehicleData(dr);
		selectPrice = new MotorCycle_SelectPriceOption(dr);
		sendQuote=new MotorCycle_SendQuote(dr);

}
}
	

