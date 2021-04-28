/**
 * 
 */
package com.basePackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author jaffar
 *
 */
public class BaseClass1 {

	public ChromeDriver driver;

	public Integer counter = 0;

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("auth.crx"));

		driver = new ChromeDriver(options);

		Reporter.log("=====Browser Session Started=====", true);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("chrome-extension://enhldmjbphoeibbpdhmjkchohnidgnah/options.html");

		driver.findElement(By.id("url")).sendKeys("https://mytfgworld.uat.tfgapps.co.za/");

		driver.findElement(By.id("username")).sendKeys("tfg-uat");

		driver.findElement(By.id("password")).sendKeys("TFGReact2021");

		driver.findElement(By.xpath("//button[.='Add']")).click();

		driver.get("https://mytfgworld.uat.tfgapps.co.za/");

		Thread.sleep(5000);

		// driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		Reporter.log("=====Application Started=====", true);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//i[@class='icon icon-cross']")).click();

		Thread.sleep(6000);

	}

	@AfterMethod
	public void tearDown() {

		if (driver != null)

			driver.quit();

		Reporter.log("=====Browser Session End=====", true);

	}
}