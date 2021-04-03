/**
 * 
 */
package ReactJsSanityTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.AbstractDocument.Content;

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
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;
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
 * This Test is to verify Today's deal Feature
 * 
 * And Show All 15 images , 30 , 45 , All images
 * 
 * Then Price High to Low , Low to High updating
 * 
 * As Expected.
 * 
 * ======================================================>
 */



public class TC06_TodaysDealTest extends BaseClass {
	
	   
	   
	   @Test 
	   
	   public void todaysDeal() throws InterruptedException {
		   
		   
		  Thread.sleep(5000);
		   
		  driver.findElement(By.xpath("//img[@alt='test alt']")).click();
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(2000);
			
	      driver.findElement(By.xpath("//span[normalize-space()='15']")).click();
	      
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//div[contains(@class,'facet-sort__control-options-item')][normalize-space()='30']")).click();
	      
	      Thread.sleep(5000);
	      
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      js.executeScript("window.scrollBy(0,1000)");
	      
	      Thread.sleep(5000);
	      
	      JavascriptExecutor jse = (JavascriptExecutor)driver;
	      
	      jse.executeScript("scroll(0, -250);");
	      
	      List<WebElement> listImages=driver.findElements(By.tagName("img"));
	      
	        System.out.println("No. of Images: "+listImages.size());
	        
	        for(WebElement image:listImages)
	        {
	            if(image.isDisplayed())
	            {
	                counter++;
	                
	                System.out.println(image.getAttribute("alt"));
	            }
	        }
	        
	        System.out.println("No. of total displable images: "+counter);
	        
	        Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
	        
	        Thread.sleep(5000);
		   	  
		   	driver.findElement(By.xpath("//div[contains(@class,'facet-sort__control-options-item')][normalize-space()='45']")).click();
		   	  
		   	Thread.sleep(5000);
		   	
		   	driver.findElement(By.xpath("//span[normalize-space()='45']")).click();
		   	
		   	Thread.sleep(5000);
			
		    driver.findElement(By.xpath("//div[@class='facet-sort__control-options-item '][normalize-space()='all']")).click();
		    
		    Thread.sleep(5000);
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    
		    Thread.sleep(5000);
		    
		    jse.executeScript("scroll(0, -250);");
		    
		    Thread.sleep(10000);
		    
		    driver.findElement(By.xpath("//span[normalize-space()='Sort']")).click();
	      
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//div[contains(@class,'facet-sort__control-select state--open')]")).click();
		    
		    Thread.sleep(2000);
		    
		    js.executeScript("window.scrollBy(0,1000)");
		    
		    Thread.sleep(5000);
		    
		    jse.executeScript("scroll(0, -250);");
		    
		    Thread.sleep(5000);
		    
		 	String price = driver.findElement(By.xpath("//div[normalize-space()='R 249.00']")).getText();
		    
		    System.out.println("Price High to Low is :" + price);
		    
		    Assert.assertEquals("R 249.00","R 499.00", "Today's Deal Sort Price High to Low or Low to High not updating Test Failed");
		    
		    Thread.sleep(2000);
			    
		    
		    
		    
	   }		    
	
		    
	
}
	   
	   
	   



