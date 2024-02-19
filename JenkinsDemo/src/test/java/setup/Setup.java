package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Setup {
WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Drivers\\chromedriver-win64\\chromedriver.exe");	
		 ChromeOptions options = new ChromeOptions();
	      driver = new ChromeDriver(options);
	      driver.get("https://www.facebook.com");
	     String Title= driver.getTitle();
	     System.out.println(Title);
	     Assert.assertEquals(Title, "Facebook – log in or sign up");
	     driver.close();
	}
	
	

	
	

}
