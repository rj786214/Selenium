package co.xyz.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {

	WebDriver driver;
	JavascriptExecutor jse;

	@Test
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rj786\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

			driver.get("https://www.amazon.ca");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
			driver.findElement(By.id("nav-search-submit-button")).click();
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0,550)");

			//driver.findElement(By.xpath("//li[@id='p_lbr_books_series_browse-bin/It Ends with Us']/span/a/div/label/i")).click();
			driver.quit();
			System.out.println(driver.getTitle());
			//			searchBook();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}





}
