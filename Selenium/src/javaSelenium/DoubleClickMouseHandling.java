package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseHandling {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		WebElement doubleclick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click me to see Alert message')]"));
   		Actions act=new Actions(driver);
   		act.doubleClick(doubleclick).perform();              //directly go to the elment and double click &perfome is mandatory(same line method chainning)
   		//(or)
   		act.moveToElement(doubleclick).doubleClick().perform(); //first move to the element then double click& perform is mantory(same line method chaing) 
   		Thread.sleep(1000);
   		driver.quit();
	}
}
