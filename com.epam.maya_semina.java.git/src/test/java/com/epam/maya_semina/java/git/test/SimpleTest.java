package com.epam.maya_semina.java.git.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.out.println("hello!");
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\com.epam.maya_semina.lesson_10\\src\\test\\resources\\chromedriver.exe");//"D:\\workspace\\com.epam.maya_semina.lesson_10\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("https://yandex.ru");

		Assert.assertTrue(driver.getTitle().equals("яндекс"));
	}
	
	@AfterSuite
	public void close(){
		driver.close();
	}
}
