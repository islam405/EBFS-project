package com.ebfs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.pages.ContactsPage;
import com.ebfs.qa.pages.HomePage;
import com.ebfs.qa.pages.LoginPage;
import com.ebfs.qa.testcase.properties.ContactsPageTestProperties;
import com.ebfs.qa.util.TestUtil;
import com.qa.ExtentReportListener.ExtentTestManager;

public class UserAccountTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;

	public UserAccountTest() {
		super();

	}

	/**
	 * @throws InterruptedException
	 */
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
	}
	@Test
	public void createAccount() {
		//click signIn Btn
		homePage.clickSignInBtn();
		//Enter Email
		loginPage.enterEmail();
		//Click create account btn
		loginPage.clickCreateAccountBtn();
		loginPage.selecTitle();
		loginPage.enterFristName();
		loginPage.enterLastName();
		loginPage.enterPassword();
		loginPage.dropDownDays();
		loginPage.dropDownMonths();
		loginPage.dropDownYears();
		loginPage.clicksNewsLetterCheckBox();
		loginPage.clicksSpcialOfferCheckBox();
		loginPage.clicksRegisterBtn();
	}

	@AfterMethod
	public void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
