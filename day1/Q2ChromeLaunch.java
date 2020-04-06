package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2ChromeLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		driver.close();
	
	}
}
