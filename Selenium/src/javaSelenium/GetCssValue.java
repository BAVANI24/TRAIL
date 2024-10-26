package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.xpath("//a[@title='Telugu']"));
//		System.out.println(element.getCssValue("text-align"));
		System.out.println(element.getCssValue("font-family"));
		Thread.sleep(2000);
		driver.quit();
}
}
