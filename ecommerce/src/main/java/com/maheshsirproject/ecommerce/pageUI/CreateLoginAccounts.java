package com.maheshsirproject.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maheshsirproject.ecommerce.basepage.BasePage;


public class CreateLoginAccounts extends BasePage{
	
	public static final Logger log=Logger.getLogger(CreateLoginAccounts.class.getName());

	@FindBy(linkText="Sign in") WebElement linkSignIN;
	@FindBy(id="email_create") WebElement txtEmailID;
	@FindBy(id="SubmitCreate") WebElement btnCreateAnAccount;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement txtCreateAnAccount;
	@FindBy(id="id_gender1") WebElement radioMr;
	@FindBy(id="customer_firstname") WebElement txtFirstName;
	@FindBy(id="customer_lastname") WebElement txtLastName;
	@FindBy(id="passwd") WebElement txtPassword;
	@FindBy(id="days") WebElement dropDownDays;
	@FindBy(id="months") WebElement dropDownMonth;
	@FindBy(id="years") WebElement dropDownYears;
	@FindBy(id="address1") WebElement txtAddress1;
	@FindBy(id="city")WebElement txtCity;
	@FindBy(id="id_state")WebElement dropdownState;
	@FindBy(id="postcode")WebElement txtZipCode;
	@FindBy(id="id_country")WebElement dropdownCountry;
	@FindBy(id="phone_mobile")WebElement txtMobile;
	@FindBy(id="alias")WebElement txtAliasAddress;
	@FindBy(id="submitAccount")WebElement btnRegister;
	@FindBy(xpath="//h1[text()='My account']")WebElement txtMyAccount;
	@FindBy(linkText="Sign out")WebElement linkSignOut;
	
	public CreateLoginAccounts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void createAccount() throws Exception {
		linkSignIN.click();
		log.info("Clicked on Sign IN button with object:"+linkSignIN.toString());
		txtEmailID.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainname"));
		log.info("Entering Email ID:"+txtEmailID.getAttribute("value")+"using object:"+txtEmailID.toString());
		btnCreateAnAccount.click();
		log.info("Clicking on Create an account:"+btnCreateAnAccount.toString());
		Thread.sleep(8000);
		assertEquals(txtCreateAnAccount.getText(), "CREATE AN ACCOUNT");
		log.info("Verifying customer info page by using object"+txtCreateAnAccount.toString());
		radioMr.click();
		log.info("Clicking on Mr radio button by using object:"+radioMr.toString());
		txtFirstName.sendKeys("Mahesh");
		log.info("Entering first name by using object :" + txtFirstName.toString());
		txtLastName.sendKeys("D");
		log.info("Entering last name by using object :" + txtLastName.toString());
		txtPassword.sendKeys("abc@123");
		log.info("Entering password by using object :" + txtPassword.toString());
		selectOption(dropDownDays, 3);
		log.info("Selected a day by using object :" + dropDownDays.toString());
		selectOption(dropDownMonth, 3);
		log.info("Selected a month by using object :" + dropDownMonth.toString());
		selectOption(dropDownYears, 3);
		log.info("Selected a year by using object :" + dropDownYears.toString());
		txtAddress1.sendKeys(getData("address1"));
		log.info("Entering address by using object :" + txtAddress1.toString());
		txtCity.sendKeys(getData("city"));
		log.info("Entering state by using object :" + txtCity.toString());
		selectOption(dropdownState, 3);
		log.info("Selected a state by using object :" + dropdownState.toString());
		txtZipCode.sendKeys("12345");
		log.info("Entering zipcode by using object :" + txtZipCode.toString());
		selectOption(dropdownCountry, 1);
		log.info("Selected a country by using object :" + dropdownCountry.toString());
		txtMobile.sendKeys("9876543212");
		log.info("Entering mobile number by using object :" + txtMobile.toString());
		txtAliasAddress.sendKeys("UP");
		log.info("Entering aliasing Address by using object :" + txtAliasAddress.toString());
		btnRegister.click();
		log.info("Clicking on Register :" + btnRegister.toString());
		Thread.sleep(5000);
		assertEquals(txtMyAccount.getText(), "MY ACCOUNT");
		log.info("Verified My account page by using object :" +txtMyAccount.toString()); 
		linkSignOut.click();
		log.info("Clicked on SignOut button with object : " + linkSignOut.toString());
	}
}
