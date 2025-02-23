package seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.ModuleDriven.LoginAction;
import com.ModuleDriven.LoginPage;

public class Demo {
	@Test
	public void login() {
		 
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().deleteAllCookies();
    	driver.navigate().refresh();
    	
		LoginAction.login(driver);
		driver.quit();
	}

}
