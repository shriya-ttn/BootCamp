package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q11RegistrationFormValidation {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shriya");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Garg");
	driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("Greater Noida");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shriya@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("8373908033");
	driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.id("msdd")).click();
	driver.findElement(By.linkText("Korean")).click();
	driver.findElement(By.linkText("Italian")).click();
	driver.findElement(By.id("basicBootstrapForm")).click();
	Select skills=new Select(driver.findElement(By.id("Skills")));
	skills.selectByValue("Java");
	Select country=new Select(driver.findElement(By.id("countries")));
	country.selectByValue("India");
	driver.findElement(By.xpath("//b[@role]")).click();
	driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Denmark");
	driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li")).click();
	driver.findElement(By.xpath("//select[@placeholder='Year']")).sendKeys("2014");
	driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("October");
	driver.findElement(By.xpath("//select[@placeholder='Day']")).sendKeys("7");
	driver.findElement(By.id("firstpassword")).sendKeys("Shriya123");
	driver.findElement(By.id("secondpassword")).sendKeys("Shriya123");
	
	//Validate that Refresh button is disabled.
	WebElement refreshButton = driver.findElement(By.id("Button1"));
	if(refreshButton.isEnabled()) 
		System.out.println("Refresh button is enabled");
	else
		System.out.println("Refresh button is disabled");
			
	//Validate that your respective gender is selected or not.
	if (driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).isSelected())
		System.out.println("Correct gender selected");
	else
		System.out.println("Incorrect gender is selected");
	
	// Validate that header of the registration page is Automation Demo Site. 
	String title = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1")).getText();
	if(title.equals("Automation Demo Site"))
		System.out.println("Heading of page is: " +title+ "; Hence validated");
	else
		System.out.println("Invalid heading");
	
	// Validate that title of the page is Register.
	String pageTitle = driver.getTitle();
	if(pageTitle.equals("Register"))
		System.out.println("Title of page is: " +pageTitle+ "; Hence validated");
	else
		System.out.println("Invalid title of page");
	}
	
}
