package com.userprofile.scholastic.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.CommunityLoginPage;

public class CommunityLoginTest 
{
	@Test
	public void checkValidUser()
	{
		WebDriver driver = BaseSetup.startBrowser("firefox", "http://community.scholastic.com/");
		CommunityLoginPage login_page = PageFactory.initElements(driver, CommunityLoginPage.class);
		login_page.clickSignIn();
		String text_loginPopUp=login_page.checkSignInNowPopUp();				
		Assert.assertEquals("Sign in now.", text_loginPopUp);
		System.out.println("******"+text_loginPopUp);
		login_page.typeUname();
		login_page.typePassword();
		login_page.clickGo();
		BaseSetup.WebDriversetOff();
		
	}
		
	
	

}
