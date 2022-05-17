package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Home {
	WebDriver driver;
	//1) locating the element of a page
	// you can find the email and pass from the fb website
	@FindBy(name="email") WebElement Ids;
	@FindBy(name="pass") WebElement Psswords;
	@FindBy(linkText="Forget Password") WebElement Forgot;
	
  //2) Creating the constructor
	public Home(WebDriver driver) {
 		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//3)creating a method
	public void Email() {
		Ids.sendKeys("John");
		}
	public void PsswordFieldsEnters() {
		Psswords.sendKeys("Silver");
	}
	public void ForgotLinkClick() {
		Forgot.click();
	}
} 
//now let's create the second page which is the forgot password page'