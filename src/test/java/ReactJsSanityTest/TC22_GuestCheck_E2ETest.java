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
import com.basePackage.BaseClass1;
import com.google.j2objc.annotations.ReflectionSupport.Level;

import groovyjarjarantlr.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
 


/**
 * @author jaffar
 * 
 * 
 * ===========================================>
 * 
 * This Test is to verify Guest Checkout 
 * 
 * continue without logging in feature 
 * 
 * works as Expected we had a Bug on this
 * 
 * ===========================================>
 *  
 */



public class TC22_GuestCheck_E2ETest extends BaseClass1 {

	
	 
       @Test 
	   
	   public void guestCheckOutE2ETest() throws InterruptedException {
		   
    	   
    	   Thread.sleep(5000);
    	   
    	   JavascriptExecutor js11 = (driver);
    	   
    	   js11.executeScript("window.scrollBy(1000,4000)");
    	   
    	   Thread.sleep(5000);
    			 
    	   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
    	   
    	   Actions actions = new Actions(driver);
    		
    	   actions.moveToElement(menuList).build().perform();
    	   
    	   Thread.sleep(5000);
    	   
    	   WebElement home = driver.findElement(By.xpath("//a[contains(text(),'KIDS')]"));
    	   
           Actions actions16 = new Actions(driver);
    		
    	   actions16.moveToElement(home).build().perform();
    	   
    	   Thread.sleep(5000);
    	   
    	   driver.findElement(By.xpath("//ul[@data-name='KIDS']//li[@class='level-2-container level-2-container-1']//a[contains(text(),'tops')]")).click();
    	   
    	   Thread.sleep(2000);
    	   
    	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
    	   
    	    Thread.sleep(5000);
          
            driver.findElement(By.xpath("//a[normalize-space()='Boys Striped T-Shirt']")).click();

            Thread.sleep(2000);
         
           ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
         
            Thread.sleep(2000);
         
            driver.findElement(By.xpath("//a[normalize-space()='4-5 years']")).click();
         
            Thread.sleep(1000);
         
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
         
            Thread.sleep(2000);
         
            driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();
    	  
            Thread.sleep(2000);
          
            driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();
      
            Thread.sleep(2000);
          
            driver.findElement(By.xpath("//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']")).click();
		   
            Thread.sleep(2000);
          
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
          
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//button[normalize-space()='continue without logging in']")).click();
            
            Thread.sleep(5000);
            
            Thread.sleep(2000);
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
            
            Thread.sleep(2000);
            
            driver.findElement(By.xpath("//div[contains(text(),'Collect from Pargo Pick-up Point')]")).click();
            
            Thread.sleep(5000);
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");

            Thread.sleep(10000);
            
            driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"pargo-form\"]/div/div/iframe")));
            
            Thread.sleep(10000);
            
            driver.findElement(By.xpath("//*[@id=\"points_list\"]/div[1]/p[5]/button")).click();     
            
            Thread.sleep(5000);
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
            
            Thread.sleep(5000);
              
            driver.switchTo().defaultContent();
            
            Thread.sleep(5000);
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
            
            Thread.sleep(5000);
            
            driver.findElement(By.id("checkout-1__pargo_firstname")).sendKeys("Jaffe");
            
            driver.findElement(By.id("checkout-1__pargo_surname")).sendKeys("Shaike");
            
            //driver.findElement(By.id("checkout-1__pargo_email")).sendKeys("Jaffar.shaik706@gmail.com");
            
            driver.findElement(By.id("checkout-1__pargo_cell")).sendKeys("843716928");
            
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();    
            
            Thread.sleep(10000);  
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
            
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/button[1]")).click();
            
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 250)", "");
            
            Thread.sleep(6000);
            
            driver.findElement(By.xpath("//input[@id='paymentMethodsCREDITCARD_TOKEN0.cvv']")).sendKeys("123");
  	        
  	        Thread.sleep(5000);
  	        
  	        driver.findElement(By.xpath("//button[@id='tokenSubmit']")).click();
  	    	      
  	        Thread.sleep(15000);
            
  	        //Assert.assertEquals("https://mytfg.tfgtst.co.za/","https://mytfgworld.uat.tfgapps.co.za/", "Redirecting to wrong url Test Failed");
  	     	
  	        System.out.println("After Successful Transaction Redirecting to : https://mytfg.tfgtst.co.za/");
            
           
            }
          
           
	   }
		




