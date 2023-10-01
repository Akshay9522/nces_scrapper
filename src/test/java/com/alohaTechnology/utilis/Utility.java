package com.alohaTechnology.utilis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends Base{

	public static ArrayList<String> scrapDataName;
	public static ArrayList<String> scrapDataAdress;
	public static ArrayList<String> scrapDataPhoneNumber;
	public static ArrayList<String> scrapDataCountry;
	public static ArrayList<String> scrapDataStudent;
	public static ArrayList<String> scrapDataGrade;


	
	public static void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		List <WebElement> list = select.getOptions();
		for (WebElement listElement : list) {
			if (listElement.getText().trim().equalsIgnoreCase(text)) {
				listElement.click();
			}
		}
	}
	public static void switchToHomeWindow() {
		Set <String> windowhdl = driver.getWindowHandles();
		Iterator iterator = windowhdl.iterator();
		String homeWndw = (String) iterator.next();
		driver.switchTo().window(homeWndw);
	}
	public static void switchTochildWindow() {
		Set <String> windowhdl = driver.getWindowHandles();
		System.out.println(windowhdl.size());
		Iterator iterator = windowhdl.iterator();
		String homeWndw = (String) iterator.next();
		String chldWndw = (String) iterator.next();
		driver.switchTo().window(chldWndw);
	}
	public static void nameList(List<WebElement> list) {
		scrapDataName=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataName.add(data);
		}
	}
	public static void adressList(List<WebElement> list) {
		scrapDataAdress=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataAdress.add(data);
		}
	}
	public static void phoneNumber(List<WebElement> list) {
		scrapDataPhoneNumber=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataPhoneNumber.add(data);
		}
	}
	public static void country(List<WebElement> list) {
		scrapDataCountry=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataCountry.add(data);
		}
	}
	public static void student(List<WebElement> list) {
		scrapDataStudent=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataStudent.add(data);
		}
	}
	public static void grade(List<WebElement> list) {
		scrapDataGrade=new ArrayList<String>();
		for(WebElement element:list) {
			String data=element.getText().trim();
			scrapDataGrade.add(data);
		}
	}
}
