package javaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemwnts {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));    //multiple link print in findelements
	for(WebElement link:allLinks)
	{
		System.out.println(link.getText());
	}
	driver.quit();
}
}
