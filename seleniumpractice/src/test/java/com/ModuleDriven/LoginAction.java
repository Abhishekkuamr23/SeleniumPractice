package com.ModuleDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
import com.ModuleDriven.LoginPage;
public class LoginAction {

	public static void login(WebDriver driver) {
		Actions actions = new Actions(driver);
    	actions.moveToElement(LoginPage.hoverNewSignup(driver)).perform();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage.clickSignup(driver).click();
		LoginPage.userName(driver).sendKeys("abc@gmail.com");
		LoginPage.userPhone(driver).sendKeys("9876453234");
		LoginPage.userPassword(driver).sendKeys("qwertY123@");
	}
}
