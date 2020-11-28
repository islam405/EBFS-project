package com.ebfs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.LoginPageProperties;

public class LoginPage extends TestBase {
	@FindBy(id = LoginPageProperties.CREATE_ACCOUNT_EMAIL_TESTBOX_ID)
	WebElement cAEmailTextBox;
	@FindBy(id = LoginPageProperties.CREATE_ACCOUNT_BTN_NAME)
	WebElement createAccountBtn;
	@FindBy(id = LoginPageProperties.TITLE_MR_RATIO_ID)
	WebElement titleMrRatio;
	@FindBy(id = LoginPageProperties.TITLE_MRS_RATIO_ID)
	WebElement titleMrsRatio;
	@FindBy(id = LoginPageProperties.FIRST_NAME_TEXTBOX_ID)
	WebElement firstName;
	@FindBy(id = LoginPageProperties.LAST_NAME_TEXTBOX_ID)
	WebElement lastName;
	@FindBy(id = LoginPageProperties.EMAIL_TEXTBOX_ID)
	WebElement email;
	@FindBy(id = LoginPageProperties.PASSWORD_TEXTBOX_ID)
	WebElement password;
	@FindBy(id = LoginPageProperties.DATH_OF_BIRTH_DAYS_DROPDOWN_ID)
	WebElement days;
	@FindBy(id = LoginPageProperties.DATH_OF_BIRTH_MONTHS_DROPDOWN_ID)
	WebElement months;
	@FindBy(id = LoginPageProperties.DATH_OF_BIRTH_YEARS_DROPDOWN_ID)
	WebElement years;
	@FindBy(id = LoginPageProperties.NEWSLETTER_CHECKBOX_ID)
	WebElement newsLetter;
	@FindBy(id = LoginPageProperties.SPECIAL_OFFER_CHECKBOX_ID)
	WebElement specialOffer;
	@FindBy(id = LoginPageProperties.REGGISTER_BTN)
	WebElement register;
	@FindBy(id = LoginPageProperties.ALREADY_REG_EMAIL_TXTBOX_ID)
	WebElement AlreadyRegEmail;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail() {
		cAEmailTextBox.sendKeys("shika@gmail.com");
	}
		
		public void clickCreateAccountBtn() {
		createAccountBtn.click();
	
		}
		public void selecTitle() {
			titleMrRatio.click();
		}
		public void enterFristName() {
			firstName.sendKeys("nahar");
		}
		public void enterLastName() {
			lastName.sendKeys("Shikta");
		}
		public void enterPassword() {
			password.sendKeys("hhhkkkkk22");
			
		}
		public void dropDownDays() {
			Select select=new Select(days);
			select.selectByIndex(22);
			
		}
		public void dropDownMonths() {
			Select select=new Select(months);
			select.selectByValue("12");
			
		}
        public void dropDownYears() {
        	Select select=new Select(years);
			select.selectByValue("1991");
			
			
		}
        public void clicksNewsLetterCheckBox() {
        	newsLetter.click();
        }
        
        public void clicksSpcialOfferCheckBox() {
        	specialOffer.click();
        
        }
        
        
        public void clicksRegisterBtn() {
        	register.click();
        }
}
