package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Frame {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ToTheNew");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs ']/li[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='row']/iframe")));
		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("To_The_New");
	}
}
