package javaSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassKeyboard {
     public static void main(String[] args) throws AWTException, InterruptedException {
    	 WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
   		driver.get("https://demowebshop.tricentis.com/");
   		driver.findElement(By.partialLinkText("Log in")).click();
   		driver.findElement(By.id("Email")).sendKeys("manugowda123@gmail.com");
   		Thread.sleep(2000);
   		
   		Robot robo=new Robot();        //AWTException     import java robot
   		//select
   		robo.keyPress(KeyEvent.VK_CONTROL);
   		robo.keyPress(KeyEvent.VK_A);
   		robo.keyRelease(KeyEvent.VK_CONTROL);
   		robo.keyRelease(KeyEvent.VK_A);
   		Thread.sleep(2000);
   		
   		//copy
   		robo.keyPress(KeyEvent.VK_CONTROL);
   		robo.keyPress(KeyEvent.VK_C);
   		robo.keyRelease(KeyEvent.VK_CONTROL);
   		robo.keyRelease(KeyEvent.VK_C);
   		
   		//next use tab
   		robo.keyPress(KeyEvent.VK_TAB);
   		robo.keyRelease(KeyEvent.VK_TAB);
   		Thread.sleep(2000);
   		
   		//paste
   		robo.keyPress(KeyEvent.VK_CONTROL);
   		robo.keyPress(KeyEvent.VK_V);
   		robo.keyRelease(KeyEvent.VK_CONTROL);
   		robo.keyRelease(KeyEvent.VK_V);
   		driver.quit();
   		
   		
   		
	}
}
