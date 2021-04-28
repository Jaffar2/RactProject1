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
 *
 * 
 * 
 *         ==================================>
 * 
 *         Verify Logged in User collect
 * 
 *         Furniture Item from Store
 * 
 *         Complete E2E Process
 * 
 * 
 *         ================================>
 */

public class TC07_FurnitureCollectFromStoreLoggedInUserCheckOutTest extends BaseClass {

	@Test(priority = 11)

	public void verifyImagesOnFurniturePage() throws InterruptedException {

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

	@Test(priority = 12)

	public void checkOutFlow() throws InterruptedException {

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

		Thread.sleep(10000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

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

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[normalize-space()='@home PAROW CAPE TOWN DC']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/fieldset[3]/div[1]/button[1]"))
				.click();

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

		driver.findElement(By.xpath("//input[@id='paymentMethodsCREDITCARD_TOKEN0.cvv']")).sendKeys("123");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='tokenSubmit']")).click();

		Thread.sleep(15000);

		System.out.println("After Successful Transaction Redirecting to : https://mytfg.tfgtst.co.za/");

	}

}
