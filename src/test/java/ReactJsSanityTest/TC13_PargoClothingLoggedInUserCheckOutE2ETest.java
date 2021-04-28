/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 * 
 * 
 *         ============================================>
 * 
 *         This Test is to verify Pargo Functionality
 * 
 *         Works as Expected End to End Test
 * 
 */

public class TC13_PargoClothingLoggedInUserCheckOutE2ETest extends BaseClass {

	@Test(priority = 23)

	public void verifyImagesOnPargoPage() throws InterruptedException {

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

	@Test(priority = 24)

	public void pargoTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//label[@for='sub-sub-nav-nav-level-1-0-8-/plp/women/tops/_/N-l6ev2b']//a[contains(text(),'TOPS')]"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@class='row no-gutters catalogue-columns']//div[5]//div[1]//div[1]//h3[1]//a[1]"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[normalize-space()='M']")).click();

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Collect from Pargo Pick-up Point')]")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"pargo-form\"]/div/div/iframe")));

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"points_list\"]/div[1]/p[5]/button")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		driver.findElement(By.id("checkout-1__pargo_firstname")).sendKeys("Jaffe");

		driver.findElement(By.id("checkout-1__pargo_surname")).sendKeys("Shaike");

		driver.findElement(By.id("checkout-1__pargo_cell")).sendKeys("843716928");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@class='btn--full button-existing-address-submit btn btn-primary']"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-full-width btn btn-primary']")).click();

		Thread.sleep(12000);

		driver.findElement(By.xpath("//input[@id='paymentMethodsCREDITCARD_TOKEN0.cvv']")).sendKeys("123");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='tokenSubmit']")).click();

		Thread.sleep(15000);

		// Assert.assertEquals("https://mytfg.tfgtst.co.za/","https://mytfgworld.uat.tfgapps.co.za/",
		// "Redirecting to wrong url Test Failed");

		System.out.println("After Successful Transaction Redirecting to : https://mytfg.tfgtst.co.za/");

	}

}
