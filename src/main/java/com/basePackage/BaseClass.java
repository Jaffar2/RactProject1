/**
 * 
 */
package com.basePackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
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
public class BaseClass {
	
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
	 
	  System.out.println("=====================> Browser Launched");
	 
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath("//i[@class='icon icon-cross']")).click();
	
	  Thread.sleep(5000);
	
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
      driver.findElement(By.xpath("//span[normalize-space()='Login & Register']")).click();
	  		  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Log in with your online profile']")).click();

	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  driver.findElement(By.name("username")).sendKeys("tfguat2@gmail.com");
	
	  driver.findElement(By.name("password")).sendKeys("password");
	
	  driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	
	  Thread.sleep(5000);
	
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  
	  
 }
  
 
  @AfterMethod 
  public void cleanup(){
		   
	 driver.quit();
	    
	}	  
}