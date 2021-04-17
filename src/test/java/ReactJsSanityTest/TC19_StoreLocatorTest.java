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
import org.openqa.selenium.Keys;
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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.basePackage.BaseClass;
import com.google.j2objc.annotations.ReflectionSupport.Level;

import groovyjarjarantlr.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
 


/**
 * @author jaffar
 * 
 * 
 * =============================================>
 * 
 * This Test is to verify Chcek Strore Stock
 * 
 * Works as Expected 
 *  
 *  
 *  ============================================>
 */


public class TC19_StoreLocatorTest extends BaseClass {

	
	
	 
	   @Test (priority=27)
	   
	   public void storeLocatorTest() throws InterruptedException {
		   
    	   
           Thread.sleep(5000);
		   
           driver.findElement(By.xpath("//span[normalize-space()='Store Locator']")).click(); 
           
           Thread.sleep(5000);
           
           WebElement searchStore = driver.findElement(By.xpath("//input[@placeholder='Enter either city, suburb or shopping mall']"));
           
           searchStore.sendKeys("Canal Walk");
           
           Thread.sleep(5000);
           
           driver.findElement(By.xpath("//button[normalize-space()='Find a Store']")).click();
           
           Thread.sleep(10000);
           
           String foundStores = driver.findElement(By.xpath("//a[normalize-space()='Fabiani Women CANAL WALK MILNERTON']")).getText();    
           
           String expMessage = "FABIANI WOMEN CANAL WALK MILNERTON";
  		 
  		   Assert.assertEquals(foundStores, expMessage);
  		   
  		   Thread.sleep(5000);
  		   
  		   System.out.println("=============>Test Case 19-Store-Locator-Test-Passed==========>");
           
           
		   
          
	   }
		
}



