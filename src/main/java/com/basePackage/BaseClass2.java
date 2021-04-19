/**
 * 
 */
package com.basePackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author jaffar
 *
 */
public class BaseClass2 {
	
   public ChromeDriver  driver;
   
   public Integer counter=0;
  
      
	   
	   
  @BeforeMethod
  
  public void beforeMethod() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
		 
	  ChromeOptions options = new ChromeOptions();
	 
	  options.addExtensions(new File("auth.crx"));
	 
	  driver = new ChromeDriver(options);
	 
      JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	  driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/options.html");

	  driver.findElement(By.id("url")).sendKeys("https://mytfgworld.uat.tfgapps.co.za/");

	  driver.findElement(By.id("username")).sendKeys("tfg-uat");
 
      driver.findElement(By.id("password")).sendKeys("TFGReact2021");

      driver.findElement(By.xpath("//button[.='Add']")).click();

	  driver.get("https://mytfgworld.uat.tfgapps.co.za/");

	  Thread.sleep(10000);
	  
	  driver.manage().deleteAllCookies();
	  
	  Thread.sleep(5000);
	 
	  Reporter.log("=====Application Started=====", true);
	 
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath("//i[@class='icon icon-cross']")).click();
	
	  Thread.sleep(5000);
	  
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//span[normalize-space()='Login & Register']")).click();
	    
	   Thread.sleep(5000);
	   
	   String parentHandle = driver.getWindowHandle();
	   
	   Thread.sleep(2000);
	   
	   System.out.println("parentwindow -" +  parentHandle);
	   
	   driver.findElement(By.xpath("//button[normalize-space()='Log in with Facebook']")).click();	  
	   
	   Thread.sleep(5000);
	   
	   Set<String> handles = driver.getWindowHandles();
	   
	   for (String handle : handles) {
		   
		   System.out.println(handle);
		   
		   if (!handle.equals(parentHandle)) {
			   
		   driver.switchTo().window(handle);
			   
		   driver.findElement(By.id("email")).sendKeys("jaffar.shaik706@gmail.com");
		   
		   Thread.sleep(5000);
		   
		   driver.findElement(By.name("pass")).sendKeys("XXXtest123");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.name("login")).click();
		   
		   Thread.sleep(15000);
		   
	   }

		   
		   
		   
}
	   
	   driver.switchTo().window(parentHandle);
	

	  
	  
 }
  
 
  @AfterMethod 
  public void cleanup(){
		   
	  driver.quit();
	  
	  Reporter.log("=====Browser Session End=====", true);
	    
	}	  
}