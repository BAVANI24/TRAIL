package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
      public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://demowebshop.tricentis.com/");
  		WebElement textBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
  		Rectangle rect=textBox.getRect();
  		
  		System.out.println(rect.getHeight());
  		System.out.println(rect.getWidth());
  		System.out.println(rect.getX());
  		System.out.println(rect.getY());
  		Thread.sleep(2000);
  		driver.quit();
	}
}
