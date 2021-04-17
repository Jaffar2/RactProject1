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
 * Verify the User can Add Furniture Item to Bag
 * 
 * And Remove Item from Bag!
 * 
 * Make sure YOUR SHOPPING BAG IS EMPTY
 *
 */
public class TC10_FurnitureAddItemToBagTest extends BaseClass {

	
	
	   @Test (priority=13)
	
	   public void searchFurniture() throws InterruptedException, FindFailed {
		   
         
		      driver.findElement(By.xpath("//i[@class='header__inner-control-search']")).click();
		      
		      Thread.sleep(5000);
	  		  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  WebElement searchText = driver.findElement(By.xpath("//div[contains(@class,'desktop-header-search header__search header__search--mobile')]//input[@id='search-type-ahead-field']"));
		
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  searchText.sendKeys("FURNITURE");
			  
			  Thread.sleep(6000);
		      
		      try{
		    	  driver.findElements(By.xpath("//a[normalize-space()='carin chair velvet']"));
		    	 
		    	  System.out.println("Element present Test Passed");
		    	 }
		    	 catch(NoSuchElementException e){
		    	
		    	  System.out.println("Element not present Search is not working as expected Test Failed");
		    	 }
		    

}
		      

	   
	   @Test (priority=14)
	   
	   public void addItemToBag() throws InterruptedException {
		   
		   
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
		   
		   Actions action = new Actions(driver);
		   
		   action.sendKeys(Keys.PAGE_DOWN).build().perform();
				   
		   Thread.sleep(5000);
		           
		   driver.findElement(By.xpath("//div[12]//div[1]//div[1]//h3[1]")).click();
		   
		   Thread.sleep(5000);
					 
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     
	        try {
	            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
		   	   
	 
	        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
	        
	        jse2.executeScript("window.scrollBy(0,200)");
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//button[normalize-space()='REMOVE']")).click();
	        
	        String shoppingBag = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']")).getText();
	       
	        Thread.sleep(5000);
	       
	        System.out.println("After removing an item bag is :" + shoppingBag );
		   
	        Thread.sleep(5000);
	        
	        System.out.println("=============>Test Case 10-Furniture-AddItem-To-Bag-Test-Passed==========>");
	        
	        
	        
	        
	       
	       
	    }
	       
	       
	       
}
		




