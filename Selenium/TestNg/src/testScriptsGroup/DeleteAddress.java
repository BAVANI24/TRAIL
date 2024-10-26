package testScriptsGroup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClassGroup.BaseClassGroup;

public class DeleteAddress extends BaseClassGroup {
	@Test(groups = "Regression")
	public void deleteAddress() {
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();     //click mail id to go to customer profile
		driver.findElement(By.xpath("//ul[@class='list']/li[2]/a")).click();                //click on address
		driver.findElement(By.xpath("//div[@class='address-list']/div[2]/div[2]/input[2]")).click();      //click the delete button
		
		Alert alt=driver.switchTo().alert();          //alert Handling 
		alt.accept();
		Reporter.log("Delete Address",true);
	}
}
