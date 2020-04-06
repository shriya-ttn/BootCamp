package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q4B_NavigateContactUsID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tothenew.com/");
		// driver.findElement(By.id("h-contact-us")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30000);

		driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
		/*
		 * site not quitting because of a bug in site which shows two contact us * with
		 * exact same path
		 * 
		 * We were told to use xpath id instead
		 * 
		 * It was confirmed the presenters in class that the site has this bug.
		 */
		driver.close();
	}

}
