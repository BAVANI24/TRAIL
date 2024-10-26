package SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot2 {
     public static void main(String[] args) throws IOException, InterruptedException {
    	    WebDriver driver=new ChromeDriver();
    	    driver.manage().window().maximize();
	   		driver.get("https://demowebshop.tricentis.com/");
	   
	   		//save the webElement
	   		driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a")).click();
	   		WebElement logo2=driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000232_notebooks_125.png']"));
	   		//take the screenshot
	   		File ss=logo2.getScreenshotAs(OutputType.FILE);
	   		//give the path where to save
	   		File path=new File("./Screenshot1/logo2.png");
	   		//copy ss to the path
	   		FileHandler.copy(ss, path);
	   		Thread.sleep(5000);
	   		driver.quit();
	}
}
