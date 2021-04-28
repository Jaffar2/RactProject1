/**
 * 
 */
package ReactJsSanityTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 *
 */

/*
 * ======================================================>
 * 
 * This Test is to verify User can Login to UAT ReactJS
 * 
 * With valid credentials
 * 
 * ======================================================>
 */

public class TC02_LoginWithYourOnlineProfileTest extends BaseClass {

	@Test(priority = 3)

	public void verifyLogin() throws InterruptedException {

		String expectedTitle = "myTFGworld - Welcome to your world of curated, lifestyle shopping.";

		String actualTitle = driver.getTitle();

		Thread.sleep(5000);

		Assert.assertEquals(actualTitle, expectedTitle);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 02-Login-Test-Passed==========>");

	}

}
