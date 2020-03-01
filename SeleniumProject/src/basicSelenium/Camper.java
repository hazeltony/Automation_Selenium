package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Camper {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("http://sampleapp.tricentis.com/101/"); 
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
		  WebElement camper=dr.findElement(By.xpath("//div[@class='main-navigation']//li[4]//a"));
		  camper.click();
		  
		//Select make
			Select sel = new Select(dr.findElement(By.id("make")));
			sel.selectByVisibleText("Mercedes Benz");
			
			//Enter Engine Performance
			dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
			
			//Select date of manufacture
			dr.findElement(By.id("dateofmanufacture")).sendKeys("02/24/2020");
			
			//Select number of seats
			Select  seat = new Select(dr.findElement(By.id("numberofseats")));
			seat.selectByValue("4");
			
			//click right hand drive
			dr.findElement(By.xpath("//label[text()='Yes']/span")).click();
			
			//Select fuel type
			Select fuel= new Select(dr.findElement(By.id("fuel")));
			fuel.selectByValue("Electric Power");
			
			//Select payload
			dr.findElement(By.id("payload")).sendKeys("50");
			
			//Provide total weight
			dr.findElement(By.id("totalweight")).sendKeys("7000");
			
			//listprice
			dr.findElement(By.id("listprice")).sendKeys("100000");
			
			//licensenumber
			dr.findElement(By.id("licenseplatenumber")).sendKeys("KBR 210");
			
			//Annual mileage
			dr.findElement(By.id("annualmileage")).sendKeys("250");
			
			//click next
			dr.findElement(By.id("nextenterinsurantdata")).click();
			
			//enter firstname
			dr.findElement(By.id("firstname")).sendKeys("Hazel");
			
			//enter lastname 
			dr.findElement(By.id("lastname")).sendKeys("Tony");
			
			//Dateof birth
			dr.findElement(By.id("birthdate")).sendKeys("11/21/1993");
			
			//enter gender
			//dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click(); //xpath using occurence
			dr.findElement(By.xpath("//label[text()='Female']/span")).click(); //xpath using multiple labels
			
			//enter street address
			dr.findElement(By.id("streetaddress")).sendKeys("Palm Atlaantis, B-901");
			
			//Select Country 
			Select place = new Select(dr.findElement(By.id("country")));
			place.selectByValue("India");
			
			//Enter zipcode
			dr.findElement(By.id("zipcode")).sendKeys("412207");
			
			//Enter City
			dr.findElement(By.id("city")).sendKeys("Pune");
			
			//Select Occupation
			Select job = new Select(dr.findElement(By.id("occupation")));
			job.selectByValue("Employee");
			
			//Select Hobbies
			dr.findElement(By.xpath("//label[contains(.,'diving')]/span")).click();
			
			//Enter Website
			dr.findElement(By.id("website")).sendKeys("www.google.com");
			
			//click next 
			dr.findElement(By.id("nextenterproductdata")).click();
			
			//Start date
			dr.findElement(By.id("startdate")).sendKeys("09/16/2020");
			
			//Select insurance sum
			Select insur = new Select(dr.findElement(By.id("insurancesum")));
			insur.selectByValue("10000000");
			
			//Select Damage Insurance
			Select damage = new Select(dr.findElement(By.id("damageinsurance")));
			damage.selectByValue("Full Coverage");
			
			//checkbox optional products
			dr.findElement(By.xpath("//label[contains(.,'Defense')]/span")).click();
			
			//click next
			dr.findElement(By.id("nextselectpriceoption")).click();
			
			//String parent = dr.getWindowHandle();
			//Select price option - radiobutton
			dr.findElement(By.xpath("//section[@id='pricePlans']//label[1]//span[1]")).click();
			
			//Download quote
			//dr.findElement(By.xpath("//a[@id='downloadquote']")).click();
			//dr.switchTo().window(parent);
			
			//clicknext
			dr.findElement(By.id("nextsendquote")).click();
			
			//enter emailaddress
			dr.findElement(By.id("email")).sendKeys("hazelt21@gmail.com");
			
			//enter mobile
			dr.findElement(By.id("phone")).sendKeys("9447668511");
			
			//enter username
			dr.findElement(By.id("username")).sendKeys("hazeltony");
			
			//enter password
			dr.findElement(By.id("password")).sendKeys("Hello123");
			
			//enter confirmpassword
			dr.findElement(By.id("confirmpassword")).sendKeys("Hello123");
			
			//enter comments
			dr.findElement(By.id("Comments")).sendKeys("Please proceed");
			

	}

}
