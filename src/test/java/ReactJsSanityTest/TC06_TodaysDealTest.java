/**
 * 
 */
package ReactJsSanityTest;

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
 * ======================================================>
 * 
 * This Test is to verify Today's deal Feature
 * 
 * And Show All 15 images , 30 , 45 , All images
 * 
 * Then Price High to Low , Low to High updating
 * 
 * As Expected.
 * 
 * ======================================================>
 */

public class TC06_TodaysDealTest extends BaseClass {

	@Test(priority = 9)

	public void verifyImagesOnTodaysDealPage() throws InterruptedException {

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

	@Test(priority = 10)

	public void todaysDeal() throws InterruptedException {

		Thread.sleep(5000);

		WebElement i = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"));

		Thread.sleep(5000);

		Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		if (p) {
			System.out.println("Logo present Test Passed");
		} else {
			System.out.println("Logo not present Test Failed");
		}
	}

}
