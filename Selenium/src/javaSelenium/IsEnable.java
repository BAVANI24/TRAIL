package javaSelenium;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
    public static void main(String[] args) throws InterruptedException {
        	 WebDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.get("https://demowebshop.tricentis.com/");
      		driver.findElement(By.partialLinkText("Log in")).click();
      		WebElement checkBox=driver.findElement(By.id("RememberMe"));
      		System.out.println(checkBox.isSelected());
      		checkBox.click();
      		System.out.println(checkBox.isSelected());
      		Thread.sleep(2000);
      		driver.close();
      		
	}
}
