package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnumKeyboard {
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
  		driver.get("https://demowebshop.tricentis.com/");
  		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
  		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("manugowda123@gmail.com",Keys.TAB,"12345678",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);
  		driver.quit();
  		
  		
	}
}
