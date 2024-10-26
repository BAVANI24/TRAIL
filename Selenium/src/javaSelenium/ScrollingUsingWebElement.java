package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingWebElement {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));     //it show scroll that webElent
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
