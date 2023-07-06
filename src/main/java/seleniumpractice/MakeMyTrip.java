package main.java.seleniumpractice;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch the web browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);

		// 2. Navigate to "https://www.makemytrip.com" (replace with the actual URL of
		// the MakeMyTrip flight booking website).
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.makemytrip.com/flights/");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("return document.readyState").toString().equals("complete");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// 3. Click on the "Flights" tab.
		driver.findElement(By.xpath("(//span[text()=\"Flights\"]/parent::a)[1]")).click();
		Thread.sleep(5000);

		// 4. Enter the departure city in the "From" field.
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai, India");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@role='listbox']/div/ul/li"),
				"Chennai, India"));
		driver.findElement(By.xpath("//div[@role='listbox']/div/ul/li")).click();

		// 5. Enter the arrival city in the "To" field.
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru, India");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@role='listbox']/div/ul/li"),
				"Bengaluru, India"));
		driver.findElement(By.xpath("//div[@role='listbox']/div/ul/li")).click();

		// 6. Select the departure date from the calendar.
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(((//div[@class='DayPicker-Week'])[3])/div)[1]")));
		driver.findElement(By.xpath("(((//div[@class='DayPicker-Week'])[2])/div)[1]")).click();

		// 7. Select the return date from the calendar (if applicable).

		// 8. Select the number of passengers (adults, children, infants) from the
		// dropdown menus.
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='travellers gbTravellers']")));
		driver.findElement(By.xpath("(//div[@class='travellers gbTravellers']/div/ul/li)[2]")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();

		// 9. Click on the "Search" button.
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		// 10.Wait for the search results page to load.
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flightBody']")));
		if (driver.findElement(By.xpath("//div[@class='commonOverlay ']")).isDisplayed())
			driver.findElement(By.xpath("//div[@class='commonOverlay ']/span")).click();

		// 11.Verify that the search results are displayed correctly with available
		// flights.

		// 12.Select a specific flight from the search results.
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", element);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		WebElement viewFlight = driver.findElement(By.xpath("(//span[text()='View Flight Details'])[8]"));
		wait.until(ExpectedConditions.elementToBeClickable(viewFlight));
		viewFlight.click();

		// 13.Verify that the flight details page is displayed.
		boolean flightDetails = driver.findElement(By.xpath("//div[@class='flightDetailsOuter']")).isDisplayed();
		assertTrue(flightDetails);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()=\"Hide Flight Details\"])")).click();

		// 14.Enter passenger details (names, contact information, etc.) in the provided
		// form.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'priceSection']/div/button)[1]")));
		driver.findElement(By.xpath("(//div[@class = 'priceSection']/div/button)[1]")).click();
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='View Prices']/parent::button)[1]")));
		driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wrapper_ADULT")));
		driver.findElement(By.xpath("(//label[@class='radioboxContainer ']/span/input)[2]")).click();
		driver.findElement(By.xpath("(//button[@class='addTravellerBtn'])[1]")).click();
		// Adult-1
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("VigneshKumar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tamilselvan");
		driver.findElement(By.xpath("//input[(@type='radio' and @value='MALE')]")).click();
		driver.findElement(By.xpath("(//button[@class='addTravellerBtn'])[1]")).click();
		// Adult-2
		driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("VinothKumar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tamilselvan");
		driver.findElement(By.xpath("//input[(@type='radio' and @value='MALE')]")).click();
		// Contact details
		driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("9489865827");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vigneshkumartamilselvan@gmail.com");
		driver.findElement(By.xpath("//input[(@type='radio' and @value='MALE')]")).click();
		// Terms and condition
		driver.findElement(By.xpath("//span[@class='checkboxWpr']/input")).click();

		// 15.Click on the "Continue Booking" button to proceed with the booking.
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

}
