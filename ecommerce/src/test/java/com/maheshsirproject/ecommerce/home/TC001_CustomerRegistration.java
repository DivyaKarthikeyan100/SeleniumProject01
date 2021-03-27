package com.maheshsirproject.ecommerce.home;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.maheshsirproject.ecommerce.basepage.BasePage;
import com.maheshsirproject.ecommerce.pageUI.CreateLoginAccounts;

public class TC001_CustomerRegistration extends BasePage 
{

	public static final Logger log = Logger.getLogger(TC001_CustomerRegistration.class.getName());

	@BeforeClass
	public void beforeTest() throws Exception 
	{
		browserLaunch(getData("browser"), getData("url"));
	}
	
	
	@Test
	public void customerRegistration() throws Exception 
	{
		log.info("****Starting TC001_Customer Registration****");
		CreateLoginAccounts login = new CreateLoginAccounts(driver);
		login.createAccount();
		log.info("****End of TC001_Customer Registration****");
	}

	@Test
	public void verifyLogin() {
		System.out.println("verifyLogin");
	}

	

	@AfterClass
	public void endTest() 
	{
		closeBrowser();
	}

	private void closeBrowser()
	{
		driver.quit();
		extent.endTest(test);
		extent.flush();
		

	}
}
