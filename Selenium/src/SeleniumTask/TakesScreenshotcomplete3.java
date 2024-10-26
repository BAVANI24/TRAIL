package SeleniumTask;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotcomplete3 {
    public static void main(String[] args) throws IOException, InterruptedException {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]/a")).click();
		driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000236_music-2_125.png']")).click();
		//typecasing
		TakesScreenshot ts=(TakesScreenshot)driver;
		//take the screenshot
		File ss=ts.getScreenshotAs(OutputType.FILE);
		//give the path where to save
		File path=new File("./Screenshot/dws3.png");
		//copy ss to the path
		FileHandler.copy(ss, path);    //throw Io exception
		Thread.sleep(2000);
		driver.quit();
	}
}
