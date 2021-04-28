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

import com.basePackage.BaseClass;

/**
 * @author jaffar
 * 
 * 
 *         =====================================>
 * 
 *         Verify the User Can
 * 
 *         Filter Bands
 * 
 *         Make sure Brand count is correct
 * 
 *         and Remove Filter works as expected
 * 
 *         ======================================>
 *
 */
public class TC14_BrandFilterTest extends BaseClass {

	@Test(priority = 25)

	public void verifyImagesOnBrandFilterPage() throws InterruptedException {

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

	@Test(priority = 26)

	public void brandFilterTest() throws InterruptedException {

		JavascriptExecutor js = (driver);

		js.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//label[@for='sub-sub-nav-nav-level-1-0-8-/plp/women/tops/_/N-l6ev2b']//a[contains(text(),'TOPS')]"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[normalize-space()='Brand']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-facet-value='Brand']//div//div[contains(text(),'Foschini')]")).click();

		Thread.sleep(5000);

		String count = driver.findElement(By.xpath("//div[@class='facet-perpage__count']")).getText();

		System.out.println("Items found" + count);

		String itemsCount = "274 items";

		Thread.sleep(5000);

		Assert.assertEquals(count, itemsCount);

		Thread.sleep(5000);

		WebElement filter = driver.findElement(By.xpath("//span[normalize-space()='Clear all filters']"));
		if (filter.isDisplayed() && filter.isEnabled()) {
			filter.click();
			System.out.println("User can Remove the Filter Test Passed");
		}

		else {

			System.out.println("Clear Filter is not available for the user Test Failed");

		}

		Thread.sleep(5000);

		String itemCount1 = driver.findElement(By.xpath("//div[normalize-space()='774 items']")).getText();

		String expectedCount = "774 items";

		Assert.assertEquals(itemCount1, expectedCount);

		if (itemCount1.equals("774 items")) {

			// System.out.println("Working as Expected");

			System.out.println("=============>Test Case 14-Brand-Filter-Test-Passed==========>");
		}

		else {

			System.out.println("Not Working as Expected");
		}

	}

}
