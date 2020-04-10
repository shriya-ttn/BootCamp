package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1AlertPopUps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/shriya/Downloads/Eclipse jars/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		driver.switchTo().alert().sendKeys("Shriya");
		driver.switchTo().alert().accept();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		driver.switchTo().alert().accept();

//	driver.quit();

	}
}
