
package javaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsinDropdownHandling {
    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement monthDropDown=driver.findElement(By.name("Month"));
		WebElement countryDropDown=driver.findElement(By.name("country"));
		
		Select countrySelect=new Select(countryDropDown);    //select class for country
		Select monthSelect=new Select(monthDropDown);        //select class for month
		
		//countrySelect.selectByVisibleText("Algeria");     //using selct option
		countrySelect.selectByValue("DZ");               //using selct option
		
		monthSelect.selectByValue("Ap");
		monthSelect.selectByVisibleText("July");
		monthSelect.selectByIndex(8);
		driver.quit();
	}
}
