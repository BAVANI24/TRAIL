package BaseClassCrossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassCrossBrowser {
	public WebDriver driver;
	
	@Parameters("browser")                     //orj.testNg annotation import(parameters)
	@BeforeClass(alwaysRun = true)             //(alwaysRun(optional))
	public void openBrowser(String browser) {
		if(browser.contains("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Open Browser",true);   //reporter class
	}
	@BeforeMethod(alwaysRun = true)
	public void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("bavimurugan0407@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
		Reporter.log("Login",true);
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
		Reporter.log("Logout",true);
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
	driver.quit();	
	Reporter.log("Close Browser",true);	
	}
}
