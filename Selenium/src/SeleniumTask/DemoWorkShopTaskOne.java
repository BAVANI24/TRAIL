package SeleniumTask;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWorkShopTaskOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Register
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("BAVANI");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		driver.findElement(By.id("register-button")).click();
		System.out.println("Register Successfully!!!");
		Thread.sleep(1000);
		//Login
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		System.out.println("Login Successfully!!!");
		//My Account(Customer Information)
		driver.findElement(By.className("account")).click();
		WebElement textBox=driver.findElement(By.id("LastName"));
		textBox.clear();
		textBox.sendKeys("Murugan");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 save-customer-info-button')]")).click();   //click save button
		System.out.println("View Customer information done...");
		Thread.sleep(2000);
		//My Account(Addresses)
		//---------------------
		//Add Address
		driver.findElement(By.xpath("//ul[@class='list']/li[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'button-1 add-address-button')]")).click();    //click Add New button
		driver.findElement(By.id("Address_FirstName")).sendKeys("Bavani");
		driver.findElement(By.id("Address_LastName")).sendKeys("M");
		driver.findElement(By.id("Address_Email")).sendKeys("bavimurugan0407@gmail.com");
		
		WebElement countryDropDown=driver.findElement(By.id("Address_CountryId"));
		Select countrySelect=new Select(countryDropDown);                                            //select Country using SelectClass
		countrySelect.selectByValue("41");
		
		driver.findElement(By.id("Address_City")).sendKeys("Thoothukkudi");
		driver.findElement(By.id("Address_Address1")).sendKeys("40/M BharathiNagar,Kayathar(Po&Tk),thoothukkudi(Dt)");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("628952");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9597006753");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 save-address-button')]")).click();   //click the save button
		System.out.println(" Save button clicked...");
		Thread.sleep(2000);
	    //Edit Address
		driver.findElement(By.xpath("//div[@class='address-list']/div[1]/div[2]/input[1]")).click();        //click the edit button
		System.out.println("Edit button Clicked...");
		Thread.sleep(1000);
		WebElement textBoxEdit=driver.findElement(By.id("Address_FirstName"));
		textBoxEdit.clear();
		textBoxEdit.sendKeys("Bava");
		driver.findElement(By.xpath("//input[contains(@class,'button-1 save-address-button')]")).click();   //click the save button
		System.out.println("Save button Clicked...");
		System.out.println("Address Edit successfully!!!");
		Thread.sleep(2000);
		//Delete Address
		driver.findElement(By.xpath("//div[@class='address-list']/div[2]/div[2]/input[2]")).click();      //click the delete button
		Thread.sleep(1000);
		
		Alert alt=driver.switchTo().alert();          //alert Handling 
		alt.accept();
		System.out.println("Address delete successfully!!!");
		Thread.sleep(1000);
		
	    //logout
		driver.findElement(By.className("ico-logout")).click();                             //click logout
		System.out.println("Logout Successfully!!!!");
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
