package com.myamazon.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.myamazon.base.BaseClass;
import com.myamazon.dataprovider.DataProviders;
import com.myamazon.pageobjects.HomePage;
import com.myamazon.pageobjects.IndexPage;
import com.myamazon.pageobjects.LoginPage;
import com.myamazon.utility.Log;

public class LoginTest extends BaseClass {

	LoginPage loginPage;
	IndexPage indexPage;
	HomePage homePage;

	@Test(groups = {"Smoke", "Sanity"}, dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String email, String password) {
		Log.startTestCase("loginTest");
		indexPage = new IndexPage();
		try{
		boolean accountSuspendMessage = indexPage.getAccountSuspendedMessage();
			System.out.println(accountSuspendMessage);
		}
		catch(Exception e){
		System.out.println("Interrupted Exception thrown");
		}
		Log.info("Index Page loaded");
		/*LoginPage = indexPage.clickOnSignIn();
		Log.info("Click on SignIn");
		homePage = loginPage.userLogin(email, password);
		Log.info("Entered Email address and password for login");
		String actualURL = homePage.getCurrentUrl();
		String expectedURL = prop.getProperty("expectedUrl");
		Assert.assertEquals(actualURL, expectedURL);*/
		Assert.assertEquals(accountSuspendMessage,"true");
		Log.info("Log in validated successfully");
		Log.endTestCase("loginTest");
	}


	@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void tearDown() {
		driver.quit();
	}
}
