package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingWithMultipletapOneOnlyOpen {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId=driver.getWindowHandle();
		driver.getTitle();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'YouTube')]")).click();
		Set<String> allId=driver.getWindowHandles();
		for(String id:allId) {
			if(!(id.equals(mainId))) {
				driver.switchTo().window(id);
				String title=driver.getTitle();
				if(title.contains("YouTube")) {
					System.out.println(title);
				}
				else {
					driver.close();
				}
			}
		}
		driver.quit();
	}
}
