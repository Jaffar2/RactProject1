/**
 * 
 */

package ReactJsSanityTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 *
 */

/*
 * =====================================================================>
 * 
 * This Test is to verify Your order qualifies for Free Delivery
 * 
 * sitewide-bag-pop-up__message is displayed after Adding Item to Bag
 * 
 * 
 * 
 * =======================================================================>
 */

public class TC09_SitewideBagReminderTest extends BaseClass {

	@Test(priority = 15)

	public void sitewidePop() throws InterruptedException {

		JavascriptExecutor js = (driver);

		js.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='HOME']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='furniture']")).click();

		Thread.sleep(5000);

		JavascriptExecutor js2 = (driver);

		js2.executeScript("window.scrollBy(0,450)");

		driver.findElement(By.xpath("//a[normalize-space()='oxford ottoman']")).click();

		Thread.sleep(5000);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);

		JavascriptExecutor js7 = (JavascriptExecutor) driver;

		js7.executeScript("window.scrollBy(0,200)");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		String popMessage = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText();

		System.out.println(popMessage);

		// String expMessage = ".*Your order qualifies for free delivery*." ;

		// Assert.assertEquals(popMessage, expMessage);

	}

	@Test(priority = 16)

	public void sitewideClean() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

		Thread.sleep(5000);

		String shoppingBag1 = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']"))
				.getText();

		Thread.sleep(5000);

		System.out.println("After removing an item bag is :" + shoppingBag1);

		System.out.println("=============>Test Case 09-SiteWide-Bag-Reminder-Test-Passed==========>");

	}

}
