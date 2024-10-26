package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoginUsingDDT {
	public static void main(String[] args) throws IOException {
		
		//give the path
		FileInputStream fis=new FileInputStream("./TestNg/demo1.properties");
		//create object for properties
		Properties pObj=new Properties();
		//load the input streem
		pObj.load(fis);
		//get the data
		String url=pObj.getProperty("url");
		String un=pObj.getProperty("username");
		String pwd=pObj.getProperty("pwd");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		driver.quit();
	}
}
