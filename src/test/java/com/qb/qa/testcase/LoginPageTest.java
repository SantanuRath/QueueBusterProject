package com.qb.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qb.qa.base.TestBase;
import com.qb.qa.pages.HomePage;
import com.qb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);;
		Assert.assertEquals(title, "QueueBuster™ All-in-One POS - India's Business Super App!");
	}
	@Test(priority=2)
	public void loginText() {
		String text=loginPage.validateLoginText();
		System.out.println(text);
		Assert.assertEquals(text,"Login");
	}
	@Test(priority=3)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
