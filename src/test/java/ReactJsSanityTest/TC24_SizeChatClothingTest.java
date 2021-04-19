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
import org.openqa.selenium.NoSuchElementException;
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
 * ========================================>
 * 
 * 
 * This Test is to make sure
 *
 * Size chat for Clothing works as Expected
 * 
 * ==========================================>
 *
 */
public class TC24_SizeChatClothingTest extends BaseClass {

		
	
	  @Test (priority=32)
	  
	  public void verifySizeChatClothingTest() throws InterruptedException {
		  	  
	  
	   Thread.sleep(5000);
	   
	   JavascriptExecutor js11 = (driver);
	   
	   js11.executeScript("window.scrollBy(1000,4000)");
	   
	   Thread.sleep(5000);
			 
	   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
	   
	   Actions actions = new Actions(driver);
		
	   actions.moveToElement(menuList).build().perform();
	   
	   Thread.sleep(5000);
	   
	   WebElement home = driver.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));
	   
	   Actions actions1 = new Actions(driver);
		
	   actions.moveToElement(home).build().perform();
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//label[@for='sub-sub-nav-nav-level-1-0-8-/plp/women/tops/_/N-l6ev2b']//a[contains(text(),'TOPS')]")).click();
	   
	   Thread.sleep(2000);
	   
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
	   
	    Thread.sleep(5000);
      
        driver.findElement(By.xpath("//div[@id='product-cell-170800AAGL2']//a[contains(text(),'Button Through Cropped Soft Shirt')]")).click();

        Thread.sleep(2000);
     
       ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(2000);
     
        driver.findElement(By.xpath("//button[normalize-space()='Size Chart']")).click();
     
        Thread.sleep(5000);
     
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//img[@alt='Size Guide for Button Through Cropped Soft Shirt']")).isDisplayed();       
		
		String sizeChat = driver.findElement(By.xpath("//h5[normalize-space()='Size Chart for Button Through Cropped Soft Shirt']")).getText();
		 
		String expSizeChat = "Size Chart for Button Through Cropped Soft Shirt";
		 
		Assert.assertEquals(sizeChat, expSizeChat);
      
        
     
     
	  }
	  
	  
	   
	  
	       
}
	       
	       
	       

		




