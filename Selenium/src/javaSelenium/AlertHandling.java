package javaSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.id("simple")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();      
		
	   
	    Thread.sleep(1000);
	    driver.findElement(By.id("confirm")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(1000);
	    
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_PAGE_DOWN);
	    robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    
	    driver.findElement(By.id("prompt")).click();
	    Alert alt=driver.switchTo().alert();
	    System.out.println(alt.getText());
	    Thread.sleep(1000);
	    alt.sendKeys("bavani");
	    Thread.sleep(1000);
	    alt.accept();
	    Thread.sleep(2000);
		driver.quit();
	
	}
}
