package com.maheshsirproject.ecommerce.home;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class DynamicWebCalendar {

	public WebDriver driver;

	@Test
	public void f() throws Exception {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		Thread.sleep(5000);

		// Departure Date
		String date = "15-December 2020";
		String[] ddSplitter = date.split("-");
		String depDate = ddSplitter[0];
		String depMonth = ddSplitter[1];
		selectDate(depDate, depMonth);
		
		//Return Date
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		Thread.sleep(5000);
		String rtDate="15-March 2021";
		String[] rtSplitter=rtDate.split("-");
		String returnDate=rtSplitter[0];
		String returnMonth=rtSplitter[1];
		selectDate(returnDate, returnMonth);

	}

	public void selectDate(String depDate, String depMonth) throws Exception {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div/div/div"));
		System.out.println(elements.size());
		for (int i = 0; i < elements.size(); i++) {
			i = 0;
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().equalsIgnoreCase(depMonth)) {
				System.out.println("We are in Required month");
				List<WebElement> tableData = driver
						.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a"));
				for (WebElement d : tableData) {
					System.out.println(d.getText());
					if (d.getText().equalsIgnoreCase(depDate)) {
						d.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
				elements = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div/div/div"));
			}
		}
	}

	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.geck.driver", "C:\\Users\\Karthik & Divya\\Desktop\\Selenium Course 2020\\Selenium Online Class_2020_DurgaSoft\\July2020_WebDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();

	}

}
