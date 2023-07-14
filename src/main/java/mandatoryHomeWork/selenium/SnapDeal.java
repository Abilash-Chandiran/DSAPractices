package main.java.mandatoryHomeWork.selenium;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


/*Selenium scenario - 11

Snapdeal
1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (900-1200)
9.Filter with color Navy
10 verify the all applied filters
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window
*/
public class SnapDeal {

	String URL = "https://www.snapdeal.com/";
	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		1. Launch https://www.snapdeal.com/
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(URL);
//		2. Go to Mens Fashion.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(mensfashion)).click();
		Thread.sleep(2000);
//		3. Go to Sports Shoes
		WebElement sportshoe = driver.findElement(By.linkText("Sports Shoes"));
		sportshoe.click();
//		4. Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//span[@class= 'category-name category-count']")).getText();
		System.out.println(count);
//		5. Click Training shoes
		WebElement trainingshoe = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		trainingshoe.click();
//		6. Sort by Low to High
		WebElement sortby = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		sortby.click();
//		7. Check if the items displayed are sorted correctly
		WebElement lowtohigh = driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]"));
		lowtohigh.click();
		String sort = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println(sort);
		if (sort.contains("Price Low To High")) {
			System.out.println("items are sorted from low to high");
		} else {
			System.out.println("items are not sorted from low to high");
		}
//		8.Select the price range (900-1200)
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		Thread.sleep(2000);
//		9.Filter with color Navy
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
//		10 verify the all applied filters
		String colour = driver.findElement(By.xpath("//a[text()=' Navy']")).getText();
		if (colour.contains("Navy")) {
			System.out.println("colour is filtered as Navy");
		} else {
			System.out.println("colour is not filtered as Navy");
		}
		Thread.sleep(2000);
//		11. Mouse Hover on first resulting Training shoes
		WebElement picture = driver.findElement(By.tagName("picture"));
		Actions action = new Actions(driver);
		action.moveToElement(picture).perform();
//		12. click QuickView button
		driver.findElement(By.xpath("//div[contains(text(),\"Quick View\")]")).click();
//		13. Print the cost and the discount percentage
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String Discountprice = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("cost of the shoes is" + " " + cost);
		System.out.println("Discount price of the shoes is" + " " + Discountprice);
//		14. Take the snapshot of the shoes.
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D://SnapDeal.png");
		FileHandler.copy(source, dest);
//		15. Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
//		16. Close the main window
		driver.quit();
	}

}
