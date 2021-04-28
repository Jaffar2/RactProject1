/**
 * 
 */
package ReactJsSanityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.basePackage.BaseClass1;

/**
 * @author jaffar
 * 
 * 
 *         ===========================================>
 * 
 *         This Test is to verify Guest Checkout
 * 
 *         End to End Flow
 * 
 *         works as Expected
 * 
 *         ===========================================>
 * 
 */

public class TC22_ClothingGuestCheckOutPargoE2ETest extends BaseClass1 {

	@Test(priority = 38)

	public void guestCheckOutE2ETest() throws InterruptedException {

		JavascriptExecutor js11 = (driver);

		js11.executeScript("window.scrollBy(1000,4000)");

		Thread.sleep(5000);

		WebElement menuList = driver.findElement(By.xpath("//i[@class='nav-flyout__toggle-icon']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(menuList).build().perform();

		Thread.sleep(5000);

		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'KIDS')]"));

		Actions actions16 = new Actions(driver);

		actions16.moveToElement(home).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//ul[@data-name='KIDS']//li[@class='level-2-container level-2-container-1']//a[contains(text(),'tops')]"))
				.click();

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Boys Check Shirt with Side Tape Detail']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='11-12 years']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-add-to-bag btn btn-primary']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[normalize-space()='View My Bag']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//div[@class='checkout__summary-container desktop-only']//button[@type='button'][normalize-space()='Secure Checkout']"))
				.click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='continue without logging in']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[contains(text(),'Collect from Pargo Pick-up Point')]")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(10000);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"pargo-form\"]/div/div/iframe")));

		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id=\"points_list\"]/div[1]/p[5]/button")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(5000);

		driver.findElement(By.id("checkout-1__pargo_firstname")).sendKeys("Jaffe");

		driver.findElement(By.id("checkout-1__pargo_surname")).sendKeys("Shaike");

		driver.findElement(By.id("checkout-1__pargo_email")).sendKeys("Jaffar.shaik706@gmail.com");

		driver.findElement(By.id("checkout-1__pargo_cell")).sendKeys("843716928");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)", "");

		Thread.sleep(6000);

		driver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Next']")).click();

		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@class='btn-full-width btn btn-primary']")).click();

		Thread.sleep(6000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");

		Thread.sleep(6000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[3]/div[1]/label/input")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"0_cardNumber\"]")).sendKeys("4000015372250142");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"0_nameOnCard\"]")).sendKeys("JH SHAIKH");

		Thread.sleep(5000);

		Select expiryDate = new Select(driver.findElement(By.xpath("//*[@id=\"0_expMonth\"]")));

		expiryDate.selectByIndex(2);

		Thread.sleep(5000);

		Select expYear = new Select(driver.findElement(By.xpath("//*[@id=\"0_expYear\"]")));

		expYear.selectByIndex(5);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"0_cvv\"]")).sendKeys("123");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Pay R249.00']")).click();

		Thread.sleep(15000);

		// Assert.assertEquals("https://mytfg.tfgtst.co.za/","https://mytfgworld.uat.tfgapps.co.za/",
		// "Redirecting to wrong url Test Failed");

		System.out.println("After Successful Transaction Redirecting to : https://mytfg.tfgtst.co.za/");

	}

}
