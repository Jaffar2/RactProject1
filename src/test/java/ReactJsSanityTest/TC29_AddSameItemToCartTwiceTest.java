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
 *         This Test is to
 * 
 *         Verify the User Can
 * 
 *         Add Same Item Twice to Cart!
 * 
 *         And verify the QTY added is 2 for the Item
 * 
 *         =============================================>
 *
 */

public class TC29_AddSameItemToCartTwiceTest extends BaseClass {

	@Test(priority = 50)

	public void addSameItemToCartTwiceTest() throws InterruptedException {

		Thread.sleep(5000);

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

		driver.findElement(By.xpath("//*[@id=\"products-column\"]/div[1]/div/div[3]/div/div/h3/a")).click();

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

		Thread.sleep(5000);

		String productName = driver.findElement(By.xpath("//a[contains(text(),'Anorak Parka Jacket')]")).getText();

		String expectedProduct = "ANORAK PARKA JACKET";

		Thread.sleep(5000);

		Assert.assertEquals(productName, expectedProduct);

	}

	@Test(priority = 51)

	public void addSameItemToCartAgain() throws InterruptedException {

		Thread.sleep(5000);

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

		driver.findElement(By.xpath("//*[@id=\"products-column\"]/div[1]/div/div[3]/div/div/h3/a")).click();

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

		Thread.sleep(5000);

		String productName = driver.findElement(By.xpath("//a[contains(text(),'Anorak Parka Jacket')]")).getText();

		String expectedProduct = "ANORAK PARKA JACKET";

		Thread.sleep(5000);

		Assert.assertEquals(productName, expectedProduct);

		Thread.sleep(5000);

		String itemQty = driver.findElement(By.xpath("//*[contains(@class,'product')]")).getText();

		System.out.println(itemQty);

	}

	@Test(priority = 52)

	public void verifySameItemAddedTwiceInCart() throws InterruptedException {

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

		Thread.sleep(5000);

		String shoppingBag1 = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']"))
				.getText();

		Thread.sleep(5000);

		System.out.println("After removing an item bag is :" + shoppingBag1);

		Thread.sleep(5000);

	}

}
