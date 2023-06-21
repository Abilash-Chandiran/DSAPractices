package main.java.selenium;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JiraLoginScenario {

	private static String url = "https://abilashmchand05.atlassian.net/jira/software/projects/SDET/boards/1";
	private static String email = "abilashmchand05@gmail.com";
	private static String password = "Klopmnb!@#0192";
	ChromeDriver driver;

	@Test
	public void test() throws InterruptedException, AWTException {

		/*
		 * Selenium - 3.141.59 System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\abila\\eclipse-workspace\\SDETTrainingPrograms\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */

		// Selenium - 4.9.1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(email);
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(2000);
		submit = driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		submit.click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button/span[text()='Projects']")));
		assertEquals("Projects", driver.findElement(By.xpath("//button/span[text()='Projects']")).getText());
		driver.quit();

		/*
		 * DevTools devTool = driver.getDevTools(); devTool.createSession();
		 * devTool.send(Network.enable(Optional.empty(), Optional.empty(),
		 * Optional.empty()));
		 * 
		 * devTool.addListener(Network.requestWillBeSent(), requestSent -> {
		 * System.out.println("Request URL => " + requestSent.getRequest().getUrl());
		 * System.out.println("Request Method => " +
		 * requestSent.getRequest().getMethod());
		 * System.out.println("Request Headers => " +
		 * requestSent.getRequest().getHeaders().toString());
		 * System.out.println("------------------------------------------------------");
		 * });
		 */

		/*
		 * driver.findElement(By.cssSelector("[id='createGlobalItem']")).click(); //
		 * driver.findElement(By.cssSelector(
		 * "[id='issue-create.ui.modal.create-form.type-picker.issue-type-select']")).
		 * click();
		 * driver.findElement(By.xpath("(//span[@role='img' and @aria-label='open'])[2]"
		 * )).click(); Thread.sleep(2000); Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);
		 * Thread.sleep(1000); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * driver.findElement(By.id("summary-field")).sendKeys("Test Issue - 001"); //
		 * String str = RandomStringUtils.randomAlphabetic(8); //
		 * driver.findElement(By.xpath("//div[@id='assignee-container']")).click(); //
		 * driver.findElement(By.xpath("//div[@id='assignee-container']")).sendKeys(str)
		 * ; driver.findElement(By.xpath("//span[text()='Assign to me']")).click();
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * Thread.sleep(8000);
		 */
	}

}
