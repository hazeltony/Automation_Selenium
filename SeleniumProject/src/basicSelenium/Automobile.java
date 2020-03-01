package basicSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver(); 
		dr.manage().window().maximize(); 
		dr.get("http://sampleapp.tricentis.com/101/"); 
		dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement automobile =dr.findElement(By.cssSelector("a#nav_automobile"));
		automobile.click();
		
		//Select make
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Porsche");
		
		//Enter Engine Performance
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
		
		//Select date of manufacture
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/24/2020");
		
		//Select number of seats
		Select  seat = new Select(dr.findElement(By.id("numberofseats")));
		seat.selectByValue("4");
	   
		//Select fuel type
		Select fuel= new Select(dr.findElement(By.id("fuel")));
		fuel.selectByValue("Electric Power");
		
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
		
		//Check before click
		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected());
		
		//enter gender
		//dr.findElement(By.xpath("(//span[@class='ideal-radio'])[1]")).click(); //xpath using occurence
		dr.findElement(By.xpath("//label[text()='Female']/span")).click(); //xpath using multiple labels
		
		System.out.println(dr.findElement(By.xpath("//label[text()='Female']/input")).isSelected()); //to check if it is selected
		
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
		dr.findElement(By.xpath("//label[contains(.,'diving')]/span")).click(); //xpath using contains
		
		//Enter Website
		dr.findElement(By.id("website")).sendKeys("www.google.com");
		
		
		//Select Picture
	  
		
		//click next 
		dr.findElement(By.id("nextenterproductdata")).click();
		
		//Start date
		dr.findElement(By.id("startdate")).sendKeys("09/16/2020");
		
		//Select insurance sum
		Select insur = new Select(dr.findElement(By.id("insurancesum")));
		insur.selectByValue("10000000");
		
		//Select Merit rating
		Select mr = new Select(dr.findElement(By.id("meritrating")));
		mr.selectByValue("Bonus 8");
		
		//Select Damage Insurance
		Select damage = new Select(dr.findElement(By.id("damageinsurance")));
		damage.selectByValue("Full Coverage");
		
		//checkbox optional products
		dr.findElement(By.xpath("//label[contains(.,'Defense')]/span")).click();
		
		//Select Courtesy car
		Select cc = new Select(dr.findElement(By.id("courtesycar")));
		cc.selectByValue("Yes");
		
		//click next
		dr.findElement(By.id("nextselectpriceoption")).click();
		
		//Thread.sleep(2000);
		
		//Select price option - radiobutton
		dr.findElement(By.xpath("//section[@id='pricePlans']//label[3]//span[1]")).click();  //input[@id='selectgold']
		
		String parent = dr.getWindowHandle();
		//Click viewquote
		//dr.findElement(By.xpath("//a[@id='viewquote']")).click();
				
		/*
		 * Set<String> wins =dr.getWindowHandles();
		 * 
		 * for(String w:wins)
		 * 
		 * { if(!w.equals(parent)) dr.switchTo().window(w); } */
		  //Thread.sleep(9000);
		  
		 // dr.switchTo().window(parent);
		 
		
		//Download quote
		dr.findElement(By.xpath("//a[@id='downloadquote']")).click();
		dr.switchTo().window(parent);
		
				
		Thread.sleep(7000);
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
