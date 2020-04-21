package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1DynamicTable {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "/home/shriya/Downloads/Eclipse jars/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		WebElement view = driver.findElement(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr[4]/td[1]"));

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", view);

		WebElement table = driver.findElement(By.cssSelector("[class*=et_pb_text_4]> div > table"));
		int rowcount = table.findElements(By.cssSelector("[class*=et_pb_text_4]> div > table > tbody > tr")).size();
//System.out.println(rowcount);
		int count = table.findElements(By.xpath("//*[contains(@class,'et_pb_text_4')]/div/table/tbody/tr/td[1]")).size();
		int i;
//System.out.println(count);
		for (i = 2; i <= rowcount; i++) {
			WebElement title = table.findElement(By.xpath("//*[contains(@class,'et_pb_text_4')]/div/table/tbody/tr[" + i + "]/td[1]"));
			if (title.getText().equalsIgnoreCase("Quality Assurance Engineer"))
				break;
		}

		String salary = table.findElement(By.xpath("//*[contains(@class,'et_pb_text_4')]/div/table/tbody/tr[" + i + "]/td[3]")).getText();

		System.out.println(salary);
		driver.close();

	}

}