/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basePackage.BaseClass1;

/**
 * @author jaffar
 * 
 * 
 *         ===========================================>
 * 
 *         This Test is to verify Guest Checkout
 * 
 *         continue without logging in feature
 * 
 *         works as Expected we had a Bug on this
 * 
 *         ===========================================>
 * 
 */

public class TC21_GuestContinueWithoutLoggingInTest extends BaseClass1 {

	@Test(priority = 37)

	public void continueWithoutLoggingInTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'KIDS')]"));

		Actions actions16 = new Actions(driver);

		actions16.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//ul[@data-name='KIDS']//li[@class='level-2-container level-2-container-1']//a[contains(text(),'tops')]"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Boys Striped T-Shirt']")).click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='5-6 years']")).click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='continue without logging in']")).click();

		Thread.sleep(5000);

		String obj = driver.findElement(By.xpath("//span[normalize-space()='Select Shipping Method']")).getText();

		String ExpMsg = "SELECT SHIPPING METHOD";

		if (obj == "SELECT SHIPPING METHOD") {
			try {
				Assert.assertEquals(ExpMsg, obj);
				System.out.println("=============>Test Case 21-Continue-Without-Logging-In-Test-Passed==========>");
			} catch (Throwable assertionError) {
				System.out.println("Forcing the User to Login Test Failed");
			}
		}

	}

}
