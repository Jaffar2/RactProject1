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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.basePackage.BaseClass1;

/**
 * @author jaffar
 * 
 *
 * 
 * 
 *         ==========================================>
 * 
 *         Verify Guest User collect
 * 
 *         Furniture Item from Store
 * 
 *         Complete E2E Process
 * 
 * 
 *         =============================================>
 */

public class TC37_FurnitureCollectFromStoreGuestCheckOutTest extends BaseClass1 {

	@Test(priority = 68)

	public void verifyFurnitureImagesOnPage() throws InterruptedException {

		WebElement ImageFile = driver.findElement(By.xpath("//img[@alt='test alt']"));

		Thread.sleep(5000);

		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);

		if (!ImagePresent) {
			System.out.println("Image not Loaded and displayed.");
		} else {
			System.out.println("Image Loaded and displayed.");
		}

	}

	@Test(priority = 69)

	public void furnitureCollectFromStoreTest() throws InterruptedException {

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

		driver.findElement(By.xpath("//a[normalize-space()='bellevue standing mirror']")).click();

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

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='continue without logging in']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='I Understand']")).click();

		Thread.sleep(5000);

		JavascriptExecutor js8 = (driver);

		js8.executeScript("window.scrollBy(0,200)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[contains(text(),'Collect')]")).click();

		Thread.sleep(5000);

		JavascriptExecutor js9 = (JavascriptExecutor) driver;

		js9.executeScript("window.scrollBy(0,200)");

		Thread.sleep(5000);

		WebElement selectMyElement = driver.findElement(By.cssSelector(
				"div[class='jsx-1739976969 form__select nosui-form-select-full undefined form__select-furniture-store-id'] div[class='jsx-1739976969 nosui-form-select__dropdown-button drop-down-control']"));

		selectMyElement.click();

		Thread.sleep(5000);

		driver.findElement(By.id("collect-in-store-guest-first-name")).sendKeys("Jaffe");

		driver.findElement(By.id("collect-in-store-guest-last-name")).sendKeys("Shaike");

		driver.findElement(By.id("collect-in-store-guest-email")).sendKeys("jaffar.shaik706@gmail.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[normalize-space()='@home PAROW CAPE TOWN DC']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(4000);

		JavascriptExecutor js11 = (JavascriptExecutor) driver;

		js11.executeScript("window.scrollBy(0,200)");

		try {
			FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@id='checkout__delivery-collect__number']")).sendKeys("843716928");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(15000);

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[normalize-space()='Card']//input[@name='pay_meth']")).click();

		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"0_cardNumber\"]")).sendKeys("4000015372250142");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"0_nameOnCard\"]")).sendKeys("JH SHAIKH");

		Thread.sleep(5000);

		Select expiryDate = new Select(driver.findElement(By.xpath("//*[@id=\"0_expMonth\"]")));

		expiryDate.selectByIndex(2);

		Thread.sleep(5000);

		Select expYear = new Select(driver.findElement(By.xpath("//*[@id=\"0_expYear\"]")));

		expYear.selectByIndex(5);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"0_cvv\"]")).sendKeys("123");

		Thread.sleep(5000);

		driver.findElement(By.id("btnPay")).click();

		Thread.sleep(15000);

		// Assert.assertEquals("https://mytfg.tfgtst.co.za/","https://mytfgworld.uat.tfgapps.co.za/",
		// "Redirecting to wrong url Test Failed");

		System.out.println("After Successful Transaction Redirecting to : https://mytfg.tfgtst.co.za/");

	}

}
