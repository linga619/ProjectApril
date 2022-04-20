package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			return driver;
		}
		if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			return driver;
		}
		if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			return driver;
			}
		return driver;
		}
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		return driver;
		}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		return driver;
		}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
		}
	public static void click(WebElement e) {
		e.click();
	}
	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	public static String title() {
		String title = driver.getTitle();
		return title;
		}
	public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
	}
	public static void moveToElements(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		}
	public static void quit() {
		driver.quit();
	}
	public void btnClose() {
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();

	}
	public  static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
