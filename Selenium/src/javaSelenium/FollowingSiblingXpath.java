package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblingXpath {
   public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/desktops");
//	 driver.findElement(By.xpath("//input[@id='small-searchterms']/following-sibling::input")).click();    xpath by folling siblind
	 //driver.findElement(By.xpath("//input[@id='small-searchterms']/preceding-sibling::span")).click();     //xpath by preceding sibling
	// String price=driver.findElement(By.xpath("//a[text()='Build your own computer']/../../div[3]/div[1]/span")).getText();
	 
	 String price=driver.findElement(By.xpath("//a[text()='Build your own computer']/../following-sibling::div[3]/div/span")).getText();  //xpath dynamic by sibling find in price
	 System.out.println(price);
	 Thread.sleep(2000);
	 driver.quit();
}
}
