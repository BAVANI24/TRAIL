package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//driver.switchTo().frame(0);   // using index to handle frame 
		
		//driver.switchTo().frame("firstFr");    //  using id or name to handle frame
		
		WebElement frame=driver.findElement(By.name("firstFr"));    //using webelement to handle frame
		driver.switchTo().frame(frame);
		
		driver.findElement(By.name("fname")).sendKeys("bavani");
		Thread.sleep(1000);
		
		//switch the driver focus inner to parent---> with help of defaultcontent
		driver.switchTo().defaultContent();
		
		WebElement title=driver.findElement(By.xpath("//h1[contains(text(),'Frame')]"));
		System.out.println(title.getText());
		driver.quit();
		
	}
}
