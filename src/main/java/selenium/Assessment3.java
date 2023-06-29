package main.java.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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

public class Assessment3 {

	@Test
	public void test() throws InterruptedException, AWTException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'Close')]")));
		driver.findElement(By.xpath("//span[contains(@class,'Close')]")).click();

		driver.findElement(By.linkText("Holidays")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String window : handles)
			if (!window.equals(parentWindow))
				driver.switchTo().window(window);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fromCity']")));

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.cssSelector("[placeholder='From']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='SUGGESTIONS']//following-sibling::ul")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.cssSelector("[placeholder='To']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[contains(@class,'dest-city') and text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//div[text()='July 2023']//following::div[@class='DayPicker-Day']//p[text()='11']")).click();
		driver.findElement(By.cssSelector("[class='applyBtn']")).click();
		
		driver.findElement(By.xpath("//label[text()='With Flights']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.id("search_button")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("[class='skipBtn']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='More Filters']")).click();
		Thread.sleep(2000);
		WebElement slider = driver. findElement(By. xpath("(//div[@class='price_slider'])[1]"));
		Actions action = new Actions(driver);
		
		System.out.println("Actual X - "+driver.findElement(By.xpath("(//div[@class=\"rc-slider-handle rc-slider-handle-1\"])[1]")).getLocation().getX());
		System.out.println("Actual Y - "+driver.findElement(By.xpath("(//div[@class=\"rc-slider-handle rc-slider-handle-1\"])[1]")).getLocation().getY());
		
		action. dragAndDropBy(slider, 20, 345). perform();
		
		//action. dragAndDropBy(slider, 18, slider.getLocation().getY()). perform();
		
		List<WebElement> prices = driver.findElements(By.xpath("//*[contains(@data-testid,'discounted-price')]"));
		List<Integer> pricelist = new ArrayList<>();
		
		for(WebElement price:prices)			
			pricelist.add(Integer.parseInt(price.getText()));
		
		int min = Collections.min(pricelist);
		System.out.println(min);
		
		 driver.quit();
	}

}
