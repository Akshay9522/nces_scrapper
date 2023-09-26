package com.alohaTechnology.utilis;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.opencsv.CSVWriter;

public class Base {

	public static Properties pro;
	protected static  WebDriver driver;
	
	@BeforeTest
	public void webdriverInit() throws Throwable, Throwable {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Integer.valueOf(loadProperties().getProperty("implicitwait")), TimeUnit.SECONDS);
	}
	
	public static void openApplication() throws Throwable {
		driver.get(loadProperties().getProperty("url"));
	}
	
	public static Properties loadProperties() throws Throwable {
		File file = new File(System.getProperty("user.dir")+"//config.properties");
		FileReader fr = new FileReader(file);
		pro = new Properties();
		pro.load(fr);
		return pro;		
	}
    
	@AfterTest
    public static void tearDown() {
    	driver.quit();
    }
}
