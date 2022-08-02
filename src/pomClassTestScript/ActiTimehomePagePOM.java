package pomClassTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimehomePagePOM {
	private WebElement logo;
	private WebElement logout;
	WebDriver driver;
	public ActiTimehomePagePOM(WebDriver driver) {
		this.driver=driver;
		logo=driver.findElement(By.xpath("//img[@width='179']"));
		logout=driver.findElement(By.xpath("//a[@id='logoutLink']"));		
	}
	public void actiTimeLogoCheck() {
	//To verify that actiTime logo is visible to user
	boolean pp=logo.isDisplayed();
	if(pp==true) {
	System.out.println("Logo of actiTime is visible and test Scenario is Passed");}
	else {
		System.out.println("Logo of actiTime is not Visible and Test Scenario is Failed");
	}
	}
	public void actiTimeLogOut() {
		//To validate that user able to click on logout
	logout.click();
	}
}
