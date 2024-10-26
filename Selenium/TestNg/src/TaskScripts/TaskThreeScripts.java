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

public class TaskThreeScripts extends BaseClass {
	@Test(groups = "smoke")
	public void addToCompare() throws InterruptedException, AWTException {
		//Search Product
	    driver.findElement(By.id("small-searchterms")).sendKeys("14.1-inch Laptop");
	    Thread.sleep(1000);
	    
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
	    
	   //Click add to Compare 
	    driver.findElement(By.xpath("//input[contains(@class,'button-2 add-to-compare-list-button')]")).click();
	    Reporter.log("Add to Compare",true);
	    Thread.sleep(2000);
	    //click Remove
	    driver.findElement(By.xpath("//input[@title='Remove']")).click();
	    Reporter.log("Remove",true);
	    Thread.sleep(2000);
	}
}
