package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTask {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
     	//driver.findElement(By.className("button-1 login-button")).click();
		//driver.findElement(By.cssSelector("Log in")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
