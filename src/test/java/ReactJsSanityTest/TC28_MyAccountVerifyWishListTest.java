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

public class TC28_MyAccountVerifyWishListTest extends BaseClass {

	@Test(priority = 48)

	public void verifyWishListTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[@href='/rclp/men/_/N-zljxmi']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='denim shirts']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()=\"LEVI'S BARSTOW DENIM SHIRT\"]")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='S']")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("add-item-to-wishlist")).click();

		Thread.sleep(6000);

	}

	@Test(priority = 49)

	public void removeItemFromWishListTest() throws InterruptedException {

		JavascriptExecutor j = (driver);

		j.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

		Thread.sleep(10000);

		driver.findElement(By.xpath("//span[normalize-space()='Accounts & Orders']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[4]/span[1]"))
				.click();

		Thread.sleep(5000);

		// Verify the Correct Item added to wishList

		String wishListItem = driver.findElement(By.xpath("//a[normalize-space()=\"LEVI'S BARSTOW DENIM SHIRT\"]"))
				.getText();

		String expItem = "LEVI'S BARSTOW DENIM SHIRT";

		Assert.assertEquals(wishListItem, expItem);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();

		Thread.sleep(5000);

		String wishListMsg = driver
				.findElement(By.xpath("//p[normalize-space()='There are no items in your wishlist']")).getText();

		System.out.println("After Removing the Item from WishList message is :" + wishListMsg);

	}

}
