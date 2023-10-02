package com.qb.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qb.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement lgbtn;
	
	@FindBy(xpath="//p[text()='Login']")
	WebElement lgntext;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public String validateLoginText() {
		String text=lgntext.getText();
		return text;
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		lgbtn.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",lgbtn);
		    	
		return new HomePage();
	}
	
	

}
