/**
 * 
 */
package ReactJsSanityTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 *
 */

/*
 * ===================================================>
 * 
 * This Test is to verify User can Click on
 * 
 * Our Best Offers For You Show Me All Hyper text Link
 * 
 * And Verify No Images are Broken
 * 
 * =====================================================>
 */

public class TC04_OurBestOffersForYouShowMeAllTest extends BaseClass {

	@Test(priority = 6)

	public void verifyImagesOnHomePageTest() throws InterruptedException {

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

	@Test(priority = 7)

	public void ourOffers() throws InterruptedException {

		// Assert.fail("This Page is under development");

		driver.findElement(By.linkText("Show me all")).click();

		Thread.sleep(5000);

		List<WebElement> imagesList = driver.findElements(By.tagName("img"));

		System.out.println("Total no. of images are " + imagesList.size());

		Thread.sleep(5000);

		System.out.println("=============>Test Case 04-OurBestOffers-Test-Passed==========>");

	}

}
