package main.java.mandatoryHomeWork.selenium;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraBugsValidation {

	private static String url = "https://abilashmchand05.atlassian.net/jira/software/projects/SDET/boards/1";
	private static String email = "abilashmchand05@gmail.com";
	private static String password = "Klopmnb!@#0192";
	ChromeDriver driver;

	@Test
	public void test() throws InterruptedException, AWTException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		ChromeDriver driver = new ChromeDriver(option);

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(email);
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='View all projects']")).click();
		driver.findElement(By.name("search")).sendKeys("Prime");
		String warningMsg = driver.findElement(By.xpath("//h4[text()='No projects were found that match your search']"))
				.getText();
		assertEquals("No projects were found that match your search", warningMsg);
		driver.findElement(By.xpath("//span[@role ='img' and @aria-label='Clear']")).click();
		driver.findElement(By.name("search")).sendKeys("SDETSeleniumLearnings");
		driver.findElement(By.xpath("//span[text() ='SDETSeleniumLearnings']")).click();
		String parent = driver.getWindowHandle();
		Thread.sleep(3000);

		/*
		 * List<WebElement> webElementsList2 =
		 * driver.findElements(By.xpath("//span[contains(@class,'slp')]"));
		 * List<WebElement> webElementsList2 =
		 * driver.findElements(By.xpath("//span[contains(@class,'sc-15')]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 */

		List<WebElement> webElementsList = driver.findElements(By.xpath("//*[contains(@class,'ghx-summary')]"));
		List<String> bugs = new ArrayList<String>();
		String toDolist_Count = driver.findElement(By.xpath("//*[text()='To Do']/following-sibling::div[@class='ghx-qty']")).getText().replace("\n",
				"");
		int toDo_Count = Integer.parseInt(toDolist_Count);
		int maxCount = 0;
		for (WebElement a : driver.findElements(By.xpath("//div[contains(@class,'ghx-qty')]"))) {

			String bugsCount = a.getText().replace("\n", "");
			int count = Integer.parseInt(bugsCount);
			maxCount = Math.max(count, toDo_Count);
		}
		Set<String> hs = new HashSet<String>();

		while (maxCount > 0) {
			Actions action = new Actions(driver);
			WebElement toDo = driver.findElement(By.xpath("//*[text()='To Do']"));
			action.moveToElement(toDo).perform();
			Thread.sleep(700);
			webElementsList = driver.findElements(By.xpath("//*[contains(@class,'ghx-summary')]"));
			for (WebElement elem : webElementsList) {
				bugs.add(elem.getText());
			}
			WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(toDo);
			action.scrollFromOrigin(scrollOrigin, 0, 350).perform();
			Thread.sleep(1200);
			maxCount = maxCount - 5;
		}

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://sivasdetteam3.atlassian.net/jira/your-work");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create']")));
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		driver.findElement(By.xpath("(//span[@role='img' and @aria-label='open'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Bug']")).click();

		driver.findElement(By.id("summary-field")).sendKeys("Test Issue 01");
		driver.findElement(By.xpath("//span[text()='Assign to me']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement sprint = driver.findElement(By.xpath("(//span[@role='img' and @aria-label='open'])[4]"));
		js.executeScript("arguments[0].scrollIntoView();", sprint);
		Thread.sleep(500);
		// sprint.click();
		// driver.findElement(By.xpath("//div[text()='SDET Sprint
		// 1']//following-sibling::div[text()='SDET board']"))
		// .click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		String child = driver.getWindowHandle();
		if (!parent.equals(child))
			driver.close();
		Thread.sleep(500);
		driver.switchTo().window(parent);
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		Thread.sleep(10000);
		List<String> bugs_current = new ArrayList<String>();

		for (WebElement bug : driver.findElements(By.xpath("//span[contains(@class,'slp')]")))
			bugs_current.add(bug.getText());

		System.out.println(bugs_current.size());

		driver.quit();
	}
}
