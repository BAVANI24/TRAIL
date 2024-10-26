package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrobMouseHandling {
    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
   		WebElement dragElement=driver.findElement(By.id("draggable"));
   		WebElement dropElement=driver.findElement(By.id("droppable"));
   		
   		Actions act=new Actions(driver);
   		act.dragAndDrop(dragElement, dropElement).perform();
   		driver.quit();
	}
}
