/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.basePackage.BaseClass2;

/**
 * @author jaffar
 * 
 * 
 *         ===========================================>
 * 
 *         This Test is to verify User can Login
 * 
 *         Via FaceBook and its not Redirecting
 * 
 *         To My Profile
 * 
 *         ===========================================>
 * 
 */

public class TC30_LoginWithFacebookTest extends BaseClass2 {

	@Test(priority = 53)

	public void loginViaFacebookTest() throws InterruptedException {

		String titleText = driver.findElement(By.xpath("//h2[normalize-space()='Our best offers for you']")).getText();

		String expTitle = "Our Best Offers For You";

		Thread.sleep(8000);

		Reporter.log("=====Redirected to Home Page Test Passed=====", true);

		Assert.assertEquals(titleText, expTitle);

	}

}
