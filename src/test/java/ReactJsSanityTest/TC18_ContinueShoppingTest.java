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
 * Verify the User Can Add Item to Bag
 * 
 * And Remove Kids Item from Bag!
 * 
 * Make sure YOUR SHOPPING BAG IS EMPTY
 * 
 * Then verify after Item removed 
 * 
 * Continue Shopping Option is visible 
 * 
 * Under Bag Updates
 * 
 * ======================================>
 *
 */
public class TC18_ContinueShoppingTest extends BaseClass {

		
	
	  @Test (priority=24)
	  
	  public void viewBagKidsTest() throws InterruptedException {
		  
		  
	  
	   Thread.sleep(5000);
	   
	   JavascriptExecutor js11 = (driver);
	   
	   js11.executeScript("window.scrollBy(1000,4000)");
	   
	   Thread.sleep(5000);
			 
	   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
	   
	   Actions actions = new Actions(driver);
		
	   actions.moveToElement(menuList).build().perform();
	   
	   Thread.sleep(5000);
	   
	   WebElement home = driver.findElement(By.xpath("//a[contains(text(),'KIDS')]"));
	   
	   Actions actions1 = new Actions(driver);
		
	   actions.moveToElement(home).build().perform();
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//ul[@data-name='KIDS']//li[@class='level-2-container level-2-container-1']//a[contains(text(),'tops')]")).click();
	   
	   Thread.sleep(2000);
	   
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
	   
	    Thread.sleep(5000);
      
        driver.findElement(By.xpath("//a[normalize-space()='Boys Striped T-Shirt']")).click();

        Thread.sleep(2000);
     
       ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(2000);
     
        driver.findElement(By.xpath("//a[normalize-space()='5-6 years']")).click();
     
        Thread.sleep(1000);
     
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(2000);
     
        driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();
	  
        Thread.sleep(2000);
      
        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();
     
        Thread.sleep(2000);
     
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(2000);
        
        String product = driver.findElement(By.xpath("//a[contains(text(),'Boys Striped T-Shirt')]")).getText();
        
        String expectedProduct = "BOYS STRIPED T-SHIRT";
        
        Assert.assertEquals(product, expectedProduct);
        
        
     
     
	  }
	  
	  
	   
	   @Test (priority=25)
	   
	   public void clearKidsItemsFromBag() throws InterruptedException {
		   
		   

        Thread.sleep(6000);

        driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

        Thread.sleep(5000);

        String shoppingBag1 = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']")).getText();
	       
        Thread.sleep(5000);
	       
        System.out.println("After removing an item bag is :" + shoppingBag1 );
        
        
        
	       
	    }
	       
	   
	   @Test (priority=26)
	   
	   public void continueShopping() throws InterruptedException {
		   
		   
		   
	        Thread.sleep(6000);

	        driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

	        Thread.sleep(5000);
	        
	        String message1 =  driver.findElement(By.xpath("//a[normalize-space()='Continue Shopping']")).getText();
		   
		    String expectedMessage = "CONTINUE SHOPPING";
		    
		    Assert.assertEquals(message1, expectedMessage);
		    
		    Thread.sleep(5000);
		   
		    System.out.println("=============>Test Case 18-Continue-Shopping-Test-Passed==========>");
	          
		   
		   
		   
	   }
	       
}
		




