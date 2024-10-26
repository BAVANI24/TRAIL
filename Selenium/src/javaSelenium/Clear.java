package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement text=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		text.sendKeys("hii");
		Thread.sleep(2000);
		text.clear();
		driver.quit();
	}
}
