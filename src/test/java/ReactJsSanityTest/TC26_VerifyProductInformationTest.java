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
 * ==============================================>
 * 
 * This Test is to Verify
 * 
 * Product information is displayed correctly
 * 
 * on PDP
 * 
 * ==============================================>
 *
 */


public class TC26_VerifyProductInformationTest extends BaseClass {

		
	
	  @Test (priority=35)
	  
	  public void productInformationTest() throws InterruptedException {
		  	  
	  
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
      
        driver.findElement(By.xpath("//div[@id='product-cell-024600AAAA0']//a[contains(text(),'RJ SHORT SLEEVE DENIM SHIRT')]")).click();

        Thread.sleep(5000);
     
       ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(4000);
     
        driver.findElement(By.xpath("//button[normalize-space()='Product Information']")).click();
     
        Thread.sleep(4000);
     
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
     
        Thread.sleep(4000);
     
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]")).isDisplayed();
	  
        Thread.sleep(5000);
      
        String productInfo = driver.findElement(By.xpath("//th[normalize-space()='MODEL SIZE & MEASUREMENTS']")).getText();
     
        Thread.sleep(5000);
        
        String expMsg = "MODEL SIZE & MEASUREMENTS";
        
        Thread.sleep(5000);
        
        Assert.assertEquals(productInfo, expMsg);       
        
     
     
	  }
	  
	  
	       
	       
	       
}
		




