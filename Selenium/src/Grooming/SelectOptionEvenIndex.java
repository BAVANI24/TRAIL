package Grooming;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionEvenIndex {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='cars']"));
		Select sel=new Select(dropDown);
		int size=sel.getOptions().size();
		System.out.println("Optionsize"+size);

		for(int i=0;i<size;i++) {
			if(i%2==0) {
				sel.selectByIndex(i);

				//System.out.println(s);
			}

		}
		List<WebElement> s=sel.getAllSelectedOptions();
		for(WebElement print:s) {
			System.out.println(print.getText());
		}
		driver.quit();
	}
}
