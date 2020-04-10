package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q2RegistrationForm {

	public static void main(String[] args) throws IOException {// throws InterruptedException {

		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/home/shriya/eclipse-workspace/SeleniumSession/src/day3/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop.load(fis);
	//	String browserName = prop.getProperty("browser");
		String FirstName = prop.getProperty("FirstName");
		String Lname = prop.getProperty("Lname");
		String Address = prop.getProperty("Address");
		String Email = prop.getProperty("Email");
		String Phone = prop.getProperty("Phone");
		String gender = prop.getProperty("gender");// input[@value=\"FeMale\"]
		String Hob = prop.getProperty("Hob");
		String korean = prop.getProperty("korean");
		String Italian = prop.getProperty("Italian");// Italian
		String lang1 = prop.getProperty("lang1");// Java
		String Country = prop.getProperty("country");// India
		String Country2 = prop.getProperty("country2");
		String yr = prop.getProperty("yr");// 2014
		String mth = prop.getProperty("mth");// October
		String Day = prop.getProperty("Day");
		String firstpassword = prop.getProperty("firstpassword");// Shriya123
		String secondpassword = prop.getProperty("secondpassword");// Shriya123
		
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lname);
		driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(Phone);
		driver.findElement(By.xpath(gender)).click();
		driver.findElement(By.id(Hob)).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText(korean)).click();
		driver.findElement(By.linkText(Italian)).click();
		driver.findElement(By.id("basicBootstrapForm")).click();
		Select skills = new Select(driver.findElement(By.id("Skills")));
		skills.selectByValue(lang1);
		Select country = new Select(driver.findElement(By.id("countries")));
		country.selectByValue(Country);
		driver.findElement(By.xpath("//b[@role]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Country2);
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li")).click();
		driver.findElement(By.xpath("//select[@placeholder='Year']")).sendKeys(yr);
		driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys(mth);
		driver.findElement(By.xpath("//select[@placeholder='Day']")).sendKeys(Day);
		driver.findElement(By.id("firstpassword")).sendKeys(firstpassword);
		driver.findElement(By.id("secondpassword")).sendKeys(secondpassword);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}
}