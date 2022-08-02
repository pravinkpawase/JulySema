package arrayPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserL {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","F:\\Automation\\Gecko\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.com");
	driver.navigate().to("https://www.google.com");
	driver.quit();
}
}
