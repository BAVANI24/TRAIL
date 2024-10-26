package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptioninDropDownHandling {
      public static void main(String[] args) throws InterruptedException {
    	  WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		WebElement countryDropDown=driver.findElement(By.name("country"));
  		WebElement monthDropDown=driver.findElement(By.name("Month"));
  		
  		Select countrySelect=new Select(countryDropDown);
  		Select  monthSelect=new Select(monthDropDown);
  		
  		monthSelect.selectByIndex(4);
  		monthSelect.selectByVisibleText("July");
  		monthSelect.selectByValue("Aug");
  		Thread.sleep(1000);
  		
  		monthSelect.deselectByIndex(4);
  		Thread.sleep(1000);
  		monthSelect.deselectByValue("Aug");
  		Thread.sleep(1000);
  		monthSelect.deselectByVisibleText("July");
  		Thread.sleep(1000);
  		//monthSelect.deselectAll();     //deselct all
  		driver.quit();
	}
}
