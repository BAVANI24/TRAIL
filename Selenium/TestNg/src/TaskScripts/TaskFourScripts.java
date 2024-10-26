package TaskScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TaskFourScripts extends BaseClass {
	@Test(groups = "system")
	public void wishlistToAddToCard() throws InterruptedException {
		//Select product
	    driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a")).click();
	    driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	    driver.findElement(By.xpath("//div[@data-productid='43']")).click();
	    Reporter.log("Product Selected",true);
	    Thread.sleep(1000);
	    //Add to WishList
	    driver.findElement(By.id("add-to-wishlist-button-43")).click();
	    Thread.sleep(1000);
	    Reporter.log("Add to Wishlist",true);
	    
	    //WishList
	    driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	    Thread.sleep(1000);
	    Reporter.log("Wishlist",true);
	    
	    //Change WishList to Add to cart
	    driver.findElement(By.xpath("//td[@class='add-to-cart']/input")).click();        //click add to cart checkBox
	    Thread.sleep(1000);
	    WebElement qty=driver.findElement(By.xpath("//td[@class='qty nobr']//input"));        //Quantity fixed
	    qty.clear();
	    qty.sendKeys("1");
	    Thread.sleep(1000);
	    Reporter.log("Quantity Set",true);
	    
	    //Add to cart
	    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	    Thread.sleep(1000);
	    Reporter.log("Add to card",true);
	    
	}
}
