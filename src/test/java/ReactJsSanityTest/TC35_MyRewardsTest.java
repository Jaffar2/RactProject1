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

public class TC35_MyRewardsTest extends BaseClass {

	@Test(priority = 64)

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

	@Test(priority = 65)

	public void verifyMyRewardsTest() throws InterruptedException {

		JavascriptExecutor js8 = (driver);

		js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//body/div[@id='__next']/div[contains(@class,'site-1018 site-mytfg')]/header[@id='site-header']/div[contains(@class,'logo-controls')]/div[contains(@class,'container-fluid no-padding-desktop')]/div[contains(@class,'row no-gutters')]/div[contains(@class,'col logo-controls-container')]/div[contains(@class,'header-control-items')]/div[@id='profile-menu']/div[contains(@class,'profile-menu__inner')]/div[contains(@class,'profile-menu__content js-profile-menu-component-content')]/div[contains(@class,'profile-menu__content-inner')]/div[2]/div[1]/a[2]/span[1]"))
				.click();

		Thread.sleep(5000);

		String titleOnPage = driver.findElement(By.xpath("//h1[normalize-space()='My Rewards']")).getText();

		System.out.println("After Click on My Rewards title on a Page is :" + titleOnPage);

		Thread.sleep(5000);

		String updateMsg = driver
				.findElement(By.xpath("//p[normalize-space()='You do not have any vouchers at the moment.']"))
				.getText();

		String expMsg = "You do not have any vouchers at the moment.";

		Assert.assertEquals(updateMsg, expMsg);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 35-My Rewards-Test-Passed==========>");

	}

}
