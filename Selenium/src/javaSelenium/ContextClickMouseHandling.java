package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMouseHandling {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://demowebshop.tricentis.com/");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		WebElement electronics=driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a"));
   		//mouse
   		Actions act=new Actions(driver);
   		act.contextClick(electronics).perform();                  //directly Right click perform action allow method chainnig 
   		  //(or)
   		act.moveToElement(electronics).contextClick().perform();  // firs move to the element then right click same line perform method allow because method chaing
   		Thread.sleep(1000);
   		driver.quit();
	}
}
