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
 * ================================================>
 * 
 * This Test is to verify Installment Calculator 
 * 
 * Functionality Works as Expected 
 *  
 *  ===============================================>
 */


public class TC17_InstallmentCalcTest extends BaseClass {

	
	
	 
       @Test 
	   
	   public void quickView() throws InterruptedException {
		   
    	   
           Thread.sleep(5000);
		   
		   JavascriptExecutor js11 = (driver);
		   
		   js11.executeScript("window.scrollBy(1000,4000)");
		   
		   Thread.sleep(5000);
				 
		   WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));
		   
		   Actions actions = new Actions(driver);
			
		   actions.moveToElement(menuList).build().perform();
		   
		   Thread.sleep(5000);
		   
		   WebElement home = driver.findElement(By.xpath("//label[contains(@for,'sub-nav-/rclp/men/_/N-zljxmi')]//a[normalize-space()='MEN']"));
		   
		   Actions actions1 = new Actions(driver);
			
		   actions1.moveToElement(home).build().perform();
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//label[contains(@for,'sub-sub-nav-nav-level-1-0-10-/plp/men/tops/_/N-1aaf4mt')]//a[contains(text(),'TOPS')]")).click();
		   
		   Thread.sleep(2000);
		   
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//a[normalize-space()='RJ URBAN VINTAGE DRIP GRAPHIC ECRU']")).click();
		   
		   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//span[contains(@class,'product-detail__installment-calculator desktop-only product-detail__installment-calculator-link')]")).click();
          
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//div[@class='modal-body']//div[2]//label[1]//div[1]")).click();
		   
		   String monthlyPayment = driver.findElement(By.xpath("//strong[normalize-space()='R 10.98']")).getText();
		   
		   String expPayment = "R 10.98";
		   
		   Assert.assertEquals(monthlyPayment, expPayment);
	          
		   Thread.sleep(5000);
		   
	       driver.findElement(By.xpath("//div[contains(@role,'dialog')]//div[3]//label[1]")).click();
		   
	       Thread.sleep(5000);
	       
		   String monthlyPayment1 = driver.findElement(By.xpath("//strong[normalize-space()='R 5.97']")).getText();
		   
		   String expPayment1 = "R 5.97";
		   
		   Assert.assertEquals(monthlyPayment1, expPayment1);
		   
		   driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		   
		   Thread.sleep(5000);
		   
		   
		   
	   }
		
}



