package main.java.optionalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateGmailLogin {

	public static void main(String[] args) throws InterruptedException{
		//To initialize the driver
		WebDriver driver = new ChromeDriver();

		//To launch the application
		driver.get("https://www.google.com/gmail/about/");

		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait;
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[id='ca']")).sendKeys("Test");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[text()='Please enter the characters you see in the image above']")).isDisplayed();

		driver.quit();
		}
	
}
