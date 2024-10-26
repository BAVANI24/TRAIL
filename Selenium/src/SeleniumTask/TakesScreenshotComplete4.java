package SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotComplete4 {
     public static void main(String[] args) throws IOException, InterruptedException {
    	WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://demowebshop.tricentis.com/");
 		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a")).click();
 		//typecasing
 		TakesScreenshot ts=(TakesScreenshot)driver;
 		//take the screenshot
 		File ss=ts.getScreenshotAs(OutputType.FILE);
 		//give the path where to save
 		File path=new File("./Screenshot/dws4.png");
 		//copy ss to the path
 		FileHandler.copy(ss, path);    //throw Io exception
 		Thread.sleep(2000);
 		driver.quit();
	}
}
