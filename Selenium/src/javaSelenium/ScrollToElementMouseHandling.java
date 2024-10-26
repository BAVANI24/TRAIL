package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMouseHandling {
    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		WebElement scrolldown=driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
   		Actions act=new Actions(driver);
   		act.scrollToElement(scrolldown).perform();   //direcly go to element then scroll down using action class
   	    driver.quit();
	}
}
