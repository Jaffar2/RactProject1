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
 * This Test is to verify Add Item to WishList
 * 
 * Works as Expected 
 *  
 * On PDP user can Click on Add item to WishList
 *  
 *  And Click on Remove from WishList on PDP
 *  
 *  ============================================>
 */


public class TC28_MyAccountVerifyWishListTest extends BaseClass {

	
	
	 
	   @Test (priority=39)
	   
	   public void verifyWishListTest() throws InterruptedException {
		   
		   
		   
		   Thread.sleep(5000);
		   
		   JavascriptExecutor js11 = (driver);
		   
		   js11.executeScript("window.scrollBy(1000,4000)");
		   
		   Thread.sleep(5000);
				 
		   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
		   
		   Actions actions = new Actions(driver);
			
		   actions.moveToElement(menuList).build().perform();
		   
		   Thread.sleep(5000);
		   
		   WebElement home = driver.findElement(By.xpath("//a[@href='/rclp/men/_/N-zljxmi']"));
		   
		   Actions actions1 = new Actions(driver);
			
		   actions.moveToElement(home).build().perform();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//a[normalize-space()='denim shirts']")).click();
		   
		   Thread.sleep(5000);
		   
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		   
		   Thread.sleep(5000);
	      
	       driver.findElement(By.xpath("//a[normalize-space()=\"LEVI'S BARSTOW DENIM SHIRT\"]")).click();

	       Thread.sleep(5000);
	     
	       ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
	            
	       Thread.sleep(5000);
	       
	       driver.findElement(By.xpath("//a[normalize-space()='S']")).click();
	       
	       Thread.sleep(5000);
          
           driver.findElement(By.id("add-item-to-wishlist")).click();
          
           Thread.sleep(6000);                   
           
          
}
	   
       
	   @Test (priority=40)
	   
	   public void removeItemFromWishListTest() throws InterruptedException {
		   
		   
		   Thread.sleep(5000);
		   
		   JavascriptExecutor j = (driver);
			 
		   j.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		 
		   Thread.sleep(10000);
		   		   
		   driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[4]/span[1]")).click();
	   
		   Thread.sleep(5000);
		   
		   // Verify the Correct Item added to wishList
		   
		   String wishListItem = driver.findElement(By.xpath("//a[normalize-space()=\"LEVI'S BARSTOW DENIM SHIRT\"]")).getText();
		   
		   String expItem = "LEVI'S BARSTOW DENIM SHIRT";
		   
		   Assert.assertEquals(wishListItem, expItem);
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
		   
		   Thread.sleep(5000);
		   
		   String wishListMsg = driver.findElement(By.xpath("//p[normalize-space()='There are no items in your wishlist']")).getText();
		   
		   System.out.println("After Removing the Item from WishList message is :" + wishListMsg);
		   
		   
		   
      }


}

