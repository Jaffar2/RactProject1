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
 * ===========================================================>
 * 
 * This Test is to verify User can SignOut on UAT ReactJS
 * 
 * Verify After Successful Sign Out on a Home Page message is:
 * 
 * How would you like to log in? Displayed 
 * 
 * ===========================================================>
 */



public class TC20_CancelOrderTest extends BaseClass {
		   

	  
	   @Test 
	   
	   public void orderCancelTest() throws InterruptedException {
		   
		 		
		   JavascriptExecutor js8 = (driver);
		 
		   js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		 
		   Thread.sleep(10000);
		   		   
		   driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//div[contains(@class,'header-control-items')]//span[contains(@class,'profile-menu__item-copy')][normalize-space()='Orders']")).click();
		   
		   Thread.sleep(6000);
		   
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//a[contains(text(),'x244')]")).click();
		   
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//a[contains(text(),'Cancel Order')]")).click();
		   
		   Thread.sleep(2000);
		   
		   String modalMsg = driver.findElement(By.xpath("//h2[normalize-space()='Order Cancellation']")).getText();
		  
		   String expMsg = "ORDER CANCELLATION";
		   
		   Assert.assertEquals(modalMsg, expMsg);
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Yes, Cancel Order']")).click();
		   
		   Thread.sleep(5000);
		   
		   Assert.fail("Order Cancellation is not working as Expected");
		   
		   
     
		   
	    }
		   

		   
		   
}
	   
	   
	   




