package main.java.seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonOnePlus {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch the web browser
				ChromeOptions options = new ChromeOptions();
				WebDriver driver = new ChromeDriver(options);

				// 1.Load the URL https://www.amazon.in/
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("return document.readyState").toString().equals("complete");
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				// 2.search as oneplus 9 pro
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

				// 3.Get the price of the first product
				String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
				System.out.println("Get the price of the first product - " + price);
				Thread.sleep(2000);
				
				
				Actions action = new Actions(driver);
				WebElement langauge = driver.findElement(By.xpath("//div[text()='EN']/.."));
				action.moveToElement(langauge).perform();
				Thread.sleep(8000);

				// 4. Print the number of customer ratings for the first displayed product
				WebElement hoverable = driver.findElement(By.xpath("//span[text()='2.7 out of 5 stars']/../../.."));
				action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Renewed) OnePlus 9 Pro 5G')])[1]"))).perform();
				Thread.sleep(2000);
				action.moveToElement(hoverable).perform();
				Thread.sleep(2000);
				
				String rating = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
				System.out.println("customer ratings for the first displayed product - " + rating);
				
				// 5. Click the first text link of the first image
				driver.findElement(By.xpath("(//*[contains(text(),'OnePlus 9 Pro')])[1]")).click();

				// 6. Take a screen shot of the product displayed
				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File("Downloads/screenshot01.png"));

				// 7. Click 'Add to Cart' button
				// 8. Get the cart subtotal and verify if it is correct.

				// 9.close the browse
				driver.close();

	}

}
