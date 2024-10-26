package TaskScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TaskTwoScripts extends BaseClass{
	@Test
	public void checkOut() throws InterruptedException {
		//Add to card
	    driver.get("https://demowebshop.tricentis.com/141-inch-laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.id("add-to-cart-button-31")).click();
	    Reporter.log("Add to card",true);
	    
	    //Shopping cart
	    driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	    Reporter.log("Shopping card",true);
	        
	    //set Quantity
	    WebElement qty=driver.findElement(By.xpath("//td[@class='qty nobr']/input"));
	    qty.clear();
	    qty.sendKeys("1");
	    Reporter.log("Quantity set",true);
	    
	    WebElement countryDropDown=driver.findElement(By.id("CountryId"));
		Select countrySelect=new Select(countryDropDown);                                            //select Country using SelectClass
		countrySelect.selectByValue("41");
		
		driver.findElement(By.id("termsofservice")).click();   //click checkbox
		//checkout
		driver.findElement(By.id("checkout")).click();
		Reporter.log("CheckOut",true);
	}
}
