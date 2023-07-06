package main.java.seleniumpractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundPractice {

	private static String url = "https://www.leafground.com/dashboard.xhtml";
	private static String name = "Abilash";
	private static String country = "India";
	private static String expected_url = "https://www.leafground.com/grid.xhtml";

	@Test
	public void test() throws InterruptedException, AWTException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Text Box Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(1000);

		// Sub Menu 'Text Box' Click
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		Thread.sleep(500);

		// Just Press Enter and confirm error message Validation
		driver.findElement(By.xpath("//input[contains(@id,'age')]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		assertEquals("Age is mandatory", driver.findElement(By.xpath("//div[@role='alert']")).getText());

		// Type your name Validation
		driver.findElement(By.cssSelector("[placeholder='Babu Manickam']")).sendKeys(name);

		// Append Country to this City Validation
		WebElement cityElement = driver.findElement(By.xpath("//input[contains(@class,'city')]"));
		String city = cityElement.getAttribute("value");
		cityElement.clear();
		cityElement.sendKeys(city + country);

		// Click and Confirm Label Position Changes Validation
		WebElement label = driver.findElement(By.xpath("//label[text()='Username']"));
		Point labelloc = label.getLocation();
		System.out.println("labelPos Before " + "X : " + labelloc.getX() + " Y : " + labelloc.getY());
		driver.findElement(By.xpath("//span[contains(@class,'float')]//input")).click();
		Thread.sleep(500);
		Point labelloc2 = label.getLocation();
		System.out.println("labelPos After " + "X : " + labelloc2.getX() + " Y : " + labelloc2.getY());
		assertFalse(labelloc.equals(labelloc2));

		// Verify if text box is disabled Validation
		assertFalse(driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled());

		// Type your name and choose the third option Validation
		driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys("Abilash");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@role='option']")));
		List<WebElement> ddoptions = driver.findElements(By.xpath("//li[@role='option']"));
		for (int i = 0; i < ddoptions.size(); i++)
			if (ddoptions.get(i).getText().equals("Abilash2") && i == 2) {
				ddoptions.get(i).click();
				break;
			}
		Thread.sleep(800);
		assertEquals("Abilash2", driver.findElement(By.xpath("//li[contains(@class,'active ')]/span[2]")).getText());

		// Clear the typed text Validation
		driver.findElement(By.xpath("//input[contains(@value,'clear me')]")).clear();
		assertEquals("", driver.findElement(By.xpath("//input[contains(@value,'clear me')]")).getAttribute("value"));

		// Type your DOB (mm/dd/yyyy) and confirm date chosen Validation
		driver.findElement(By.xpath("//span[contains(@class,'calendar')]/input")).sendKeys("05/13/1993");
		driver.findElement(By.xpath("//a[contains(@class,'active')]")).click();
		assertEquals("5/13/1993",
				driver.findElement(By.xpath("//span[contains(@class,'calendar')]/input")).getAttribute("value"));

		// Retrieve the typed text Validation
		assertEquals("My learning is superb so far.",
				driver.findElement(By.xpath("//input[contains(@value,'My learning')]")).getAttribute("value"));

		// Type number and spin to confirm value changed Validation
		driver.findElement(By.xpath("//input[contains(@class,'spinner')]")).sendKeys("11");
		WebElement upArrowIcon = driver.findElement(By.xpath("//span[contains(@class,'triangle-1-n')]"));
		WebElement downArrowIcon = driver.findElement(By.xpath("(//span[contains(@class,'triangle-1-s')])[2]"));
		downArrowIcon.click();
		upArrowIcon.click();
		upArrowIcon.click();
		assertEquals("12", driver.findElement(By.xpath("//input[contains(@class,'spinner')]")).getAttribute("value"));

		// Type email and Tab. Confirm control moved to next element Validation
		driver.findElement(By.xpath("//input[contains(@placeholder,'email')]")).sendKeys("test@mail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'email')]")).sendKeys(Keys.TAB);
		assertEquals("About yourself", driver.switchTo().activeElement().getAttribute("placeholder"));

		// Type random number (1-100) and confirm slider moves correctly Validation
		driver.findElement(By.xpath("//input[contains(@id,'slider')]")).sendKeys("44");
		Thread.sleep(500);
		String sliderValue = driver
				.findElement(By.xpath("//input[contains(@id,'slider')]//following-sibling::div/span"))
				.getAttribute("style").replace("left: ", "");
		assertEquals("44", sliderValue.replace("%", "").replace(";", ""));

		// Type about yourself
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'About ')]")).sendKeys("Hi, This is Abilash");

		// Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[contains(@class,'keyboard')]")).click();
		Thread.sleep(500);
		assertTrue(driver.findElement(By.xpath("//div[contains(@class,'shadow keypad')]")).isDisplayed());
		driver.findElement(By.cssSelector("[title='Close the keypad']")).click();

		// Text Editor
		driver.findElement(By.xpath("(//div[contains(@id,'editor')]//div)[1]")).sendKeys("Test Text Editor");

		// Custom Toolbar
		driver.findElement(By.cssSelector("[data-placeholder='Enter your content']")).sendKeys("Test Custom Toolbar");

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Button Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Button' Click
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		Thread.sleep(800);

		// Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']/..")).click();
		assertEquals("Dashboard", driver.getTitle());

		// Find the height and width of this button
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		driver.findElement(By.xpath("//span[text()='Button']")).click();
		Thread.sleep(500);
		Dimension submit = driver.findElement(By.xpath("(//span[text()='Submit'])[2]/..")).getSize();
		System.out.println("Submit button height : " + submit.getHeight());
		System.out.println("Submit button width : " + submit.getWidth());

		// Confirm if the button is disabled.
		assertFalse(driver.findElement(By.xpath("//span[text()='Disabled']/..")).isEnabled());
		assertEquals("true", driver.findElement(By.xpath("//span[text()='Disabled']/..")).getAttribute("disabled"));
		assertEquals("true", driver.findElement(By.xpath("//span[text()='Disabled']/..")).getDomProperty("disabled"));

		// Mouse over and confirm the color changed
		WebElement successButton = driver.findElement(By.xpath("//span[text()='Success']/.."));
		String btnColor_before = successButton.getCssValue("background-color");
		String hex_before = Color.fromString(btnColor_before).asHex();
		Actions action = new Actions(driver);
		action.moveToElement(successButton).perform();
		Thread.sleep(800);
		String btnColor_After = successButton.getCssValue("background-color");
		String hex_after = Color.fromString(btnColor_After).asHex();
		assertFalse(hex_before.equals(hex_after));

		// Find the position of the Submit button
		Point submitBtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]/..")).getLocation();
		System.out.println("Submit button_2 Position : " + submitBtn);

		// Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//span[text()='Image']/..")).click();
		WebElement shadow = driver.findElement(By.xpath("//div[contains(@id,'imagePanel')]"));
		shadow.findElement(By.xpath("//div[contains(@class,'overlaypanel-content')]")).click();
		driver.findElement(By.xpath("//span[text()='Image']/..")).click();

		// Find the Save button color
		String saveBtnnColor = driver.findElement(By.xpath("//span[text()='Save']/..")).getCssValue("background-color");
		System.out.println("saveButtonColor : " + Color.fromString(saveBtnnColor).asHex());

		// How many rounded buttons are there?
		List<WebElement> roundedBtn = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		System.out.println("Rounded buttons count : " + roundedBtn.size());

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Dropdown Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Dropdown' Click
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		Thread.sleep(800);

		// Which is your favorite UI Automation tool?
		Select select = new Select(driver.findElement(By.cssSelector("[class='ui-selectonemenu']")));
		select.selectByVisibleText("Selenium");

		// Choose the Course
		driver.findElement(By.cssSelector("[aria-label='Show Options']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Selenium WebDriver']")));
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

		// Choose your preferred country.
		driver.findElement(By.xpath("//label[contains(@id,'country_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='India']")).click();

		// Choose language randomly
		driver.findElement(By.xpath("//label[contains(@id,'lang_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Kannada']")).click();

		// Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[contains(@id,'city_label')]")).click();
		Thread.sleep(500);
		List<String> cities_Actual = new ArrayList<>();
		List<String> cities_expected = new ArrayList<String>(Arrays.asList("Bengaluru", "Chennai", "Delhi"));
		List<WebElement> cityElements = driver
				.findElements(By.xpath("//option[text()='Select City']//following-sibling::option"));
		for (WebElement elem : cityElements)
			cities_Actual.add(elem.getAttribute("value"));
		assertEquals(cities_expected, cities_Actual);

		// Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("//label[contains(@id,'value_label')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='ಎರಡು']")).click();

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Check Box Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Check Box' Click
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();

		// Basic Checkbox
		driver.findElement(By.xpath("//*[text()='Basic']//preceding-sibling::div[contains(@class,'chkbox')]")).click();

		// Toggle Switch
		driver.findElement(By.xpath("//div[contains(@class,'slider')]")).click();

		// Notification
		driver.findElement(By.xpath("//span[text()='Ajax']/../div[contains(@class,'chkbox')]")).click();
		Thread.sleep(800);
		assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).getText().contains("Checked"));

		// Verify if check box is disabled
		WebElement disabledCheckbox = driver.findElement(By.xpath("(//span[text()='Disabled']/..//div)[last()]"));
		assertTrue(disabledCheckbox.getAttribute("class").contains("disabled"));

		// Choose your favorite language(s)
		driver.findElement(By.xpath("(//*[contains(@class,'selectmanycheckbox')]//td/div)[1]")).click();
		driver.findElement(By.xpath("(//*[contains(@class,'selectmanycheckbox')]//td/div)[2]")).click();

		// Select Multiple
		driver.findElement(By.xpath("//div[contains(@id,'multiple') and @role='combobox']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[text()='London']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Paris']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Berlin']//preceding-sibling::div")).click();
		driver.findElement(By.xpath("//div[contains(@id,'multiple') and @role='combobox']")).click();

		// Tri State Checkbox
		driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();
		driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Radio Button Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Radio Button' Clicked
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();

		// Your most favorite browser
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]/../div")).click();

		// Find the default select radio button
		driver.findElement(By.xpath("(//label[text()='Chrome'])[2]/../div")).click();

		// UnSelectable
		driver.findElement(By.xpath("//label[text()='Bengaluru']//./preceding-sibling::div")).click();

		// Select the age group (only if not selected)
		List<WebElement> ageRadioBtn = driver
				.findElements(By.xpath("//label[contains(text(),'Years')]//../div[contains(@class,'radiobutton')]"));
		List<WebElement> age = driver.findElements(By.xpath("//label[contains(text(),'Years')]"));
		for (int i = 0; i < ageRadioBtn.size(); i++)
			if (age.get(i).getText().equals("21-40 Years")
					&& !ageRadioBtn.get(i).getAttribute("class").contains("active"))
				driver.findElement(By.xpath("(//label[contains(text(),'21-40')]//..//div)[last()]")).click();

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Hyper Link Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Hyper Link' Clicked
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();

		// Take me to dashboard
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(1500);
		assertEquals("Dashboard", driver.getTitle());

		// Duplicate Link
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(1500);
		assertEquals("Dashboard", driver.getTitle());

		// Find my destination - Find the URL without clicking me.
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Hyper Link']")).click();

		assertEquals(expected_url,
				driver.findElement(By.xpath("//a[contains(text(),'without')]")).getAttribute("href"));

		// How many links in this page?
		List<WebElement> numofLinks = driver.findElements(By.tagName("a"));
		System.out.println("How many links in this page : " + numofLinks.size());

		// Am I broken link?
		try {
			URL url = new URL(driver.findElement(By.xpath("//a[text()='Broken?']")).getAttribute("href"));
			HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();
			httpUrlConnect.setConnectTimeout(5000);
			httpUrlConnect.connect();
			if (httpUrlConnect.getResponseCode() >= 400)
				System.out.println(url + " - " + httpUrlConnect.getResponseMessage() + " is a broken link");
			else
				System.out.println(url + " - " + httpUrlConnect.getResponseMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Count Layout Links
		List<WebElement> numberofLinks = driver.findElements(By.xpath("//h5/following-sibling::div//a"));
		System.out.println("How many links in this layout : " + numberofLinks.size());

		/*****************************************************************
		 *****************************************************************
		 * 
		 * Waits Validations
		 * 
		 * ****************************************************************
		 *****************************************************************/

		// Main Menu Click
		driver.findElement(By.xpath("//span[text()='Element']//ancestor::li")).click();
		Thread.sleep(500);

		// Sub Menu 'Waits' Clicked
		driver.findElement(By.xpath("//span[text()='Waits']")).click();

		// Wait for Visibility (1 - 10 Sec)
		driver.findElement(By.xpath("//*[contains(text(),'Visibility ')]//following-sibling::div//button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		driver.findElement(By.xpath("//span[text()='I am here']")).click();

		// Wait for Clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		List<WebElement> alert = driver.findElements(By.cssSelector("[role='alert']"));
		wait.until(ExpectedConditions.invisibilityOfAllElements(alert));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();

		// Wait for Invisibility (1 - 10 Sec)
		driver.findElement(By.xpath("(//*[contains(text(),'Invisibility ')]//following-sibling::div//button)[1]"))
				.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));

		// Wait for Text Change (1 - 10 Sec)
		String text_before = driver
				.findElement(By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]")).getText();
		driver.findElement(By.xpath("//button[contains(@class,'danger')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
				By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]"), "Did you notice?"));
		String text_After = driver
				.findElement(By.xpath("(//button[contains(@class,'danger')]//following::span)[last()]")).getText();
		assertFalse(text_before.equals(text_After));
		
		driver.quit();
	}

}
