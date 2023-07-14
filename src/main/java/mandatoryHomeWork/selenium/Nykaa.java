package main.java.mandatoryHomeWork.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.http.util.Asserts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
Nykaa
1. Go to https://www.nykaa.com/
2. Mouseover on Brands and Search L'Oreal Paris
3. Click L'Oreal Paris
4. Check the title contains L'Oreal Paris
5. Click sort By and select customer top rated
6. Click Category and click Hair->Click haircare->Shampoo
7. Click->Concern->Color Protection
8.check whether the Filter is applied with Shampoo
9. Click on L'Oreal Paris Colour Protect Shampoo
10. GO to the new window and select size as 175ml
11. Print the MRP of the product
12. Click on ADD to BAG
13. Go to Shopping Bag
14. Print the Grand Total amount
15. Click Proceed
16. Click on Continue as Guest
17. Check if this grand total is the same in step 14
18. Close all windows
*/
public class Nykaa {
	//ChangedCredentials for GIT
	String URL = "https://www.nykaa.com/";
	String name = "L'Oreal Paris";
	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		1. Go to https://www.nykaa.com/
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		2. Mouseover on Brands and Search L'Oreal Paris
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'brands')]")));
		WebElement brands = driver.findElement(By.xpath("//a[contains(text(), 'brands')]"));
		Actions builder = new Actions(driver);
	    builder.contextClick(brands).perform();
	    
	    System.out.println("Mouseover to brands " );
	    WebElement brandSearch = driver.findElement(By.xpath("//input[@id='brandSearchBox' and @placeholder='search brands']"));
	    brandSearch.click();
	    brandSearch.sendKeys(name);
	    
	    //3. Click L'Oreal Paris
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='scroller-container']/div[4]/a[contains(text(), 'Paris')]")).click();

	    //		4. Check the title contains L'Oreal Paris
	    System.out.println(driver.getTitle());
	    String title = driver.getTitle();
	    List<String> possibleTitles = Arrays.asList("L'Oreal", "Paris");
	    for(String possibleTitle : possibleTitles) {
	        if(title.contains(possibleTitle)) {
	            assertTrue(driver.getTitle().contains(possibleTitle));
	            System.out.println("Assert verified for title");
	        }
	    }	    
//		5. Click sort By and select customer top rated
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement sort =  driver.findElement(By.xpath("//span[@class = 'sort-name']"));
	    wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();
//		6. Click Category and click Hair->Click haircare->Shampoo
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Category']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//ul[@id='custom-scroll']//span[contains(text(), 'Hair')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[text()='Hair Care'])[last()]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//label[contains(@for, 'checkbox_Shampoo')]/div[1]")).click();
	    Thread.sleep(5000);
//	    js.executeScript("window.scrollBy(0,1000)");
//	    7. Click->Concern->Color Protection
	    driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[contains(@for, 'checkbox_Color Protection')]/div[1]")).click();
	    Thread.sleep(5000);
//	    8.check whether the Filter is applied with Shampoo
	    WebElement filter = driver.findElement(By.xpath("//div[@id='filters-listing']/div/div[2]//span[contains(text(), 'Shampoo')]"));
	    String shampoo = filter.getText();
	    Asserts.check(true, "The filter contains Shampoo", shampoo);
	    System.out.println(shampoo);
//	    9. Click on L'Oreal Paris Colour Protect Shampoo
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='product-list-wrap']//a[contains(@href, 'color-protect-shampoo')]")))).click();
	    Thread.sleep(5000);
	    
//	    10. GO to the new window and select size as 175ml
	    ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	    Select size = new Select(driver.findElement(By.xpath("//select[@title='SIZE']")));
	   
	    size.selectByValue("1");
//	    11. Print the MRP of the product
	    String mrp = driver.findElement(By.xpath("//h1[contains(text(), 'Colour')]/following-sibling::div[2]/div/span[last()]")).getText();
	    System.out.println("The MRP For shampoo : " +mrp);
//	    12. Click on ADD to BAG
	    driver.findElement(By.xpath("(//button[@type='button']//span[text()='Add to Bag'])[1]")).click();
//	    13. Go to Shopping Bag
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='header_id']//div[2]/button")))).click();
	    Thread.sleep(5000);
//	    14. Print the Grand Total amount
	    WebElement frame = driver.findElement(By.xpath("(//iframe[contains(@src, 'IframeCart')])[1]"));
	    driver.switchTo().frame(frame);
	    String total = driver.findElement(By.xpath("(//div[@data-test-id='footer']//span[contains(., '')])[1]")).getText();
	    System.out.println("The Grand Total  : " +total);
//	    15. Click Proceed
	    driver.findElement(By.xpath("//div[@data-test-id='footer']//span[contains(text(), 'Proceed')]")).click();
//	    16. Click on Continue as Guest
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(), 'Continue as guest')]")))).click();
	    Thread.sleep(5000);
//	    17. Check if this grand total is the same in step 14
	    driver.findElement(By.xpath("(//div[@id='app']//span)[7]")).click();
	    String total2 = driver.findElement(By.xpath("//div[@id=\"app\"]//div/p[contains(., '₹')]")).getText();
	    System.out.println("The Grand Total  : " +total2);
	    assertEquals("The Grand Totals and total at checkout are same", total, total2);
//	    18. Close all windows
		driver.quit();
	}
}
