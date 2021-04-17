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
 * This Test is to verify User Can update Qty in my Shopping Bag
 * 
 * Scenario 1) Click on Update without changing the QTY
 * 
 * Expected = Please change the quantity and try again (Verify This ToolTip message)
 * 
 *  Scenario 2) Change the QTY From 1 to 3 Click on Update 
 *  
 * Expected = Quantity updated successfully (Verify This ToolTip message)
 * 
 *  Scenario 3) Change the QTY From 3 to 1 Back and Click on Update 
 *  
 * Expected = Quantity updated successfully (Verify This ToolTip message)
 * 
 * 
 * =======================================================================>
 */



public class TC11_UpdateQtyTest extends BaseClass {

	   
	   
	   @Test (priority=15)
	   
	   public void updateQtyTest() throws InterruptedException {
		  		 
		   
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
           
           Thread.sleep(5000);
           
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
			
		/*
		 * Good Test to check keep Qyt as is and Just Click on Update Please change the
		 * quantity and try again should be expected
		 * 
		 * =========================================>
		 */
            		 
	        driver.findElement(By.cssSelector("button[name='update-qty']")).click();
	        
	        String toolTipText1 = driver.findElement(By.xpath("//div[@class='toaster-notification-widget alert-danger visible']")).getText();
	        
	        System.out.println(toolTipText1);
	        
	        String expectedText1 = "Please change the quantity and try again";
	        
	        Assert.assertEquals(toolTipText1, expectedText1);
	        
	        Thread.sleep(5000);
	        
	    	/*
			 * Good Test to check Clear the existing Qyt 1
			 * and type the new QTY 3 Click on Update 
			 * Quantity updated successfully. should be expected
			 * 
			 * =========================================>
			 */
	        
	        driver.findElement(By.xpath("//*[contains(@class,'product')]")).clear();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[contains(@class,'product')]")).sendKeys("3");
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.cssSelector("button[name='update-qty']")).click();
	        
            String toolTipText2 = driver.findElement(By.xpath("//div[@class='toaster-notification-widget alert-success visible']")).getText();
	        
	        System.out.println(toolTipText2);
	        
            String expectedText2 = "Quantity updated successfully.";
	        
	        Assert.assertEquals(toolTipText2, expectedText2);
	        
	        Thread.sleep(5000);
	        
	     	/*
			 * Good Test to check Clear the existing Qyt 3
			 * and type the new QTY 1 Click on Update 
			 * Quantity updated successfully. should be expected
			 * 
			 * =========================================>
			 */
	        
            driver.findElement(By.xpath("//*[contains(@class,'product')]")).clear();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[contains(@class,'product')]")).sendKeys("1");
	        
	        Thread.sleep(5000);
	        
            driver.findElement(By.cssSelector("button[name='update-qty']")).click();
	        
            String toolTipText3 = driver.findElement(By.xpath("//div[@class='toaster-notification-widget alert-success visible']")).getText();
	        
	        System.out.println(toolTipText3);
	        
            String expectedText3 = "Quantity updated successfully.";
	        
	        Assert.assertEquals(toolTipText3, expectedText3);
	        
	        Thread.sleep(5000);
	        
	        System.out.println("=============>Test Case 11-Update-QTY-Test-Passed==========>");
	        
	      
	   }      
         
	   @Test (priority=16)
	   
	   public void verifyQty() throws InterruptedException {
		   
		   
		   Thread.sleep(5000);

	        driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

	        Thread.sleep(5000);

	        driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

	        Thread.sleep(5000);

	        String shoppingBag1 = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']")).getText();
		       
	        Thread.sleep(5000);
		       
	        System.out.println("After removing an item bag is :" + shoppingBag1 );
	        
	        Thread.sleep(5000);
		   
		   
	   }
	   
		   
}
	   
	   




