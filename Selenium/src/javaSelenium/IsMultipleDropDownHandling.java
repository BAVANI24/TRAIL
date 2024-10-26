package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDropDownHandling {
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown1=driver.findElement(By.name("country"));        //o/p false because is alllow only one(country) not multiple
		WebElement dropdown2=driver.findElement(By.name("Month"));          //o/p true because is allow multiple(month)
		Select slt1=new Select(dropdown1);
		Select slt2=new Select(dropdown2);
		System.out.println(slt1.isMultiple());
		System.out.println(slt2.isMultiple());
		driver.quit();
	}
}
