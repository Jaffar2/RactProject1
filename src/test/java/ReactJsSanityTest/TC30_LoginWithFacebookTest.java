/**
 * 
 */
package ReactJsSanityTest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
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
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.basePackage.BaseClass;
import com.basePackage.BaseClass1;
import com.basePackage.BaseClass2;
import com.google.j2objc.annotations.ReflectionSupport.Level;

import groovyjarjarantlr.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
 


/**
 * @author jaffar
 * 
 * 
 * ===========================================>
 * 
 * This Test is to verify User can Login 
 * 
 * Via Google and its not Redirecting 
 * 
 * To My Profile
 * 
 * ===========================================>
 *  
 */



public class TC30_LoginWithFacebookTest extends BaseClass2 {

	
	 
	   @Test (priority=44)
	   
	   public void loginViaFacebookTest() throws InterruptedException {
		   

    	   
    	   String titleText = driver.findElement(By.xpath("//h1[normalize-space()='My Profile']")).getText();
    	   
    	   String expTitle = "Our best offers for you";
    	   
    	   Thread.sleep(5000);
    	   
    	   Reporter.log("=====Redirected to My Profile Instead of Home Page=====", true);
    	   
    	   Assert.assertEquals(titleText, expTitle);

    	   

    	   
    	   
        }
          
   
}
		




