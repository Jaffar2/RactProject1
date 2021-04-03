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
import org.sikuli.script.Key;
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
 * =====================================================================>
 * 
 * This Test is to verify Your order qualifies for Free Delivery
 * 
 * sitewide-bag-pop-up__message is displayed after Adding Item to Bag
 * 
 * 
 * 
 * =======================================================================>
 */



public class TC09_SitewideBagTest extends BaseClass {

	   
	   
	   @Test 
	   
	   public void sitewidePop() throws InterruptedException {
		  		 
		   
		   Thread.sleep(5000);
		   
		   JavascriptExecutor js = (driver);
		   
		   js.executeScript("window.scrollBy(1000,4000)");
		   
		   Thread.sleep(5000);
				 
		   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
		   
		   Actions actions = new Actions(driver);
			
		   actions.moveToElement(menuList).build().perform();
		   
		   Thread.sleep(5000);
		   
		   WebElement home = driver.findElement(By.xpath("//a[normalize-space()='HOME']"));
		   
		   Actions actions1 = new Actions(driver);
			
		   actions.moveToElement(home).build().perform();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//a[normalize-space()='furniture']")).click();
		   
		   Thread.sleep(5000);
			   
           JavascriptExecutor js2 = (driver);
		   
           js2.executeScript("window.scrollBy(0,450)");
           
           driver.findElement(By.xpath("//*[@id=\"products-column\"]/div[1]/div/div[2]/div/div/h3/a")).click();
           
           Thread.sleep(5000);
			 
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     
	        try {
	            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();
	        
	        Thread.sleep(5000);
			   
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		    Thread.sleep(5000);
			
			JavascriptExecutor js7 = (JavascriptExecutor) driver;
			
			js7.executeScript("window.scrollBy(0,200)");
			
            Thread.sleep(5000);
		        
	        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();
	        
			Thread.sleep(5000);
	        
	        String popMessage = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText();

	        System.out.println(popMessage);

            String expMessage = "Your order qualifies for free delivery*. *excludes furniture delivery" ;
            
            Assert.assertEquals(popMessage, expMessage);
            		 
	        
         
	   }
		   
}
	   
	   




