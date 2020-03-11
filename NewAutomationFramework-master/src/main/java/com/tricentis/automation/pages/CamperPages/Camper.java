package com.tricentis.automation.pages.CamperPages;

import org.openqa.selenium.WebDriver;

public class Camper {
	
	public Camper_EnterInsuranceData insuranceData ;
	public Camper_EnterProductData productData ;
	public Camper_EnterVehicleData vehicleData;
	public Camper_SelectPriceOption selectPrice ;
	public Camper_SendQuote sendQuote;
	
	public Camper(WebDriver dr)
	{
		insuranceData = new Camper_EnterInsuranceData(dr);
		productData = new Camper_EnterProductData(dr);
		vehicleData = new Camper_EnterVehicleData(dr);
		selectPrice = new Camper_SelectPriceOption(dr);
		sendQuote=new Camper_SendQuote(dr);

}
}
