package piit.AutomationTrainingProgram;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettingTwoBrowserIDatOnce {

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
	    Thread.sleep(6000);
	    
		driver.getWindowHandle();
		Set <String> windowhandles=driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator();
		String Parent=iterators.next(); // it will point to first index
		String SecondWindow=iterators.next();//point to second array 
		System.out.println("This is Parent window ="+ Parent);
		System.out.println("This is the second window =" + SecondWindow);	
		// right now if i would like to click on products then i have to get back/ switch to the the window that i want. 
		driver.switchTo().window(SecondWindow);// I choose to switch to the second window
	    WebElement Products=driver.findElement(By.linkText("Camera & Photo Products"));
	    Thread.sleep(6000);
	    Products.click();
	
	}
}
