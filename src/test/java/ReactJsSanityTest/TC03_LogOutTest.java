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



public class TC03_LogOutTest extends BaseClass {
	   
	   
	   @Test 
	   
	   public void verifyImages() throws InterruptedException {
		   
		   WebElement ImageFile = driver.findElement(By.xpath("//img[@alt='test alt']"));
	        
	        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	        if (!ImagePresent)
	        {
	             System.out.println("Image not Loaded and displayed.");
	        }
	        else
	        {
	            System.out.println("Image Loaded and displayed.");
	        }
		}
		 
		   

	  
	   @Test 
	   
	   public void logOutUat() throws InterruptedException {
		   
		 		
		   JavascriptExecutor js8 = (driver);
		 
		   js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		 
		   Thread.sleep(10000);
		   		   
		   driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='Sign Out']")).click();
		   
		   Thread.sleep(10000);
		   
		   String message = driver.findElement(By.xpath("//h1[normalize-space()='How would you like to log in?']")).getText();
		   
		   System.out.println("After SignOut message on a Home Page is :" + message);
		   
		   Thread.sleep(5000);
		   
	    }
		   

		   
		   
}
	   
	   
	   




