package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeBrowsersDriver {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.jqueryui.com");
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		/*
		//driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.navigate().refresh();
		//how to get the currenturl address
		String url=driver.getCurrentUrl();
		//now i would like to display it for that i have to first store it. 
		System.out.println("ur");
		//window handle: when your open browser it will open a session id for each tab. if you want to see/use that session id you can use this feature. 
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		//driver.close(); // or dirver.quit();
		//absolute xpath /html/body/div/header/div/div/div/div/form/div/div/span/input
		WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		Thread.sleep(6000);
		searchtoclick.click();
		// relative xpath to search flower in web browser input[@aria-label='Search']
		WebElement searchtofield=driver.findElement(By.xpath("input[@aria-label='Search']"));
		searchtofield.sendKeys("flower");
		//(//a[text()='New Releases'])[1]
		searchtofield.clear();
	// driver.findElements(By.xpath("(//a[text()='New Releases'])[1]"));
		//04/20/22
	/*	Actions ob=new Actions(driver);
		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(hovers).build().perform();
		
		*/
		
		WebElement dropable=driver.findElement(By.linkText("Droppable"));
		driver.switchTo().frame(0);
		WebElement elementToDrag=driver.findElement(By.id("draggable"));
		WebElement DropToHere=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(elementToDrag, DropToHere).build().perform();
		
		driver.switchTo().parentFrame();
		WebElement Sorting=driver.findElement(By.linkText("Sortable"));
		Sorting.click();
		
		Thread.sleep(6000);
		WebElement Picture=driver.findElement(By.xpath("//*[@style='sursor: pointer;']"));
		Actions ac=new Actions(driver);
		ob.contextClick(Picture);
		
		*/
		WebElement searchtofield=driver.findElement(By.id("twotabsearchtextbox"));
		searchtofield.sendKeys("Computer");
		Actions cd=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CANCEL)ac.build().perform();
		searchtofield.sleep(6000);
		searchtofield.click();
	}
	
} 
