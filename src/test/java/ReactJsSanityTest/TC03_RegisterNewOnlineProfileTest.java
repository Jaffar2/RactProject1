/**
 * 
 */
package ReactJsSanityTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.j2objc.annotations.ReflectionSupport.Level;
import io.github.bonigarcia.wdm.WebDriverManager;
 


/**
 * @author jaffar
 *
 */


/*
 * ===============================================>
 * 
 * This Test is to verify User can Click on 
 * 
 * Register New Online Profile
 * 
 * This feature was not working before 
 * 
 * ===============================================>
 */



public class TC03_RegisterNewOnlineProfileTest {
	
	   public ChromeDriver  driver;
	   
	   
	   @Test (priority=3)
	   
	   public void loginUat() throws InterruptedException {
		   
   
		  WebDriverManager.chromedriver().setup();
			 
		  ChromeOptions options = new ChromeOptions();
		 
		  options.addExtensions(new File("auth.crx"));
		 
		  driver = new ChromeDriver(options);
		 
	      JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		  driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/options.html");

		  driver.findElement(By.id("url")).sendKeys("https://mytfgworld.uat.tfgapps.co.za/");

		  driver.findElement(By.id("username")).sendKeys("tfg-uat");
	 
          driver.findElement(By.id("password")).sendKeys("TFGReact2021");

          driver.findElement(By.xpath("//button[.='Add']")).click();

		  driver.get("https://mytfgworld.uat.tfgapps.co.za/");

		  Thread.sleep(10000);
		 
		  System.out.println("=====================> Browser Launched");
		 
		  driver.manage().window().maximize();

		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath("//i[@class='icon icon-cross']")).click();
		
		  Thread.sleep(5000);
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      driver.findElement(By.xpath("//span[normalize-space()='Login & Register']")).click();
		  		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//button[normalize-space()='Register a new online profile']")).click();
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(10000);
		  
		  String message1 = driver.findElement(By.xpath("//div[contains(text(),'Do you have a TFG account or TFG REWARDS card from')]")).getText();
		
		  System.out.println("message on Register a new online profile page is " + message1);
		  
		  Thread.sleep(10000);
		  
	      driver.quit();
		   
}
	   
	   

}


