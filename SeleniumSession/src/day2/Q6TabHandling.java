package day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6TabHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://google.com");  
	    ((JavascriptExecutor)driver).executeScript("window.open()");
		/*
		 * ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(1));
		 */
	    Set<String> tabs = driver.getWindowHandles();
	    String newTab = (String) tabs.toArray()[1];
	    driver.switchTo().window(newTab);

	    driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	    WebElement element =  driver.findElement(By.xpath("(//*[@id=\"primary-menu\"]/li[5]/a)[1]"));//.click();

	    Actions actionOpenLinkInNewTab = new Actions(driver);
	    actionOpenLinkInNewTab.moveToElement(element)
	    .keyDown(Keys.CONTROL)
	    .click(element)
	    .keyUp(Keys.CONTROL).build()
	    .perform();
		
	}
}
