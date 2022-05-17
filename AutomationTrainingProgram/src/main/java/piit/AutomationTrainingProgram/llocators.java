package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class llocators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	
		
		//click on a element / locate an element by id
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		/* type something in a specific field/ locate an element by name
		WebElement searchfieldtext=driver.findElement(By.name("field-keywords"));
		searchfieldtext.sendKeys("computer");
		*/
		//locating a link by linkText. 
		WebElement linktxt=driver.findElement(By.linkText("Registry"));
		linktxt.click();
	}

}
