/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 * 
 * 
 *         =============================================>
 * 
 *         This Test is to verify Chcek Strore Stock
 * 
 *         Works as Expected
 * 
 * 
 *         ============================================>
 */

public class TC19_StoreLocatorTest extends BaseClass {

	@Test(priority = 33)

	public void verifyImagesOnStoreLocatorPage() throws InterruptedException {

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

	@Test(priority = 34)

	public void storeLocatorTest() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Store Locator']")).click();

		Thread.sleep(5000);

		WebElement searchStore = driver
				.findElement(By.xpath("//input[@placeholder='Enter either city, suburb or shopping mall']"));

		searchStore.sendKeys("Canal Walk");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Find a Store']")).click();

		Thread.sleep(10000);

		String foundStores = driver.findElement(By.xpath("//a[normalize-space()='Fabiani Women CANAL WALK MILNERTON']"))
				.getText();

		String expMessage = "FABIANI WOMEN CANAL WALK MILNERTON";

		Assert.assertEquals(foundStores, expMessage);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 19-Store-Locator-Test-Passed==========>");

	}

}
