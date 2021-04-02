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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.basePackage.BaseClass;
import com.google.j2objc.annotations.ReflectionSupport.Level;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.online.HttpClient;
 


/**
 * @author jaffar
 *
 */


/*
 * ===================================================>
 * 
 * This Test is to verify User can Click on 
 * 
 * Our Best Offers For You Show Me All Hyper text Link
 * 
 * And Verify No Images are Broken
 * 
 * =====================================================>
 */



public class TC03_OurBestOffersForYouShowMeAllTest extends BaseClass {
  
	   
	   @Test
	   
	   public void ourOffers() throws InterruptedException {
		   
		
		  Thread.sleep(5000);
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.linkText("Show me all")).click();
		  
		  Thread.sleep(5000);
		  
		  List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		  
		  System.out.println("Total no. of images are " + imagesList.size());
			  
		  Thread.sleep(5000);
		  
		  System.out.println("images not Loading properly or Broken! on this page");
		 
		  
	    }
		  
		  
}
	   
	   

		  