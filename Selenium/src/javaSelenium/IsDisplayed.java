package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
   public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://demowebshop.tricentis.com/");
		
		  driver.findElement(By.partialLinkText("Log in")).click();
		  
		  String textElement=driver.getTitle(); if(textElement.contains("Login")) {         //using title method
		  System.out.println("Login page is displayed"); } else {
		  System.out.println("Login page is not displayed"); }
		 
  		driver.findElement(By.partialLinkText("Log in")).click();
		
		  String url=driver.getCurrentUrl(); if(url.contains("login")) {       //using url
		  System.out.println("Login page is dispalyed"); } else {
		  System.out.println("login page is not displayed"); }
		 
  		driver.findElement(By.className("ico-login")).click();     //class name   give only value
  		
  		
  		WebElement forgotPassword=driver.findElement(By.xpath("//a[text()='Forgot password?']"));
  		if(forgotPassword.isDisplayed())
  		{
  			System.out.println("Login page is dispalyed");
  		}
  		else
  		{
  			System.out.println("login page is not displayed");
  		}
  		
  		driver.quit();
   }
}
