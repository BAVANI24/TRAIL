
package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class Dummy extends BaseClass {
	@Test
	public void addAddress() {
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();     //click mail id to go to customer profile
		driver.findElement(By.xpath("//ul[@class='list']/li[2]/a")).click();                //click on address
		driver.findElement(By.xpath("//input[contains(@class,'button-1 add-address-button')]")).click();    //click Add New button
		driver.findElement(By.id("Address_FirstName")).sendKeys("Bavani");
		driver.findElement(By.id("Address_LastName")).sendKeys("M");
		driver.findElement(By.id("Address_Email")).sendKeys("bavimurugan0407@gmail.com");
		
		WebElement countryDropDown=driver.findElement(By.id("Address_CountryId"));
		Select countrySelect=new Select(countryDropDown);                                            //select Country using SelectClass
		countrySelect.selectByValue("41");
		
		driver.findElement(By.id("Address_City")).sendKeys("Thoothukkudi");
		driver.findElement(By.id("Address_Address1")).sendKeys("40/M BharathiNagar,Kayathar(Po&Tk),thoothukkudi(Dt)");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("628952");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9597006753");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 save-address-button')]")).click();  
		Reporter.log("Add Address",true);
		
	}
}
