package actiTimePageFactoryExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actiTimePageFactoryTest.ActiTimeHomapagePageFacory;
import actiTimePageFactoryTest.ActiTimeLoginPagePageFactory;

public class ActiTimeLoginLogout {
public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Automation\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.navigate().to("http://localhost/user/submit_tt.do");
	ActiTimeLoginPagePageFactory p=new ActiTimeLoginPagePageFactory(driver);
	p.actiTimeUsername();
	p.actiTimePassword();
	p.actiTimeLogin();
	ActiTimeHomapagePageFacory pp=new ActiTimeHomapagePageFacory(driver);
	pp.actiTimeTimeTracklogo();
	pp.actiTimeLogOut();
	driver.quit();
	
}
}
