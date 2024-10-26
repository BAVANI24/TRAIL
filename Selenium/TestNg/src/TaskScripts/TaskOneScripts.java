package TaskScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class TaskOneScripts extends BaseClass{
	@Test(groups = "integration")
	public void addToCart() throws InterruptedException, AWTException {
		//Search Product
	    driver.findElement(By.id("small-searchterms")).sendKeys("14.1-inch Laptop");
	    
	    Robot rbt=new Robot();           //Robot Class
	    rbt.keyPress(KeyEvent.VK_TAB);
	    rbt.keyRelease(KeyEvent.VK_TAB);
	    rbt.keyPress(KeyEvent.VK_ENTER);
	    rbt.keyRelease(KeyEvent.VK_ENTER);                 //click serch button
	    Thread.sleep(1000);
	    
	  //ScrollDown
	    WebElement scrollDown=driver.findElement(By.xpath("//div[@class='product-item']"));
	    Actions act=new Actions(driver);
	    act.scrollToElement(scrollDown); 
	    Thread.sleep(1000);
	    scrollDown.click();              //click WebElement
	    Thread.sleep(1000);
	    //Product Name
	    WebElement ProductName=driver.findElement(By.xpath("//h1[@itemprop='name']"));
	    System.out.println(ProductName.getText());
	    //Product Price
	    WebElement price=driver.findElement(By.className("price-value-31"));
	    System.out.println(price.getText());
	    
	    //Add To Cart
	    driver.findElement(By.id("add-to-cart-button-31")).click();
	    Reporter.log("Add to card",true);
	    
	}
}
