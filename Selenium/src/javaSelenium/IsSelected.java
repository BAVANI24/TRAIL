package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://demowebshop.tricentis.com/");
   		WebElement textBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
   		System.out.println(textBox.isEnabled());
   		Thread.sleep(2000);
   		driver.close();
	}
}
