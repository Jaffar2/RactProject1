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
 *         This Test is to
 * 
 *         Verify the User Can
 * 
 *         Add Item to Cart! GIFTING & FLOWERS
 * 
 *         ======================================>
 *
 */
public class TC25_AddItemToCartGiftFlowersTest extends BaseClass {

	@Test(priority = 42)

	public void addItemToCartTest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='GIFTING & FLOWERS']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Shop All Flowers']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Red Velvet']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		String product = driver.findElement(By.xpath("//a[contains(text(),'Red Velvet')]")).getText();

		String expectedProduct = "RED VELVET";

		Thread.sleep(5000);

		Assert.assertEquals(product, expectedProduct);

	}

	@Test(priority = 43)

	public void verifyItemInCart() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

		Thread.sleep(5000);

		if (driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']")).isDisplayed()) {

			System.out.println("Element is Visible");

			String shoppingBag1 = driver.findElement(By.xpath("//h4[normalize-space()='YOUR SHOPPING BAG IS EMPTY']"))
					.getText();

			Thread.sleep(5000);

			System.out.println("After removing an item bag is :" + shoppingBag1);

		} else {

			System.out.println("Element is Not Visible");

		}

	}

}
