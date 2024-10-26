package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.xpath("//a[@title='Tamil']"));
		System.out.println(element.getAttribute("title"));
		Thread.sleep(2000);
		driver.quit();
	}
}
