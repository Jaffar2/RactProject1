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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.basePackage.BaseClass;
import com.google.j2objc.annotations.ReflectionSupport.Level;
import io.github.bonigarcia.wdm.WebDriverManager;
 


/**
 * @author jaffar
 * 
 * 
 * Verify the User can collect 
 * 
 * Furniture Item from Store
 * 
 * Complete E2E Process
 * 
 *  
 */


public class TC07_FurnitureCollectFromStoreTest extends BaseClass {

	
	
	 
       @Test 
	   
	   public void checkOutFlow() throws InterruptedException {
		   
		   
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
			
            Thread.sleep(10000);
		        
	        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']")).click();
	        
            Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[normalize-space()='I Understand']")).click();
	        
	        Thread.sleep(5000);
	        
	        JavascriptExecutor js8 = (driver);
			   
			js8.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Collect')]")).click();
			
			Thread.sleep(5000);
			
			JavascriptExecutor js9 = (JavascriptExecutor) driver;
			
			js9.executeScript("window.scrollBy(0,200)");
			
			Thread.sleep(5000);
			
			WebElement selectMyElement = driver.findElement(By.cssSelector("div[class='jsx-1739976969 form__select nosui-form-select-full undefined form__select-furniture-store-id'] div[class='jsx-1739976969 nosui-form-select__dropdown-button drop-down-control']")); 
			
			selectMyElement.click();

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[normalize-space()='@home PAROW CAPE TOWN DC']")).click();
			
			Thread.sleep(5000);			
			
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			
			Thread.sleep(2000);
			
            JavascriptExecutor js11 = (JavascriptExecutor) driver;
			
			js11.executeScript("window.scrollBy(0,200)");
			
		    try {
		            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
		        } catch (IOException e) {
		            System.out.println(e.getMessage());
		        }
	        
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id='checkout__delivery-collect__number']")).sendKeys("843716928");
		    
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		    
		    Thread.sleep(10000);
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		    
		    Thread.sleep(10000);
		    
		    System.out.println("Test Failed Due to PayU is down");
		     
	        driver.findElement(By.xpath("//input[@id='paymentMethodsCREDITCARD_TOKEN0.cvv']")).sendKeys("123");
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[@id='tokenSubmit']")).click();
	    	      
	     	Thread.sleep(15000);
	     	
	     	Assert.assertEquals("https://mytfg.tfgtst.co.za/","https://mytfgworld.uat.tfgapps.co.za/", "Redirecting to wrong url Test Failed");
	     	
	        
		  
	       
		   

	   }
		
}



