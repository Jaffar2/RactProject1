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
 */

/*
 * =====================================>
 * 
 * This Test is to verify My Profile
 * 
 * Functionality works as expected
 * 
 * ====================================>
 */

public class TC32_MyProfileTest extends BaseClass {

	@Test(priority = 58)

	public void verifyImagesOnPage() throws InterruptedException {

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

	@Test(priority = 59)

	public void verifyMyProfileTest() throws InterruptedException {

		JavascriptExecutor js8 = (driver);

		js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='My Profile']"))
				.click();

		Thread.sleep(5000);

		String titleOnPage = driver.findElement(By.xpath("//h1[normalize-space()='My Profile']")).getText();

		System.out.println("After Click on My Profile title on a Page is :" + titleOnPage);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Save Profile']")).click();

		Thread.sleep(5000);

		String updateMsg = driver
				.findElement(By.xpath("//div[normalize-space()='Your profile was updated successfully.']")).getText();

		String expMsg = "Your profile was updated successfully.";

		Assert.assertEquals(updateMsg, expMsg);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 32-MyProfile-Test-Passed==========>");

	}

}
