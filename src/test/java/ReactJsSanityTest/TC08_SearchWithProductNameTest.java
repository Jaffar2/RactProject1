/**
 * 
 */
package ReactJsSanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;

/**
 * @author jaffar
 *
 */

/*
 * ============================================================>
 * 
 * This Test is to verify Search Functionality
 * 
 * Working as Expected!
 * 
 * Verify that the user is able to search a product by Name
 * 
 * =============================================================>
 */

public class TC08_SearchWithProductNameTest extends BaseClass {

	@Test(priority = 13)

	public void verifyImagesOnSearchPage() throws InterruptedException {

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

	@Test(priority = 14)

	public void searchUat() throws InterruptedException {

		driver.findElement(By.xpath("//i[@class='header__inner-control-search']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchText = driver.findElement(By.xpath(
				"//div[contains(@class,'desktop-header-search header__search header__search--mobile')]//input[@id='search-type-ahead-field']"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		searchText.sendKeys("Rugby");

		Thread.sleep(5000);

		searchText.sendKeys(Keys.ENTER);

		Thread.sleep(10000);

		String whatProduct = driver.findElement(By.xpath(
				"//div[@id='products-column']//div//div//div//div//div//a[contains(text(),'Junior adidas All Blacks Rugby World Cup Home Jers')]"))
				.getText();

		Thread.sleep(5000);

		System.out.println("Product image is :" + whatProduct);

		Thread.sleep(5000);

		// System.out.println("Search Text displayed in white color Test Step Passed");

		System.out.println("=============>Test Case 08-Search-With-ProductName-Test-Passed==========>");

		System.out.println("Search with Product ID and SKU JIRA Ticket is Logged");

	}

}
