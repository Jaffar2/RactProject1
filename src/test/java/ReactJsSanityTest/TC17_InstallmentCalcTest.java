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
 *         ================================================>
 * 
 *         This Test is to verify Installment Calculator
 * 
 *         Functionality Works as Expected
 * 
 *         ===============================================>
 */

public class TC17_InstallmentCalcTest extends BaseClass {

	@Test(priority = 29)

	public void installmentCalcTest() throws InterruptedException {

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

		driver.findElement(By.xpath(
				"//span[contains(@class,'product-detail__installment-calculator desktop-only product-detail__installment-calculator-link')]"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='modal-body']//div[2]//label[1]//div[1]")).click();

		Thread.sleep(2000);

		String monthlyPayment = driver.findElement(By.xpath("//strong[normalize-space()='R 301.98']")).getText();

		String expPayment = "R 301.98";

		Assert.assertEquals(monthlyPayment, expPayment);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[contains(@role,'dialog')]//div[3]//label[1]")).click();

		Thread.sleep(5000);

		String monthlyPayment1 = driver.findElement(By.xpath("//strong[normalize-space()='R 164.22']")).getText();

		String expPayment1 = "R 164.22";

		Assert.assertEquals(monthlyPayment1, expPayment1);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();

		Thread.sleep(5000);

		System.out.println("=============>Test Case 17-InstallmentCalcTest-Passed==========>");

	}

}
