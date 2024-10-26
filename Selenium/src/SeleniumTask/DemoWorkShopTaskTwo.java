package SeleniumTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWorkShopTaskTwo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Login
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
	    Thread.sleep(1000);
	    
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
	    Thread.sleep(2000);
	    //click Remove
	    driver.findElement(By.xpath("//input[@title='Remove']")).click();
	    Thread.sleep(2000);
	    
	    //logout
	    driver.findElement(By.className("ico-logout")).click();                          
		Thread.sleep(2000);
		driver.quit();
	    
	    

	}
}   