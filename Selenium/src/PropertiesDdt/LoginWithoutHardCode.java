package PropertiesDdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutHardCode {
	public static void main(String[] args) throws IOException, InterruptedException {
		//give the path
		FileInputStream file=new FileInputStream("./Data/demo.properties");    // we can change the exception (filenotfoundexception ,throwable)
		//create obj for properties
		Properties pObj=new Properties();
		//load the file
		pObj.load(file);    //io exception
		//fetch the data
		String url=pObj.getProperty("url");
		String un=pObj.getProperty("username");
		String pwd=pObj.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Login withOut HardCode
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		System.out.println("Login Successfully!!!");
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
