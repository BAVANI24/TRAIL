package javaSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	String mainid=driver.getWindowHandle();
	driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	Set<String> allIds=driver.getWindowHandles();
	for(String id:allIds) {
		if(!(id.equals(mainid))) {      //if true it reject if false it accept
			driver.switchTo().window(id);    //switch driver face main(dws)to facebook(child tap)
			Thread.sleep(1000);
			System.out.println(driver.getTitle());    //get current driver focus title
		}
	}
	driver.close();    //now facebook will be close
	driver.quit();      //close all tap
  }
}
