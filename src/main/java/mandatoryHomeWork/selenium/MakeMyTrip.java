package main.java.mandatoryHomeWork.selenium;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
Selenium scenario - 10
MakeMyTrip – Search Flight
1. Launch the web browser.
2. Navigate to "https://www.makemytrip.com" (replace with the actual URL of the MakeMyTrip flight booking website).
3. Click on the "Flights" tab.
4. Enter the departure city in the "From" field.
5. Enter the arrival city in the "To" field.
6. Select the departure date from the calendar.
7. Select the return date from the calendar (if applicable).
8. Select the number of passengers (adults, children, infants) from the dropdown menus.
9. Click on the "Search" button.
10. Wait for the search results page to load.
11. Verify that the search results are displayed correctly with available flights.
12. Select a specific flight from the search results.
13. Verify that the flight details page is displayed.
14. Enter passenger details (names, contact information, etc.) in the provided form.
15. Click on the "Continue Booking" button to proceed with the booking.
*/
public class MakeMyTrip {
	// ChangedCredentials for GIT

	String URL = "https://www.makemytrip.com";

	ChromeDriver driver;

	@Test
	public void createAssignee() throws InterruptedException, AWTException {

		// 4.9.1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		1. Launch the web browser.

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		2. Navigate to "https://www.makemytrip.com" (replace with the actual URL of the MakeMyTrip flight booking website).
		driver.navigate().to(URL);
//		3. Click on the "Flights" tab.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement flight = driver.findElement(By.xpath("//a[contains(@href, 'https://www.makemytrip.com/flights/')]"));
		wait.until(ExpectedConditions.elementToBeClickable(flight)).click();
//		4. Enter the departure city in the "From" field.
		WebElement fromcity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromcity.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class, 'autoSuggest')]//li[contains(., 'BLR')]")).click();
//		5. Enter the arrival city in the "To" field.
		WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
		toCity.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='toCity']/following-sibling::div//li[contains(., 'MAA')]")).click();

//		6.Select the departure date from the calendar.
		WebElement date = driver.findElement(By.xpath(
				"//div[contains(@class, 'DayPicker-Week') and @role='row']/following::div[@aria-label='Sun Jul 16 2023']"));
		date.click();
		Thread.sleep(3000);

//		7. Select the return date from the calendar (if applicable).
//		8. Select the number of passengers (adults, children, infants) from the dropdown menus.
		driver.findElement(By.xpath("//div[contains(@class, 'flightTravllers ')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[contains(@class, 'guestCounter')]//li[contains(@data-cy, 'adults-2')]"))
				.click();

		driver.findElement(By.xpath("//button[@type='button' and text()='APPLY']")).click();
		Thread.sleep(1000);
//		9. Click on the "Search" button.
		driver.findElement(By.xpath("//a[contains(@class, 'SearchBtn') and text()='Search']")).click();
		Thread.sleep(5000);
//		10. Wait for the search results page to load.
		WebElement popup = driver.findElement(By.xpath("//div[@class='commonOverlay ']"));
		if (popup.isDisplayed()) {
			WebElement clickOk = driver
					.findElement(By.xpath("//button[contains(@class, 'Secondry') and  text()='OKAY, GOT IT!']"));
			wait.until(ExpectedConditions.elementToBeClickable(clickOk)).click();
		}
//		11. Verify that the search results are displayed correctly with available flights.
		String header = driver.findElement(By.xpath("//div[@class='listingRhs']/p[contains(.,'Flights')]")).getText();
		System.out.println("Flights from search reulsts are " + header);
//		12. Select a specific flight from the search results.
		driver.findElement(By.xpath("(//span[text()='View Prices']/parent::button)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(text(), 'Book Now')])[1]")).click();
		Thread.sleep(3000);
//		13. Verify that the flight details page is displayed.
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println(driver.getTitle());
		WebElement flightPage = driver.findElement(By.xpath("//h2[text()='Complete your booking']"));
		wait.until(ExpectedConditions.visibilityOf(flightPage));

//		14. Enter passenger details (names, contact information, etc.) in the provided form.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		mobile.sendKeys("46464654656");
//		15. Click on the "Continue Booking" button to proceed with the booking.
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.quit();
	}

}
