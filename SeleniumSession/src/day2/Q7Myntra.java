package day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7Myntra {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='home-&-living']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@data-reactid='529']"))).click().build().perform();
		String url = driver.getCurrentUrl();

		String homePage = "http://www.myntra.com";
		HttpURLConnection huc = null;
		
		int respCode = 200;
		if (url == null || url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is empty");
		}

//		if (!url.startsWith(homePage)) {
//			System.out.println("URL belongs to another domain, skipping it.");
//		}
		
		try {
			huc = (HttpURLConnection) (new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode = huc.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
