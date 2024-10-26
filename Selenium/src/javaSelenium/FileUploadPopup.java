package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
   public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://the-internet.herokuapp.com/upload");
	 
	 Thread.sleep(1000);
	 //2"C:\Users\bavim\OneDrive\Desktop\Book1.xlsx"
	 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bavim\\OneDrive\\Documents\\Custom Office Templates\\SELE RESUME.docx");
	 Thread.sleep(1000);
	 driver.quit();
}
}
