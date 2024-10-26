package javaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions opts=new ChromeOptions();
    	opts.addArguments("headless");
    	WebDriver driver=new ChromeDriver(opts);
    	driver.manage().window().maximize();
    	driver.get("https://demowebshop.tricentis.com/");
    	System.out.println(driver.getTitle());
    	Thread.sleep(1000);
    	driver.quit();
	}
}
