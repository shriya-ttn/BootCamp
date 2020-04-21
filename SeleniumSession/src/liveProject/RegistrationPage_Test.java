package liveProject;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationPage_Test {

	String AfterSuccesfulRegisterURL = "http://newtours.demoaut.com/create_account_success.php";

	@Test
	public void Should_Successfully_Register_Using_ValidData() throws IOException {

		Properties prop1 = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/home/shriya/eclipse-workspace/SeleniumSession/src/liveProject/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop1.load(fis);

		String userName = prop1.getProperty("userName");
		String password = prop1.getProperty("password");

		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Shriya");
		driver.findElement(By.name("lastName")).sendKeys("Garg");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.id("userName")).sendKeys("sg@tothenew.com");
		driver.findElement(By.name("address1")).sendKeys("RajCity");
		driver.findElement(By.name("address2")).sendKeys("GNoida");
		driver.findElement(By.name("city")).sendKeys("GNoida");
		driver.findElement(By.name("state")).sendKeys("UP");
		driver.findElement(By.name("postalCode")).sendKeys("201308");
		driver.findElement(By.name("country")).click();
		Select Country = new Select(driver.findElement(By.name("country")));
		Country.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		driver.findElement(By.name("register")).click();

		String GeneratedURL = driver.getCurrentUrl();
		assertEquals(GeneratedURL, AfterSuccesfulRegisterURL);
		driver.close();

	}
}