package javaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenWebElement {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;                                                                   //typecasting
		WebElement elementDisplayed=driver.findElement(By.xpath("//legend[contains(text(),'Element Displayed Example')]"));  //give path see the webelemnt  
		jse.executeScript("arguments[0].scrollIntoView(true);",elementDisplayed);                                            //Scroll tha exact webelemt so we pass that
		Thread.sleep(2000);
		WebElement textBox=driver.findElement(By.xpath("//input[@id='displayed-text']"));                                    //find path for textBox and store in variable
		driver.findElement(By.id("hide-textbox")).click();                                                            //click hide button                                                             
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='Selenium';",textBox);                                                  //send text for that textBox
		driver.findElement(By.id("show-textbox")).click();                                                            //click show button because show text
		Thread.sleep(2000);
	}
}
