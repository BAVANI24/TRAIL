package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String price=driver.findElement(By.xpath("//a[text()='Simple Computer']/../../div[3]/div/span")).getText();   //xpath dynamic parent to findprice
		System.out.println(price);
		String price1=driver.findElement(By.xpath("//a[text()='Build your own computer']/../following-sibling::div[3]/div/span")).getText();  //xpath dynamic sibling to find price
		System.out.println(price1);
		
	    String price2 =driver.findElement(By.xpath("//a[text()='Blue Jeans']/../../div[3]/div/span")).getText(); 
	    System.out.println(price2);
		 
		String pr=driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../../div[3]/div/span")).getText();
		String pri=driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../../div[3]/div/span")).getText();
		System.out.println(pri);
		Thread.sleep(2000);
		driver.quit();
	}
}
