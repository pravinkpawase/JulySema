package pomClassTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPagePOM {
private WebElement user;
private WebElement pass;
private WebElement login;
WebDriver driver;
public ActitimeLoginPagePOM(WebDriver driver){
	this.driver=driver;
	user=driver.findElement(By.xpath("//input[@name='username']"));
	pass=driver.findElement(By.xpath("//input[@name='pwd']"));
	login=driver.findElement(By.xpath("//a[@id='loginButton']"));
}
public void actiTimeUsername() {
	//To check whether user able to enter UserName
	user.sendKeys("admin");
}
public void actiTimePassword() {
	//ToVerify that User able to Enter Password
	pass.sendKeys("manager");
}
public void actiTimeLogin() {
	//To validate that User able to click on Login Button
	login.click();
}
}
