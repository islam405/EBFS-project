package com.ebfs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.HomePageProperties;

public class HomePage extends TestBase {

	@FindBy(xpath = HomePageProperties.IMG_LOGO_XPATH)
	@CacheLookup
	WebElement logo;

	@FindBy(xpath = HomePageProperties.LNK_CONTACT_US_XPATH)
	WebElement contactsLink;
	@FindBy(xpath = HomePageProperties.SING_IN_BTN_XPATH)
	WebElement signInBtn;
	

	// Initializing the Page Objects:for this page
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyLogoDisplayed(){
		return logo.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage();
	}
	
	public void clickSignInBtn() {
		signInBtn.click();
	}
	
}
