package main.java.seleniumpractice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceMarketingTestCase {

	WebDriver driver;
	String ExpectedBrowserName = "chrome";
	String userName = "ranjini.r@testleaf.com";
	String password = "Testleaf$321";
	List<String> appList_Expected = Arrays.asList("Service", "Marketing", "Community", "Salesforce Chatter", "Content",
			"Sales Console", "Service Console");

	@BeforeTest
	public void initializeBrowser() {

		driver = new ChromeDriver();
		driver.get("https://testleaf30-dev-ed.develop.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Step 1
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName_Actual = cap.getBrowserName().toLowerCase();
		assertEquals(ExpectedBrowserName, browserName_Actual);

		// Step 2
		assertTrue(driver.getTitle().contains("Salesforce"));

		// Step 3
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		WebElement homeButton = driver.findElement(By.linkText("Home"));
		wait.until(ExpectedConditions.elementToBeClickable(homeButton));
		assertTrue(homeButton.getText().equals("Home"));

		// Step 4
		driver.findElement(By.xpath("//button[contains(@class,'AppLauncherHeader')]")).click();
		List<WebElement> applist = driver.findElements(By.xpath("//div[contains(@id,'menu-dropdown')]//span"));
		List<String> listofApps_Actual = new ArrayList<String>();
		for (WebElement e : applist)
			listofApps_Actual.add(e.getText());
		assertEquals(appList_Expected, listofApps_Actual);

		// Step 5
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		assertTrue(
				driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps or items')]")).isDisplayed());

		// Step 6
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search apps or items')]")).sendKeys("Marketing");
		driver.findElement(By.xpath("//mark[text()='Marketing']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@title='Marketing']"))));
		assertTrue(driver.findElement(By.xpath("//span[@title='Marketing']")).isDisplayed());

		// Step 7
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Leads']//parent::a"))));
		WebElement leadsBtn = driver.findElement(By.xpath("//span[text()='Leads']//parent::a"));
		js.executeScript("arguments[0].click();", leadsBtn);
		List<WebElement> existingLeads = driver
				.findElements(By.xpath("//table[contains(@class,'forceRecordLayout')]//tbody//tr"));
		assertTrue(existingLeads.size() > 0);
		assertTrue(driver.findElement(By.cssSelector("[title='New']")).isDisplayed());

		// Step 8
		driver.findElement(By.cssSelector("[title='New']")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//button[contains(@aria-label,'Salutation')]"))));

		// Step 9
		driver.findElement(By.xpath("//button[contains(@aria-label,'Salutation')]")).sendKeys("D");
		driver.findElement(By.xpath("//button[contains(@aria-label,'Salutation')]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TestUser");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("TestLeaf");

		// Step 10
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='alertdialog']")));
		assertTrue(driver.findElement(By.xpath("//div[@role='alertdialog']")).getText().contains("Success"));

		// Step 11
		driver.findElement(By.xpath("//*[@apiname='Submit']/../following-sibling::li")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Convert']"))));
		driver.findElement(By.xpath("//span[text()='Convert']")).click();

		// Step 12
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("(//div[contains(@class,'createPanelDetail')])[3]"))));
		driver.findElement(By.xpath("(//div[contains(@class,'createPanelDetail')])[3]")).click();
		driver.findElement(By.xpath("(//input[@class=' input'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@class=' input'])[4]")).sendKeys("TestLeaf New");
		Thread.sleep(5000);

		// Step 13
		driver.findElement(By.xpath("//button[text()='Convert']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//div[@class='title']//*"))));

		// Step 14
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Leads']//parent::a"))));

		// Step 15
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Testleaf23");
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> leads = driver
				.findElements(By.xpath("//table[contains(@class,'forceRecordLayout')]//tbody//tr"));
		assertTrue(leads.size() == 0);

		// Step 16
		WebElement opportunitiesBtn = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		js.executeScript("arguments[0].click();", opportunitiesBtn);
		Thread.sleep(2000);
		new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search this list...']")));
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("TestLeaf New");
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> leadsOpp = driver
				.findElements(By.xpath("//table[contains(@class,'forceRecordLayout')]//tbody//tr"));
		assertTrue(leadsOpp.size() > 0);

		// Step 17
		driver.findElement(By.xpath("//tbody/tr/th/span/a")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Opportunity']")));
		assertTrue(driver.findElement(By.xpath("(//div[text()='Opportunity']//following-sibling::slot/*)[1]")).getText()
				.equals("TestLeaf New"));

	}

}
