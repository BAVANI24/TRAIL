package javaSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsinDropDownHandling {
    public static void main(String[] args) throws InterruptedException {
    	   WebDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    		WebElement monthDropDown=driver.findElement(By.name("Month"));
    		
    		Select monthSel=new Select(monthDropDown);
    		monthSel.selectByIndex(2);
    		monthSel.selectByValue("Ap");
    		monthSel.selectByVisibleText("July");
    		List<WebElement> allOptions=monthSel.getOptions();
    		
    	    for(WebElement options:allOptions) {
    	    	System.out.println(options.getText());      //we get all options in dropdown  o/p--->Month... january,....december
    	    }
    	    Thread.sleep(1000);
    	    driver.quit();
	}
}
