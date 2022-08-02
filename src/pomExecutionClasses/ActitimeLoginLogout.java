package pomExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClassTestScript.ActiTimehomePagePOM;
import pomClassTestScript.ActitimeLoginPagePOM;

public class ActitimeLoginLogout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Chrome\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		ActitimeLoginPagePOM a= new ActitimeLoginPagePOM(driver);
		a.actiTimeUsername();
		a.actiTimePassword();
		a.actiTimeLogin();
		ActiTimehomePagePOM b=new ActiTimehomePagePOM(driver);
		b.actiTimeLogoCheck();
		b.actiTimeLogOut();
		driver.quit();
		
		}

}
