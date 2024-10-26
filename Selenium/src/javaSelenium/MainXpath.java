package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainXpath {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("attribute");         //xpath by attributes
	Thread.sleep(1000);
	driver.findElement(By.className("ico-login")).click();                                            //first click login ten only we go password text field
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijay");                       //xpath by attributes
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();                                     //xpath by visibletext
	Thread.sleep(1000);
    driver.findElement(By.xpath("//a[text()='Register']")).click();                                   //xpath by visible text
    Thread.sleep(1000);
	driver.quit();
	
	
   }
}
