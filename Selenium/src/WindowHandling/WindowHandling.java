package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId=driver.getWindowHandle();
		driver.getCurrentUrl();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Set<String> allId=driver.getWindowHandles();
		for(String id:allId) {
			if(!(id.equals(mainId))) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
		driver.quit();
	}
}
