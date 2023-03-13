package co.xyz.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2 {

	WebDriver driver;
	JavascriptExecutor jse;

	@Test
	public void invokeBrowser1() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rj786\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

			driver.get("https://www.facebook.com");
			Thread.sleep(500);
			driver.findElement(By.name("email")).sendKeys("rj786214@gmail.com");
			Thread.sleep(1500);
			driver.findElement(By.name("pass")).sendKeys("rj786214@gmail.com");
			Thread.sleep(500);
			driver.findElement(By.name("login")).click();
			Thread.sleep(4000);
			driver.quit();
			System.out.println(driver.getTitle());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
