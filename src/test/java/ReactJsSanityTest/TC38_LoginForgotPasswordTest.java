/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basePackage.BaseClass1;

/**
 * @author jaffar
 *
 */

/*
 * =============================================>
 * 
 * This Test is to verify Forgot Password
 * 
 * Functionality works as Expected
 * 
 * And not Pre-Population with Cell No
 * 
 * ===============================================>
 */

public class TC38_LoginForgotPasswordTest extends BaseClass1 {

	@Test(priority = 70)

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

	@Test(priority = 71)

	public void verifyLoginForgotPasswordTest() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Login & Register']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Log in with your online profile']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Forgot your password?']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='Email or Cellphone number']"))
				.sendKeys("Automation913@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

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
