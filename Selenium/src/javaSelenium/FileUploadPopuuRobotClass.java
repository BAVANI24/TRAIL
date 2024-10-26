package javaSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopuuRobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
    	    WebDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://www.naukri.com/registration/createAccount");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//p[contains(text(),'I have work experience (excluding internships)')]")).click();
    		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
    		Thread.sleep(1000);
    		StringSelection path=new StringSelection("C:\\Users\\bavim\\Downloads\\14 MT RESUME.pdf");
    		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
    		cb.setContents(path,null);
    		
    		Robot rb=new Robot();
    		rb.keyPress(KeyEvent.VK_CONTROL);
    		rb.keyPress(KeyEvent.VK_V);
    		rb.keyRelease(KeyEvent.VK_CONTROL);
    		rb.keyRelease(KeyEvent.VK_V);
    		Thread.sleep(1000);
    		
    		rb.keyPress(KeyEvent.VK_ENTER);
    		rb.keyRelease(KeyEvent.VK_ENTER);
    		Thread.sleep(2000);
    		driver.quit();
    		
	}
}
