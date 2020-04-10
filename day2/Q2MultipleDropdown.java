package day2;

import java.util.List;
import org.junit.Assert;  

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q2MultipleDropdown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		System.out.println("Fetching all names");

		List<WebElement> multiList = driver.findElements(By.xpath("//*[@id=\"multi-select\"]/option"));
		for (WebElement country : multiList) {
			System.out.println(country.getText());
		}

		Select dropdown = new Select(driver.findElement(By.id("multi-select")));
// Validating multiple dropdown		
		Assert.assertTrue(dropdown.isMultiple());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].scrollIntoView(true);", new WebDriverWait(driver, 20).until( //
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Multi Select List Demo']"))));

		WebElement newjersey = driver
				.findElement(By.xpath("//select[@id='multi-select']//option[@value='New Jersey']"));
		WebElement newyork = driver.findElement(By.xpath("//select[@id='multi-select']//option[@value='New York']"));
		WebElement texas = driver.findElement(By.xpath("//select[@id='multi-select']//option[@value='Texas']"));

		new Actions(driver).keyDown(Keys.CONTROL).click(newjersey).build().perform();
		new Actions(driver).keyDown(Keys.CONTROL).click(newyork).build().perform();
		new Actions(driver).keyDown(Keys.CONTROL).click(texas).keyUp(Keys.CONTROL).build().perform();

		System.out.println("");
		driver.findElement(By.xpath("//*[@id='printMe']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='getall-selected']")).getText());

		driver.findElement(By.id("printAll")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='getall-selected']")).getText());

		dropdown.deselectAll();
		driver.close();

		/*
		 * driver.get(
		 * "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		 * 
		 * // * // // Select s = new Select(driver.findElement(By.id("select-demo")));
		 * // for // * (int i = // 0; i < 8; i++) { s.selectByIndex(i); // *
		 * Thread.sleep(1000); } //
		 * 
		 * System.out.println("Fetching all names");
		 * 
		 * List<WebElement> multiList =
		 * driver.findElements(By.xpath("//*[@id=\"multi-select\"]/option")); for
		 * (WebElement country : multiList) { System.out.println(country.getText()); }
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver; // WebDriverWait wait =
		 * new WebDriverWait(driver, 20);
		 * js.executeScript("return arguments[0].scrollIntoView(true);", new
		 * WebDriverWait(driver, 20).until(
		 * ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//div[text()='Multi Select List Demo']")))); Select s2 = new
		 * Select(driver.findElement(By.id("multi-select"))); // List<WebElement> //
		 * multiList2 = s2.getOptions();
		 * 
		 * Select s = new Select(driver.findElement(By.id("multi-select")));
		 * s.selectByVisibleText("New Jersey"); s.selectByVisibleText("New York");
		 * s.selectByVisibleText("Texas"); List<WebElement> options =
		 * s.getAllSelectedOptions(); for(WebElement option : options) {
		 * System.out.println(option.getText());
		 * 
		 * 
		 * Actions builder = new Actions(driver); //Action seriesOfActions = builder
		 * builder.keyDown(Keys.CONTROL).build().perform(); // Thread.sleep(2000);
		 * s2.selectByVisibleText("New Jersey"); //Thread.sleep(2000);
		 * s2.selectByVisibleText("New York"); // Thread.sleep(2000);
		 * s2.selectByVisibleText("Texas"); //Thread.sleep(2000);
		 * builder.keyUp(Keys.CONTROL).build().perform();
		 * 
		 * 
		 * driver.findElement(By.id("printMe")).click(); // after clicking first // //
		 * selected and then all select it is only // giving the output of last selected
		 * Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.id("printMe")).getText());
		 * Thread.sleep(2000); // as the site is working as same.
		 * driver.findElement(By.id("printAll")).click();
		 * System.out.println(driver.findElement(By.id("printAll")).getText());
		 * 
		 */

	}
}