package main.java.selenium;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Optional;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JiraIssueLog {

	private static String url = "https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/backlog?atlOrigin=eyJwIjoiYWRtaW4iLCJpIjoiM2JiY2FjMDRiZWE2NGM2NmE4ZTU4N2NlMjczYjU5MTIifQ%3D%3D&cloudId=cf274827-647b-4e35-959d-039794db9841";
	private static String email = "abilashmchand@gmail.com";
	private static String password = "Sdet@123";
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
		
		
		driver.get(url);
		// driver.executeCdpCommand(email, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-submit")).click();
				
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
		driver.quit();
	}

}
