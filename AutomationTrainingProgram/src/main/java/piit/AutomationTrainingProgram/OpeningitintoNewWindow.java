package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpeningitintoNewWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		//in order to open an element to a new window, keep pressing Shift and then click on the element
		WebElement NewReleasesLinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		NewReleasesLinks.click();
		ob.keyUp(Keys.SHIFT).build().perform();
	   
		
	}

}
