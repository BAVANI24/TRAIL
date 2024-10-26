package SeleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWorkShopFive {
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
	    //Select product
	    driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a")).click();
	    driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	    driver.findElement(By.xpath("//div[@data-productid='43']")).click();
	    System.out.println("Product selected Successfully!!");
	    Thread.sleep(1000);
	    //Add to WishList
	    driver.findElement(By.id("add-to-wishlist-button-43")).click();
	    Thread.sleep(1000);
	    System.out.println("Product is add to Wishlist Successfully!!!");
	    
	    //WishList
	    driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	    Thread.sleep(1000);
	    System.out.println("WishList is Displayed Successfully!!!");
	    
	    //Change WishList to Add to cart
	    driver.findElement(By.xpath("//td[@class='add-to-cart']/input")).click();        //click add to cart checkBox
	    Thread.sleep(1000);
	    WebElement qty=driver.findElement(By.xpath("//td[@class='qty nobr']//input"));        //Quantity fixed
	    qty.clear();
	    qty.sendKeys("1");
	    Thread.sleep(1000);
	    System.out.println("Quantity set..");
	    
	    //Add to cart
	    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	    Thread.sleep(1000);
	    System.out.println("Add to cart button clicked..");
	    
	    
		//logout
	    driver.findElement(By.className("ico-logout")).click();
	    System.out.println("Login Successfully!!!");
		Thread.sleep(2000);
		driver.quit();
	}
}
