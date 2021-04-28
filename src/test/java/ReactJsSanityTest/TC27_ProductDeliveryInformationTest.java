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
 *         ==================================================>
 * 
 *         This Test is to Verify
 * 
 *         Product Delivery information
 * 
 *         Payment Options
 * 
 *         Returns Information
 * 
 *         is displayed correctly
 * 
 *         on PDP
 * 
 *         ==============================================>
 *
 */

public class TC27_ProductDeliveryInformationTest extends BaseClass {

	@Test(priority = 45)

	public void productDeliveryInformationTest() throws InterruptedException {

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

		driver.findElement(
				By.xpath("//div[@id='product-cell-024600AAAA0']//a[contains(text(),'RJ SHORT SLEEVE DENIM SHIRT')]"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='DELIVERY INFORMATION']")).click();

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@data-accordion-label='DELIVERY INFORMATION']//div//img")).isDisplayed();

		Thread.sleep(5000);

	}

	@Test(priority = 46)

	public void paymentOptionsTest() throws InterruptedException {

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

		driver.findElement(
				By.xpath("//div[@id='product-cell-024600AAAA0']//a[contains(text(),'RJ SHORT SLEEVE DENIM SHIRT')]"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='PAYMENT OPTIONS']")).click();

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@data-accordion-label='PAYMENT OPTIONS']//div//img")).isDisplayed();

		Thread.sleep(5000);

	}

	@Test(priority = 47)

	public void returnsInformationTest() throws InterruptedException {

		Thread.sleep(5000);

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

		driver.findElement(
				By.xpath("//div[@id='product-cell-024600AAAA0']//a[contains(text(),'RJ SHORT SLEEVE DENIM SHIRT')]"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[normalize-space()='RETURNS INFORMATION']")).click();

		Thread.sleep(4000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[@data-accordion-label='RETURNS INFORMATION']//div//img")).isDisplayed();

		Thread.sleep(5000);

	}

}
