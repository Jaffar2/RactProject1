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

import com.basePackage.BaseClass;
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



public class TC05_RegisterNewOnlineProfileTest extends BaseClass {
	
	   
	   
	  @Test (priority=7) 
	   
	   public void registerNewOnline() throws InterruptedException {
		  
		
		  Thread.sleep(5000);
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();
		  		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='Sign Out']")).click();
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//button[normalize-space()='Register a new online profile']")).click();
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(10000);
		  
		  String message1 = driver.findElement(By.xpath("//div[contains(text(),'Do you have a TFG account or TFG REWARDS card from')]")).getText();
		
		  System.out.println("message on Register a new online profile page is " + message1);
		  
		  Thread.sleep(10000);
		  
		  System.out.println("=============>Test Case 05-RegisterNewOnlineProfile-Test-Passed==========>");
		  
	      
	    }
		   
}
	   
	   



