package testScriptsGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassGroup.BaseClassGroup;

public class UpdateAddress extends BaseClassGroup {
	@Test(groups = "smoke")
	public void updateAddress(){
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();     //click mail id to go to customer profile
		driver.findElement(By.xpath("//ul[@class='list']/li[2]/a")).click();                //click on address
		driver.findElement(By.xpath("//div[@class='address-list']//div[2]//div[2]//input[1]")).click();
		WebElement textBoxEdit=driver.findElement(By.id("Address_FirstName"));
		textBoxEdit.clear();
		textBoxEdit.sendKeys("BavaniBavani");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 save-address-button')]")).click();   //click the save button
		Reporter.log("Update Address",true);
	}
}
