package negativeCase;

import static org.testng.Assert.assertNotEquals;

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

public class FromDateGreaterThanToDate {

	@Test
	public void ShouldNot_BookFlight_With_FromDate_GreaterThan_ToDate() throws IOException {

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
		String ConfirmationPage = prop1.getProperty("ConfirmationPage");

		String nPassengers = prop1.getProperty("nPassengers");
		String DepartingFrom = prop1.getProperty("DepartingFrom");
		// String DepartingMonth = prop1.getProperty("DepartingMonth");
		// String DepartingDate = prop1.getProperty("DepartingDate");
		String ArrivingIn = prop1.getProperty("ArrivingIn");
		// String ReturnMonth = prop1.getProperty("ReturnMonth");
		// String ReturnDate = prop1.getProperty("ReturnDate");
		String ServiceClass = prop1.getProperty("ServiceClass");
		String Airline = prop1.getProperty("Airline");

		String Meal = prop1.getProperty("Meal");
		String CardType = prop1.getProperty("CardType");
		String ExpirationMonth = prop1.getProperty("ExpirationMonth");
		String ExpirationYear = prop1.getProperty("ExpirationYear");
		String Country = prop1.getProperty("Country");

		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		// Search Flight details

		String DepartingMonth = "May";
		String DepartingDate = "12";

		String ReturnMonth = "May";
		String ReturnDate = "10";

		// Book a Flight details

		// Login
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		// Find Flight
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
		Select Pess = new Select(driver.findElement(By.name("passCount")));
		Pess.selectByValue(nPassengers);
		Select DepFrom = new Select(driver.findElement(By.name("fromPort")));
		DepFrom.selectByValue(DepartingFrom);
		Select DepMon = new Select(driver.findElement(By.name("fromMonth")));
		DepMon.selectByVisibleText(DepartingMonth);
		Select DepDay = new Select(driver.findElement(By.name("fromDay")));
		DepDay.selectByValue(DepartingDate);
		Select ArrIn = new Select(driver.findElement(By.name("toPort")));
		ArrIn.selectByValue(ArrivingIn);
		Select RetMon = new Select(driver.findElement(By.name("toMonth")));
		RetMon.selectByVisibleText(ReturnMonth);
		Select RetDay = new Select(driver.findElement(By.name("toDay")));
		RetDay.selectByValue(ReturnDate);
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select Air = new Select(driver.findElement(By.name("airline")));
		Air.selectByVisibleText(Airline);
		driver.findElement(By.name("findFlights")).click();

		// Select a Flight
		driver.findElement(By.name("reserveFlights")).click();

		// Book a Flight
		driver.findElement(By.name("passFirst0")).sendKeys("Shriya");
		driver.findElement(By.name("passLast0")).sendKeys("Garg");

		Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
		meal.selectByVisibleText(Meal);
		Select CC = new Select(driver.findElement(By.name("creditCard")));
		CC.selectByVisibleText(CardType);
		Select ExpMon = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		ExpMon.selectByVisibleText(ExpirationMonth);
		Select ExpYr = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		ExpYr.selectByValue(ExpirationYear);
		driver.findElement(By.name("creditnumber")).sendKeys("4444555566667777");
		driver.findElement(By.name("cc_frst_name")).sendKeys("Shriya");
		driver.findElement(By.name("cc_mid_name")).sendKeys("");
		driver.findElement(By.name("cc_last_name")).sendKeys("Garg");
		WebElement wb = driver.findElement(By.name("billAddress1"));
		wb.clear();
		wb.sendKeys("A-703");
		driver.findElement(By.name("billAddress2")).sendKeys("RajCity");
		WebElement wb2 = driver.findElement(By.name("billCity"));
		wb2.clear();
		wb2.sendKeys("GNoida");
		WebElement wb3 = driver.findElement(By.name("billState"));
		wb3.clear();
		wb3.sendKeys("UP");
		WebElement wb4 = driver.findElement(By.name("billZip"));
		wb4.clear();
		wb4.sendKeys("201308");
		Select BCon = new Select(driver.findElement(By.name("billCountry")));
		BCon.selectByVisibleText(Country);
		WebElement wb5 = driver.findElement(By.name("delAddress1"));
		wb5.clear();
		wb5.sendKeys("A-703");
		driver.findElement(By.name("delAddress2")).sendKeys("RajCity");
		WebElement wb6 = driver.findElement(By.name("delCity"));
		wb6.clear();
		wb6.sendKeys("GNoida");
		WebElement wb7 = driver.findElement(By.name("delState"));
		wb7.clear();
		wb7.sendKeys("UP");
		WebElement wb8 = driver.findElement(By.name("delZip"));
		wb8.clear();
		wb8.sendKeys("201308");
		Select DelCoun = new Select(driver.findElement(By.name("delCountry")));
		DelCoun.selectByVisibleText(Country);
		driver.switchTo().alert().accept();
		driver.findElement(By.name("buyFlights")).click();
		String GenTitle = driver.getTitle();
		assertNotEquals(GenTitle, ConfirmationPage);
		driver.close();

	}

}