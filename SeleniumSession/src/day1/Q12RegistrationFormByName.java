package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12RegistrationFormByName {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
//	driver.findElement(By.name(name))
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SHRIYA");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Garg");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sg@gmail.com");	
	driver.close();
	}
}