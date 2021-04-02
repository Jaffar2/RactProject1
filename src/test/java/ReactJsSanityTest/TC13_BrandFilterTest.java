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
 * =====================================>
 * 
 * Verify the User Can
 * 
 * Filter Bands
 * 
 * Make sure Brand count is correct 
 * 
 * and Remove Filter works as expected
 * 
 * ======================================>
 *
 */
public class TC13_BrandFilterTest extends BaseClass {

		
	   
	   @Test 
	   
	   public void brandFilterTest() throws InterruptedException {
		   
		   
		   Thread.sleep(5000);
		   
		   JavascriptExecutor js = (driver);
		   
		   js.executeScript("window.scrollBy(1000,4000)");
		   
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
		   
		   driver.findElement(By.xpath("//label[normalize-space()='Brand']")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//div[@data-facet-value='Brand']//div//div[contains(text(),'Foschini')]")).click();
		   
		   Thread.sleep(5000);
		   
		   String count = driver.findElement(By.xpath("//div[@class='facet-perpage__count']")).getText();
			   
		   System.out.println("Items found" + count);
		   
		   String itemsCount = "274 items";
		   
		   Thread.sleep(5000);
		   
		   Assert.assertEquals(count, itemsCount);
		   
		   Thread.sleep(5000);
		   
		   WebElement filter = driver.findElement(By.xpath("//span[normalize-space()='Clear all filters']"));
		   if (filter.isDisplayed() && filter.isEnabled()) {
			   filter.click();
		       System.out.println("User can Remove the Filter Test Passed");
		   }
		   
		   else {
			   
			   System.out.println("Clear Filter is not available for the user Test Failed");
			   
		   }
		    
		   Thread.sleep(5000);
		   
	       String itemCount1 = driver.findElement(By.xpath("//div[normalize-space()='774 items']")).getText();
	       
	       String expectedCount = "774 items";
	       
	       Assert.assertEquals(itemCount1, expectedCount);
	       
	       if (itemCount1.equals("774 items")) {
			  
		       System.out.println("Working as Expected");
		   }
		   
	       else {
	    	   
	    	   System.out.println("Not Working as Expected");
	       }
	        
	    }
	       
	       
	       
}
		




