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
 * ============================================>
 * 
 * This Test is to verify Search Functionality 
 * 
 * Working as Expected!
 * 
 * ============================================>
 */



public class TC08_SearchTest extends BaseClass {

	   
	   
	  @Test (priority=10)
	   
	   public void searchUat() throws InterruptedException {
		  		 
		   
		  Thread.sleep(5000);
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      driver.findElement(By.xpath("//i[@class='header__inner-control-search']")).click();
		  		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement searchText = driver.findElement(By.xpath("//div[contains(@class,'desktop-header-search header__search header__search--mobile')]//input[@id='search-type-ahead-field']"));
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  searchText.sendKeys("Rugby");
		  
		  Thread.sleep(5000);
		  
		  searchText.sendKeys(Keys.ENTER);
		  
		  Thread.sleep(10000);
		  
		  String whatProduct = driver.findElement(By.xpath("//div[@id='products-column']//div//div//div//div//div//a[contains(text(),'Junior adidas All Blacks Rugby World Cup Home Jers')]")).getText();
		  
		  Thread.sleep(5000);
		  
		  System.out.println("Product image is :" + whatProduct);
		  
		  Thread.sleep(5000);
		  
		  //System.out.println("Search Text displayed in white color Test Step Passed");
		  
		  System.out.println("=============>Test Case 08-Search-With-ProductName-Test-Passed==========>");
	    
		  System.out.println("Search with Product ID and SKU JIRA Ticket is Logged");
	      
		  
	    }
		   
}
	   
	   




