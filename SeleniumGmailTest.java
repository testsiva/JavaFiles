package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGmailTest {

	WebDriver driver;

	void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		actions();

	}

	void actions() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit Wait....
			driver.findElement(By.name("identifier")).sendKeys("ssiva.kings");
			driver.findElement(By.className("CwaK9")).click();

			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AdmSiva@23");

			WebDriverWait wait = new WebDriverWait(driver, 20); // Explicit Wait.....
			WebElement elt = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Next')]")));
			elt.click();

			driver.findElement(By.xpath("//a[starts-with(@href ,'https://accounts.google.com/SignOutOptions')]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[starts-with(@href ,'https://accounts.google.com/Logout')]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumGmailTest gmail = new SeleniumGmailTest();
		gmail.invokeBrowser();
	}

}
