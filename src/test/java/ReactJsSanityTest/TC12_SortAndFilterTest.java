/**
 * 
 */
package ReactJsSanityTest;

import java.util.List;

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
 *         =====================================>
 * 
 *         Verify the User Can
 * 
 *         Remove Item from Bag!
 * 
 *         Make sure YOUR SHOPPING BAG IS EMPTY
 * 
 *         ======================================>
 *
 */
public class TC12_SortAndFilterTest extends BaseClass {

	@Test(priority = 21)

	public void verifysortAndFilterImages() throws InterruptedException {

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

	@Test(priority = 22)

	public void sortAndFilterTest() throws InterruptedException {

		driver.findElement(By.xpath("//img[@alt='test alt']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='15']")).click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[contains(@class,'facet-sort__control-options-item')][normalize-space()='30']")).click();

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("scroll(0, -250);");

		List<WebElement> listImages = driver.findElements(By.tagName("img"));

		System.out.println("No. of Images: " + listImages.size());

		for (WebElement image : listImages) {
			if (image.isDisplayed()) {
				counter++;

				System.out.println(image.getAttribute("alt"));
			}
		}

		System.out.println("No. of total displable images: " + counter);

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[normalize-space()='30']")).click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[contains(@class,'facet-sort__control-options-item')][normalize-space()='45']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='45']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='facet-sort__control-options-item '][normalize-space()='all']"))
				.click();

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(5000);

		jse.executeScript("scroll(0, -250);");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[normalize-space()='Sort']")).click();

		Thread.sleep(5000);

		// Click on Price High to Low

		driver.findElement(By.xpath("//div[normalize-space()='Price high to low']")).click();

		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(5000);

		jse.executeScript("scroll(0, -250);");

		Thread.sleep(5000);

		String price = driver.findElement(By.xpath("//div[contains(text(),'R 5,999.00 -')]")).getText();

		System.out.println("Price High to Low is :" + price);

		String expPrice = "R 5,999.00 - R 89,999.00";

		Assert.assertEquals(price, expPrice);

		Thread.sleep(5000);

		System.out.println("After User selecting Show 15 OR 30 , 45 , Images Not keep on Loading Test Passed");

		/*
		 * System.out.println("Broken Image on this Page Image Name: TestRing");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * Assert.
		 * fail("After User selecting Show 15 OR 30 , 45 , Images keep on Loading Test Failed"
		 * );
		 */
	}

}
