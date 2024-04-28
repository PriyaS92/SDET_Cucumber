package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import functionlibrary.CommonFunctions;

public class Shoppingpage extends CommonFunctions{
	public void login_application() {
		CommonFunctions.driver.get("https://automationexercise.com/products");
	}
	
	public void add_products() throws InterruptedException {
		CommonFunctions.driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Blue Top");
		CommonFunctions.driver.findElement(By.xpath("//button[@id='submit_search']")).click();
		TimeUnit.SECONDS.sleep(10);
		CommonFunctions.driver.findElement(By.xpath("//div[@class='choose']/descendant::a")).click();
		TimeUnit.SECONDS.sleep(5);
		CommonFunctions.driver.findElement(By.xpath("//label[text()='Quantity:']/following::button[1]")).click();
		TimeUnit.SECONDS.sleep(5);
		Assert.assertTrue(CommonFunctions.driver.findElement(By.xpath("//h4[@class='modal-title w-100']")).getText().equals("Added!"));
	}
	
	public void view_products_cart() throws InterruptedException {
		CommonFunctions.driver.findElement(By.xpath("//h4[@class='modal-title w-100']/following::p[2]")).click();
		TimeUnit.SECONDS.sleep(5);
	}
	
	public void remove_products() throws InterruptedException {
		CommonFunctions.driver.findElement(By.xpath("//a[@class='cart_quantity_delete']")).click();
		TimeUnit.SECONDS.sleep(5);
		CommonFunctions.driver.close();
	}
}
