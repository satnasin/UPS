package com.userprofile.scholastic.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.BookwizardLoginPage;

public class BookwizardLoginTest
{
	@Test
	public void bookwizardLogin()
	{
		WebDriver driver = BaseSetup.startBrowser("chrome","http://www.scholastic.com/bookwizard/");
		BookwizardLoginPage lpage = PageFactory.initElements(driver, BookwizardLoginPage.class);
		lpage.clickGo();
		lpage.twait();
		driver.switchTo().frame("GB_frame");
		lpage.typeEmail("satsingh@gmail.com");
		lpage.typePassword("pass");
		lpage.clicksignIn();
		lpage.twait();
		if(lpage.checkSignout())
		{
			Assert.assertEquals(lpage.checkSignout(), true);
			Reporter.log("Login In successful");
		}
		else{
			 System.out.println("No Login");
			Reporter.log("Login not successful");
		}
	}
}
