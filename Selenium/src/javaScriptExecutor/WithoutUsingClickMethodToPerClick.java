package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingClickMethodToPerClick {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement login=driver.findElement(By.partialLinkText("Log in"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("argument[0].click();",login);
		Thread.sleep(1000);
		driver.quit();
}
}
