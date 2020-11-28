package com.ebfs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.ContactsPageProperties;

public class ContactsPage extends TestBase {

	@FindBy(xpath = ContactsPageProperties.LBL_CONTACT_US_XPATH)
	WebElement contactsLabel;
	
	@FindBy(id=ContactsPageProperties.SUBJECT_HEADING_ID)
	WebElement subjectHeading;
	
	@FindBy(id=ContactsPageProperties.EMAIL_ADDRESS_ID)
	WebElement emailTextBox;
	
	@FindBy(id=ContactsPageProperties.ORDER_REFFERRENCE_ID)
	WebElement orderReferenceTextBox;
	
	@FindBy(id =ContactsPageProperties.TEXT_FILE_UPLOAD_ID)
	WebElement textFileUpload;
	@FindBy(id =ContactsPageProperties.SEND_BTN_ID)
	WebElement sendBtn;
	
	
	//TO-DO: Add all the Missing WebElement in the Contact Us page
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectSubjectHeadingByVisibleText(String text){
		Select select = new Select(subjectHeading);
		select.selectByVisibleText(text);
	}
	
	public void enterEmail() {
		enterText(emailTextBox,"shikta@gmail.com");
	}
	public void enterOrderReferance() {
		enterText(orderReferenceTextBox," shgdghj");
		
	}
	public void clickSendBtn() {
		sendBtn.click();
		
	}
	
	//TO-DO: Add all the Missing Action in the Contact Us page
	
	
	
	

}
