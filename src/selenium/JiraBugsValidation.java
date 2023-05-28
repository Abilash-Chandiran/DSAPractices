package selenium;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JiraBugsValidation {

	private static String url = "https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/backlog?atlOrigin=eyJwIjoiYWRtaW4iLCJpIjoiM2JiY2FjMDRiZWE2NGM2NmE4ZTU4N2NlMjczYjU5MTIifQ%3D%3D&cloudId=cf274827-647b-4e35-959d-039794db9841";
	private static String email = "abilashmchand@gmail.com";
	private static String password = "Sdet@123";
	ChromeDriver driver;

	@Test
	public void test() throws InterruptedException, AWTException {
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver();

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='View all projects']")).click();
		driver.findElement(By.name("search")).sendKeys("Prime");
		String warningMsg = driver.findElement(By.xpath("//h4[text()='No projects were found that match your search']"))
				.getText();

		assertEquals("No projects were found that match your search", warningMsg);
		driver.findElement(By.xpath("//span[@role ='img' and @aria-label='Clear']")).click();
		driver.findElement(By.name("search")).sendKeys("SDETTeamThreePractice");
		driver.findElement(By.xpath("//span[text() ='SDETTeamThreePractice']")).click();
		Thread.sleep(3000);
		List<WebElement> webElementsList = driver.findElements(By.xpath("//span[contains(@class,'slp')]"));
		List<String> bugs = new ArrayList<String>();

		for (WebElement bug : webElementsList)
			bugs.add(bug.getText());
		String parent = driver.getWindowHandle();
		int initialBugsCount = bugs.size();
		System.out.println("Initial bugs count - " + initialBugsCount);

		// Switch to new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://sivasdetteam3.atlassian.net/jira/your-work");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Create']")).click();
		driver.findElement(By.xpath("(//span[@role='img' and @aria-label='open'])[2]")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.id("summary-field")).sendKeys("Issue - 001");
		driver.findElement(By.xpath("//span[text()='Assign to me']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@role='img' and @aria-label='open'])[2]")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		String child = driver.getWindowHandle();
		Thread.sleep(1000);

		if (!parent.equals(child))
			driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		// driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(5000);
		List<String> bugs_current = new ArrayList<String>();

		for (WebElement bug : driver.findElements(By.xpath("//span[contains(@class,'slp')]")))
			bugs_current.add(bug.getText());

		driver.quit();
	}
}
