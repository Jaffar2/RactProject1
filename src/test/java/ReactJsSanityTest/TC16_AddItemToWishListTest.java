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
 *         =============================================>
 * 
 *         This Test is to verify Add Item to WishList
 * 
 *         Works as Expected
 * 
 *         On PDP user can Click on Add item to WishList
 * 
 *         And Click on Remove from WishList on PDP
 * 
 *         ============================================>
 */

public class TC16_AddItemToWishListTest extends BaseClass {

	@Test(priority = 28)

	public void wishListTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));

		Actions actions1 = new Actions(driver);

		actions1.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//label[@for='sub-sub-nav-nav-level-1-0-8-/plp/women/tops/_/N-l6ev2b']//a[contains(text(),'TOPS')]"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"products-column\"]/div[1]/div/div[3]/div/div/h3/a")).click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='M']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(10000);

		driver.findElement(By.id("add-item-to-wishlist")).click();

		Thread.sleep(6000);

		String wishListMessage = driver.findElement(By.xpath("//span[normalize-space()='Remove From Wishlist']"))
				.getText();

		String expMessage = "REMOVE FROM WISHLIST";

		Assert.assertEquals(wishListMessage, expMessage);

		Thread.sleep(5000);

		Actions actions13 = new Actions(driver);

		WebElement elementLocator = driver.findElement(By.xpath("//span[normalize-space()='Remove From Wishlist']"));

		actions13.click(elementLocator).perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Remove From Wishlist']")).click();

		Thread.sleep(10000);

		String wishListMessage1 = driver.findElement(By.id("add-item-to-wishlist")).getText();

		System.out.println(wishListMessage1);

		String expMsg1 = "ADD TO WISHLIST";

		Assert.assertEquals(wishListMessage1, expMsg1);

		Thread.sleep(5000);

		System.out.println("=============>Test Case 16-AddItem-To-WishList-Test-Passed==========>");

	}

}
