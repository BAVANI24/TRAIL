package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldReleaseMouseHandling {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
   		WebElement dragElement=driver.findElement(By.id("draggable"));
   		WebElement dropElement=driver.findElement(By.id("droppable"));
   		
   		Actions act=new Actions(driver);
   		act.clickAndHold(dragElement).release(dropElement).perform();   //first clickandhold drag element then release dropelementin dropelment 
   		//(or)
   		act.clickAndHold(dragElement).moveToElement(dropElement).release().perform();    //first click and hold dragelement then move to the dropElement and release
   		Thread.sleep(1000);
   		driver.quit();
	}
}
