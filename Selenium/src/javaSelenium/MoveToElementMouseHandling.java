package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMouseHandling {
          public static void main(String[] args) {
        	 WebDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.get("https://demowebshop.tricentis.com/");
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      		WebElement electronics=driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a"));
      		
      		Actions act=new Actions(driver);
      		act.moveToElement(electronics);
      		act.perform();
      		driver.quit();
		}
}
