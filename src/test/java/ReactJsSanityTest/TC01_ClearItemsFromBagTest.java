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
 * =====================================>
 * 
 * Verify the User Can
 * 
 * Remove Item from Bag!
 * 
 * Make sure YOUR SHOPPING BAG IS EMPTY
 * 
 * ======================================>
 *
 */
public class TC01_ClearItemsFromBagTest extends BaseClass {

		
	   
	   @Test 
	   
	   public void clearItemsFromBag() throws InterruptedException {
		   
		   

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
	       
	       
	       
}
		




