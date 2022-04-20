package org.git;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.utility.BaseClass;

public class Flipkart extends BaseClass {
public static void main(String[] args) {
	launchBrowser("chrome");
	urlLaunch("https://www.flipkart.com/");
	maximize();
    implicitlyWait();
	WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btnclose.click();
	WebElement txtsearch = driver.findElement(By.xpath("//input[@type='text']"));
	txtsearch.sendKeys("iphone",Keys.ENTER);
	List<WebElement> phname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> phprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	int size = phname.size();
	System.out.println(size);
	for(int i=0; i<phname.size(); i++) {
		WebElement phones = phname.get(i);
		System.out.println(phones.getText());
		WebElement prices = phprice.get(i);
		System.out.println(prices.getText());
	}
	
	WebElement btnlowtohigh = driver.findElement(By.xpath("//div[@class='_10UF8M _3LsR0e']"));
	btnlowtohigh.click();
	List<WebElement> lowtohigh = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	for(int i=0;i<lowtohigh.size();i++) {
		WebElement lowtohigh1 = lowtohigh.get(i);
		System.out.println(lowtohigh1.getText());
	}
	quit();
}
}
