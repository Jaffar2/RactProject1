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
 * ===========================================================>
 * 
 * This Test is to verify User can SignOut on UAT ReactJS
 * 
 * Verify After Successful Sign Out on a Home Page message is:
 * 
 * How would you like to log in? Displayed
 * 
 * ===========================================================>
 */

public class TC03_LogOutTest extends BaseClass {

	@Test(priority = 4)

	public void verifyImagesOnLogoutPage() throws InterruptedException {

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

	@Test(priority = 5)

	public void SingOutTest() throws InterruptedException {

		JavascriptExecutor js8 = (driver);

		js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='Sign Out']"))
				.click();

		Thread.sleep(10000);

		String message = driver.findElement(By.xpath("//h1[normalize-space()='How would you like to log in?']"))
				.getText();

		System.out.println("After SignOut message on a Home Page is :" + message);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 03-SignOut-Test-Passed==========>");

	}

}
