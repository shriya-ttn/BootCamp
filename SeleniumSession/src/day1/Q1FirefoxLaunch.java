package day1;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1FirefoxLaunch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/home/shriya/Downloads/Eclipse jars/geckodriver-v0.26.0-linux64/geckodriver");		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		driver.close();		
	}
}


