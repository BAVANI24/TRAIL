package javaSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotComplete {
      public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//take the Screenshot
		File ss=ts.getScreenshotAs(OutputType.FILE);   
		//give the path where to save
		File path=new File("./Screenshot/dws.png");
		//copy ss to the path
		FileHandler.copy(ss, path);                   //throw exception IoException
		Thread.sleep(2000);                            //InterruptException
		driver.quit();
		
	}
}
