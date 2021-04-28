/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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

public class TC40_CancelOrderTest extends BaseClass {

	@Test(priority = 74)

	public void orderCancelTest() throws InterruptedException {

		JavascriptExecutor js8 = (driver);

		js8.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[contains(@class,'header-control-items')]//span[contains(@class,'profile-menu__item-copy')][normalize-space()='Orders']"))
				.click();

		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		Assert.fail("We seem to be having a technical problem error");

		driver.findElement(By.xpath("//a[contains(text(),'x244460230')]")).click();

		Thread.sleep(5000);

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'x24438007')]")).click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//a[contains(text(),'Cancel Order')]")).click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//button[normalize-space()='Yes, Cancel Order']"
		 * )).click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * //Assert.fail("Order Cancellation is not working as Expected");
		 */
		String modalMsg = driver.findElement(By.xpath("//div[normalize-space()='CANCELLED']")).getText();

		String expMsg = "CANCELLED";

		Assert.assertEquals(modalMsg, expMsg);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 20-Cancel-Order-Test-Passed==========>");

	}

}
