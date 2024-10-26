package javaSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingMultipletaponeClose {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId=driver.getWindowHandle();    //first we get sessionId of mainpage(driverfocus) DWS
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'YouTube')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Google+')]")).click();
		Set<String> allIds=driver.getWindowHandles();   //get session id of all taps
		for(String id:allIds) {
			if(!(id.equals(mainId))) {            
				driver.switchTo().window(id);     //switch the driver focus mainpage(DWS) to another
				Thread.sleep(1000);
				String title=driver.getTitle();    //get the title
				if(title.contains("YouTube")) {
					driver.close();       //close youtube
				}
				else {
					System.out.println(title);    //get title
				}
			}
			else {
				System.out.println(driver.getTitle());   //get tltle of first our mainpage but not now
			}
		}
		Thread.sleep(1000);
	}
}
