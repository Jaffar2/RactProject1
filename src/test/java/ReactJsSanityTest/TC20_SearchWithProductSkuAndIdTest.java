/**
 * 
 */
package ReactJsSanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
 * Verify that the user is able to search a product Id , SKU
 * 
 * =============================================================>
 */

public class TC20_SearchWithProductSkuAndIdTest extends BaseClass {

	@Test(priority = 35)

	public void searchWithProductSkuTest() throws InterruptedException {

		driver.findElement(By.xpath("//i[@class='header__inner-control-search']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchText = driver.findElement(By.xpath(
				"//div[contains(@class,'desktop-header-search header__search header__search--mobile')]//input[@id='search-type-ahead-field']"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		searchText.sendKeys("060601ABGM2");

		Thread.sleep(5000);

		searchText.sendKeys(Keys.ENTER);

		Thread.sleep(10000);

		System.out.println("Oh dear, we cant find this category");

		Assert.fail("Search with Product ID and SKU JIRA Ticket is Logged with Zensar");

		String whatProduct = driver.findElement(By.xpath(
				"//div[@id='products-column']//div//div//div//div//div//a[contains(text(),'Junior adidas All Blacks Rugby World Cup Home Jers')]"))
				.getText();

		Thread.sleep(5000);

		System.out.println("Product image is :" + whatProduct);

		Thread.sleep(5000);

		// System.out.println("Search Text displayed in white color Test Step Passed");

	}

	@Test(priority = 36)

	public void searchWithProductIdTest() throws InterruptedException {

		driver.findElement(By.xpath("//i[@class='header__inner-control-search']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement searchText = driver.findElement(By.xpath(
				"//div[contains(@class,'desktop-header-search header__search header__search--mobile')]//input[@id='search-type-ahead-field']"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		searchText.sendKeys("57352591");

		Thread.sleep(5000);

		searchText.sendKeys(Keys.ENTER);

		Thread.sleep(10000);

		System.out.println("Oh dear, we cant find this category");

		Assert.fail("Search with Product ID and SKU JIRA Ticket is Logged with Zensar");

		String whatProduct = driver.findElement(By.xpath(
				"//div[@id='products-column']//div//div//div//div//div//a[contains(text(),'Junior adidas All Blacks Rugby World Cup Home Jers')]"))
				.getText();

		Thread.sleep(5000);

		System.out.println("Product image is :" + whatProduct);

		Thread.sleep(5000);

		// System.out.println("Search Text displayed in white color Test Step Passed");

		System.out.println("=============>Test Case 40-Search-With-ProductName-Test-Passed==========>");

		System.out.println("Search with Product ID and SKU JIRA Ticket is Logged");

	}

}
