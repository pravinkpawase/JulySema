package actiTimePageFactoryTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomapagePageFacory {

	@FindBy(xpath="//img[@width='84']")
	private WebElement logo;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	WebDriver driver;

	public ActiTimeHomapagePageFacory(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void actiTimeTimeTracklogo() {
		boolean p=logo.isDisplayed();
		if(p==true) {
			System.out.println("Test Scenario is Passed and TimeTrack logo is Verified");
		}
		else {
			System.out.println("Test Scenario is Failed logo is not Visible");
		}
	}
	public void actiTimeLogOut() {
		logout.click();
	}
}
