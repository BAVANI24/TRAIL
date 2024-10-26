package SeleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWorkShopTaskFour {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Login
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("RememberMe")).click();
	    driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
	    System.out.println("Login Successfully!!!");
	    Thread.sleep(1000);
	    
	    //Add to card
	    driver.get("https://demowebshop.tricentis.com/141-inch-laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.id("add-to-cart-button-31")).click();
	    System.out.println("Product Added to Shopping cart Successfully!!!");
	    
	    //Shopping cart
	    driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	    System.out.println("Open Shopping cart Successfully!!!");
	        
	    //set Quantity
	    WebElement qty=driver.findElement(By.xpath("//td[@class='qty nobr']/input"));
	    qty.clear();
	    qty.sendKeys("1");
	    System.out.println("Successfully set the quantity");
	    
	    WebElement countryDropDown=driver.findElement(By.id("CountryId"));
		Select countrySelect=new Select(countryDropDown);                                            //select Country using SelectClass
		countrySelect.selectByValue("41");
		
		driver.findElement(By.id("termsofservice")).click();   //click checkbox
		//checkout
		driver.findElement(By.id("checkout")).click();
		System.out.println("Successfully checkout!!!");
		
		//logout
	    driver.findElement(By.className("ico-logout")).click();
	    System.out.println("Login Successfully!!!");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
