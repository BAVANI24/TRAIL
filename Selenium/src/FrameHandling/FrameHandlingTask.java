package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//using index to switch frist frame
		driver.switchTo().frame(0);   
		Thread.sleep(1000);
		driver.findElement(By.name("fname")).sendKeys("bavani");
		
		//using web element to switch the frame to innerframe(secondframe)
		WebElement innerFrame=driver.findElement(By.xpath("//iframe[contains(@class,'has-background-white')]")); 
		driver.switchTo().frame(innerFrame);
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("bavimurugan0407@gmail.com");
		
		//using parentframe to switch driver focus child to previous frame
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.name("lname")).sendKeys("murugan");
		
		Thread.sleep(1000);
		driver.quit();
	}
}
