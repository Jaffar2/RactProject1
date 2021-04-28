/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 * 
 * 
 *         =======================================>
 * 
 *         This Test is to make sure
 *
 *         Size chat for Shoes works as Expected
 * 
 *         ========================================>
 *
 */
public class TC23_SizeChatShoesTest extends BaseClass {

	@Test(priority = 39)

	public void verifyImagesOnSizeChatPage() throws InterruptedException {

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

	@Test(priority = 40)

	public void verifySizeChatShoesTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[@class='level-1'][normalize-space()='MEN']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//li[@class='level-2-container level-2-container-6']//a[contains(text(),'sneakers')]"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@id='product-cell-020203AAKG0']//a[contains(text(),'RJ RETRO COURT SNEAKER BLACK')]"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Size Chart']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//img[@alt='Size Guide for RJ RETRO COURT SNEAKER BLACK']")).isDisplayed();

		Thread.sleep(5000);

		String sizeChat = driver
				.findElement(By.xpath("//h5[normalize-space()='Size Chart for RJ RETRO COURT SNEAKER BLACK']"))
				.getText();

		String expSizeChat = "Size Chart for RJ RETRO COURT SNEAKER BLACK";

		Thread.sleep(5000);

		Assert.assertEquals(sizeChat, expSizeChat);

	}

}
