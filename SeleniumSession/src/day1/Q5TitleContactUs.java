package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5TitleContactUs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tothenew.com/contact-us");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
