package javaSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingXAccessYAccess {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://demowebshop.tricentis.com/");
	driver.get("https://letcode.in/frame");
	Thread.sleep(2000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1000);");        //Scroll down
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,-1000);");       //scroll up
	
	Thread.sleep(2000);
	driver.quit();
	
  }
}
