 package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import PageObjectModel.Home;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;


public class Signout {
	WebDriver driver;
	@Test(priority = 1)
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.Email();
	  ob.PsswordFieldsEnters();
	  Thread.sleep(6000); 
	  ob.ForgotLinkClick();
	  ForgotPassword id=new ForgotPassword(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000);  
	  File screenshots =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshots, new File("C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Screenshots\\ShotOfPage.jpg"));
  }
  @BeforeClass
  public void beforeClass() {
	//  now w e have to call the Browsers method to select which browser to use
	  Browsers("Chrome");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	
  }
  
  
  
  public void Browsers(String window) {
	  if(window.equalsIgnoreCase("Chrom")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	  }
	  else if(window.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	  }
	  else if(window.equalsIgnoreCase("Firefox")){
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();	
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
  }
  }}
