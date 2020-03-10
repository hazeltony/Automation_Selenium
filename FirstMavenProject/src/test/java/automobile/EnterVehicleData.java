package automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnterVehicleData  extends TestInitialization{
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Pre conditions for DependsOnMethod Vehicle class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Post conditions for DependsOnMethod Vehicle  class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		dr.findElement(By.cssSelector("a#nav_automobile")).click();
		System.out.println("Pre condition for every test Vehicle  case");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Post condition for every test Vehicle case");
		}
	@Test
	public void make() {
		
		Select sel = new Select(dr.findElement(By.id("make")));
		sel.selectByVisibleText("Porsche");
	}
	@Test
	public void engineperf() {
		
		dr.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1200");
	}
	@Test
	public void dom() {
		
		dr.findElement(By.id("dateofmanufacture")).sendKeys("02/24/2020");
	}

}
