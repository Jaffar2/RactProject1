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
import org.testng.Assert;
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
 *         Verify Logged in Place Order
 * 
 *         for TV
 * 
 *         Complete E2E Process
 * 
 * 
 *         ================================>
 */

public class TC41_LoggedInUserPlaceOrderForTVTest extends BaseClass {

	@Test(priority = 75)

	public void verifyImagesOnTvPage() throws InterruptedException {

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

	@Test(priority = 76)

	public void placeOrderForTvTest() throws InterruptedException {

		JavascriptExecutor js = (driver);

		js.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='TECH & ELECTRONICS']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='tv']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//a[normalize-space()='Samsung 49 inch UHD 4K Smart TV']")).click();

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

		Thread.sleep(8000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[contains(text(),'Enter address')]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Enter a location']")).sendKeys("302 Fern Avenue");

		Thread.sleep(5000);

		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Enter a location']"));

		Actions ac = new Actions(driver);

		ac.moveToElement(address).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[normalize-space()='302 Fern Avenue, Ferndale, Randburg, South Africa']"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.id("shipping-address__firstname")).sendKeys("Jaffe");

		driver.findElement(By.id("shipping-address__lastname")).sendKeys("Shaikie");

		driver.findElement(By.id("shipping-address__number")).sendKeys("843716928");

		driver.findElement(By.id("shipping-address__company-building")).sendKeys("TFG");

		Thread.sleep(5000);

		WebElement region = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[7]/div[1]/section[1]/div[1]/div[1]/fieldset[5]/div[2]"));

		Actions ac1 = new Actions(driver);

		ac1.moveToElement(region).build().perform();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[normalize-space()='Eastern Cape']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//textarea[@name='message_for_courier']")).sendKeys("Jaffar's Test");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(7000);

		try {

			driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

			String expMsg = driver
					.findElement(By.xpath("//div[normalize-space()='The city is missing in the shipping address']"))
					.getText();

			System.out.println("error message is :" + expMsg);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}

		Thread.sleep(8000);

		String actualMessage = driver.findElement(By.xpath("//strong[normalize-space()='Thank You,']")).getText();

		String expMsg = "PayU";

		System.out.println("PayU is down?");

		Assert.assertEquals(actualMessage, expMsg);

	}

}
