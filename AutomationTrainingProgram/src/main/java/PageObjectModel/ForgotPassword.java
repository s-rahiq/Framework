package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
WebDriver driver;
@FindBy(xpath="//*[@name='email])[2]") WebElement ID;
@FindBy(name="did_submit") WebElement Searchbutton;

public ForgotPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
}
public void IdsSendKeys() {
	ID.sendKeys("ali@gmail.com");
}
// we have two locators so we are going to create two methods
 public void Searcbuttonclick() {
	 Searchbuttonclick.Click();
 }
//in the page object model we are creating to the v rulse we are not able to execute them
 //but we can use them in other class and execute them 
}
