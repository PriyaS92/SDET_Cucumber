package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionlibrary.CommonFunctions;

public class MoviePage extends CommonFunctions{
	
	@FindBy(xpath="//h2[text()='Recommended Movies']/following::div[8]/a")
	public WebElement movie_1;
	@FindBy(xpath="//a[text()='2D']/following::button[1]")
	public WebElement book_tickets_button;
	@FindBy(xpath="//a[@data-venue-code='ACTN']")
	public WebElement book_location;
	@FindBy(xpath="//div[@id='A_12_02']/a")
	public WebElement seat_book;
	@FindBy(xpath="//div[@class='screen-this-way']/following::div[4]/a[1]")
	public WebElement pay_tickets;
	@FindBy(xpath="//div[@id='btnPopupAccept']")
	public WebElement accept_button;
	@FindBy(xpath="//a[text()='Please wait...']/following::div[@id='prePay']")
	public WebElement proceed_payment;
	
	public WebDriver driver;
	
	public MoviePage(){
		this.driver = CommonFunctions.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login_application() {
		CommonFunctions.driver.get("https://in.bookmyshow.com/explore/home/chennai");
	}
	
	public void ticket_booking() throws InterruptedException {
		movie_1.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		book_tickets_button.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		book_location.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CommonFunctions.driver.findElement(By.xpath("//li[text()='1']")).click();
		CommonFunctions.driver.findElement(By.xpath("//div[@class='btn-bar']/div[@id='proceed-Qty']")).click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		seat_book.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void payment() {
		pay_tickets.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		accept_button.click();
		proceed_payment.click();
		CommonFunctions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
