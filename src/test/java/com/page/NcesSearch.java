package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utilis.Utility;

public class NcesSearch {
	
public WebDriver driver;
 
@FindBy (name="State")
WebElement state;

@FindBy  (xpath="//input[@name='City']")
WebElement city;

@FindBy (linkText="Browse")
WebElement Browse;

@FindBy (linkText="Abbeville")
WebElement Abbeville;

@FindBy (xpath="(//input[@type='submit'])[2]")
WebElement search;

@FindBys (@FindBy (xpath="//font[@face='Times']//a"))
List<WebElement> name;

@FindBys (@FindBy (xpath="//font[@face='Times']//font"))
List<WebElement> adress;

@FindBys (@FindBy (xpath="//font[@face='Times']//parent::td[1]//following-sibling::td[1]"))
List<WebElement> phonenumber;

@FindBys (@FindBy (xpath="//font[@face='Times']//parent::td[1]//following-sibling::td[2]"))
List<WebElement> country;

@FindBys (@FindBy (xpath="//font[@face='Times']//parent::td[1]//following-sibling::td[3]"))
List<WebElement> student;

@FindBys (@FindBy (xpath="//font[@face='Times']//parent::td[1]//following-sibling::td[4]"))
List<WebElement> grade;
  public NcesSearch(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
   }
  public void enterData() throws Throwable {
	  Utility.selectByText(state, Utility.loadProperties().getProperty("state"));
	  Utility.enterText(city, Utility.loadProperties().getProperty("city"));
  }
  public void search() {
	  Utility.click(search);
  }
 public void extractData() {
	 Utility.country(country);
	 Utility.grade(grade);
	 Utility.nameList(name);
	 Utility.phoneNumber(phonenumber);
	 Utility.adressList(adress);
	 Utility.student(student);
 }
 public int length() {
	return name.size();
	 
 }
}
