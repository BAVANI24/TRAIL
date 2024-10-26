package Grooming;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='cars']"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(0);
		sel.selectByIndex(2);
		sel.selectByIndex(5);
		
		  List<WebElement> options=sel.getAllSelectedOptions();
		  
		  for(WebElement all:options) {                                    //selected option print
		  System.out.println(all.getText()); }
		 
	
		  driver.quit();
		}
}
