/**
 * 
 */
package ReactJsSanityTest;

import java.util.concurrent.TimeUnit;

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
 * ===============================================>
 * 
 * This Test is to verify User can Click on
 * 
 * Register New Online Profile
 * 
 * OTP Feature works as Expected
 * 
 * ===============================================>
 */

public class TC39_RegisterNewOnlineProfileCardForgorPasswordTest extends BaseClass {

	@Test(priority = 72)

	public void verifyImagesOnLoginPage() throws InterruptedException {

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

	@Test(priority = 73)

	public void registerNewOnlineOTPTest() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='Sign Out']"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Register a new online profile']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("6277430011056326312");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='FIND MY CARD']")).click();

		// Thread.sleep(5000);

		// driver.findElement(By.xpath("//a[normalize-space()='Forgot your
		// password?']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='SEND MY OTP TO RESET MY PASSWORD']")).click();

		Thread.sleep(10000);

		WebElement obj = driver.findElement(By.xpath("//input[@name='forgot__otp']"));

		if (obj.getAttribute("value").isEmpty()) {

			System.out.println("Text Field not prepopulating with Cell Numbers OR Email Address Test Passed");

		} else {

			System.out.println("Text Field prepopulating with Cell Numbers OR Email Address Test Failed");

			String store = obj.getAttribute("value");

		}

	}

}
