package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTask {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("BAVANI");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("M");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
