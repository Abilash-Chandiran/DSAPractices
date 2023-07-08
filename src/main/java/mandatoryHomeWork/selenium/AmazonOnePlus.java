package main.java.mandatoryHomeWork.selenium;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("return document.readyState").toString().equals("complete");
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

				// 2.search as oneplus 9 pro
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

				// 3.Get the price of the first product
				String price = driver.findElement(By.xpath("(//span[@class='a-price-whole' and //a[contains(@href,'OnePlus')]])[1]")).getText();
				System.out.println("Get the price of the first product - " + price);

				// 4. Print the number of customer ratings for the first displayed product
				driver.findElement(By.xpath("(//span[@class='a-declarative'])[1]")).click();
				String rating = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
				System.out.println("customer ratings for the first displayed product - " + rating);

				// 5. Click the first text link of the first image
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'OnePlus 9 Pro')])[4]")));
				driver.findElement(By.xpath("(//a[contains(@href,'OnePlus')])[1]")).click();

				//Window handels
				Set<String> obj1 = driver.getWindowHandles();
				List<String> obj2 = new ArrayList<String>();
				obj2.addAll(obj1);
				String obj3 = obj2.get(1);
				driver.switchTo().window(obj3);

				// 6. Take a screen shot of the product displayed
				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
				File DestFile = new File("./resources/screenshots/");
				FileUtils.copyFile(SrcFile, DestFile);

				// 7. Click 'Add to Cart' button
				driver.findElement(By.id("add-to-cart-button")).click();

				// 8. Get the cart subtotal and verify if it is correct.
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[id*='cart-subtotal']")));
				String cartPrice = driver.findElement(By.cssSelector("span[id*='cart-subtotal']")).getText();
				System.out.println("Get the cart subtotal - " + cartPrice);
				assertTrue(cartPrice.contains(price));

				// 9.close the browser
				driver.quit();

	}

}
