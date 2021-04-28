/**
 * 
 */
package ReactJsSanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
 * And can find his existing profile
 * 
 * This feature was not working before
 * 
 * ===============================================>
 */

public class TC05_RegisterNewOnlineProfileFindMyCardTest extends BaseClass {

	@Test(priority = 8)

	public void registerNewOnline() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"//div[@class='header-control-items']//span[@class='profile-menu__item-copy'][normalize-space()='Sign Out']"))
				.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Register a new online profile']")).click();

		Thread.sleep(5000);

		String message1 = driver
				.findElement(By.xpath("//div[contains(text(),'Do you have a TFG account or TFG REWARDS card from')]"))
				.getText();

		System.out.println("message on Register a new online profile page is " + message1);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys("6277430011056326312");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='FIND MY CARD']")).click();

		Thread.sleep(5000);

		String expMsg = driver.findElement(By.xpath("//h1[normalize-space()='EXISTING PROFILE FOUND']")).getText();

		System.out.println(expMsg);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 05-RegisterNewOnlineProfile-Test-Passed==========>");

	}

}
