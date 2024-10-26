package SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotComplete1 {
     public static void main(String[] args) throws IOException, InterruptedException {
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/");
	      driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]/a")).click();
	      //typecasing
	      TakesScreenshot ts=(TakesScreenshot)driver;       //org selenium
	      //take the screenshot
	      File ss=ts.getScreenshotAs(OutputType.FILE);              //outpyt type& file java io
	      //give the path where to save
	      File path=new File("./Screenshot/dws1.png");           //file java io   &file (String path name)
	      //copy ss to the path
	      FileHandler.copy(ss, path);                       //filehandlr--->org selenium   & copy(from,to)    &throw Ioexception
	      Thread.sleep(2000);
	      driver.quit();
	}
}
