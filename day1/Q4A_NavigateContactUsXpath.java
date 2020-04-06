package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q4A_NavigateContactUsXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tothenew.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/header[2]/div/div/nav/div[2]/ul/li[8]/a")).click();
		// driver.findElement(By.partialLinkText("CONTACT US")).click();
		driver.wait(1);
		driver.close();

	}
}
