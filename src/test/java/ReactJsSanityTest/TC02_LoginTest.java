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
import org.testng.Assert;
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
 * ======================================================>
 * 
 * This Test is to verify User can Login to UAT ReactJS
 * 
 * With valid credentials
 * 
 * ======================================================>
 */



public class TC02_LoginTest extends BaseClass {
	
	
	   
	   
	@Test (priority=3) 
	   
	   public void verifyLogin() throws InterruptedException {
		
		 
		 Thread.sleep(5000);
		   
     	 String expectedTitle = "myTFGworld - Welcome to your world of curated, lifestyle shopping.";
     	  
     	 String actualTitle = driver.getTitle(); 
     	 
     	 Thread.sleep(5000);
     	 
     	 Assert.assertEquals(actualTitle, expectedTitle);
     	 
     	 Thread.sleep(5000);
     	 
     	 System.out.println("=============>Test Case 02-Login-Test-Passed==========>");
	    
		
	    }
		   
}
	   
	   




