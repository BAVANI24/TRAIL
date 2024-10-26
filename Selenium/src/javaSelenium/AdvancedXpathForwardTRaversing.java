package javaSelenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathForwardTRaversing {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/login");
//	   driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a")).click();        //forwardTraversing
//	   driver.findElement(By.xpath("//ul[@class='top-menu']/li[6]/a")).click();        //forward traversing
	   String price=driver.findElement(By.xpath("//a[text()='Desktop PC with CDRW']/../../div[3]/div[1]/span")).getText();  //dynamic webelement
	   System.out.println(price);
	   Thread.sleep(3000);
	   driver.quit();
   }
}
