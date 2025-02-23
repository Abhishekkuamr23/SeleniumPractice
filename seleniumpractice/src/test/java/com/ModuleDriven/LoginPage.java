package com.ModuleDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	static WebElement element = null;
	
	public static WebElement hoverNewSignup(WebDriver driver){
		element = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		return element;
	}
	
	public static WebElement clickSignup(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a']"));
		return element;
	}
	
	public static WebElement userName(WebDriver driver){
		element = driver.findElement(By.id("ap_customer_name"));
		return element;
	}
	
	public static WebElement userPhone(WebDriver driver){
		element = driver.findElement(By.id("ap_phone_number"));
		return element;
	}
	
	public static WebElement userPassword(WebDriver driver){
		element = driver.findElement(By.id("ap_password"));
		return element;
	}
}
