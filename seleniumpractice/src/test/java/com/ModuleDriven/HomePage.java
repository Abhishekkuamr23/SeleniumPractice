package com.ModuleDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	static WebElement element = null;
	
	public static WebElement userName(WebDriver driver){
		element = driver.findElement(By.id("El=mail"));
		return element;
	}
	
	public static WebElement userPassword(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
	}
}
