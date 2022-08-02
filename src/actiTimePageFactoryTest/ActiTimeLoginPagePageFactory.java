package actiTimePageFactoryTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPagePageFactory {

	@FindBy(xpath="//input[@name='username']")
	private WebElement user;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pass;
	@FindBy(xpath="//a[@class='initial']")
	private WebElement login;
	WebDriver driver;
	public ActiTimeLoginPagePageFactory(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void actiTimeUsername() {
		user.sendKeys("admin");;
	}
	public void actiTimePassword() {
		pass.sendKeys("manager");	
	}
	public void actiTimeLogin() {
		login.click();
	}

}
