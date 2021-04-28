/**
 * 
 */
package ReactJsSanityTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
 *         Add Multiple Items to Bag!
 * 
 *         And verify each item displayed in the Bag
 * 
 *         =============================================>
 *
 */

public class TC31_AddMultipleItemsToBagTest extends BaseClass {

	@Test(priority = 54)

	public void addMultipleItemsToBagTest() throws InterruptedException {

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

	@Test(priority = 55)

	public void addOtherCategoryItemToBag() throws InterruptedException {

		Thread.sleep(5000);

		JavascriptExecutor js = (driver);

		js.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[normalize-space()='HOME']"));

		Actions actions1 = new Actions(driver);

		actions.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='furniture']")).click();

		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[12]//div[1]//div[1]//h3[1]")).click();

		Thread.sleep(5000);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\furnituePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		JavascriptExecutor jse2 = (JavascriptExecutor) driver;

		jse2.executeScript("window.scrollBy(0,200)");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		String productName = driver
				.findElement(By.xpath("//a[contains(text(),'maya acrylic and brass drinks trolley')]")).getText();

		String expectedProduct = "MAYA ACRYLIC AND BRASS DRINKS TROLLEY";

		Thread.sleep(5000);

		Assert.assertEquals(productName, expectedProduct);

		Thread.sleep(5000);

		String itemQty = driver.findElement(By.xpath("//*[contains(@class,'product')]")).getText();

		System.out.println(itemQty);

	}

	@Test(priority = 56)

	public void verifyMultipleItemsAddedInBag() throws InterruptedException {

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Your Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();

		Thread.sleep(5000);

	}

	@Test(priority = 57)

	public void validateMultipleItemsAddedInBag() throws InterruptedException {

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
