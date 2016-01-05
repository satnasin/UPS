package com.userprofile.scholastic.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.InfinityRingHomePage;

public class InfinityRingRegistrationtest
{
	
	@Test
	public void clickSignin()
	{
		WebDriver driver = BaseSetup.startBrowser("firefox", "http://infinityring.scholastic.com/#");
		InfinityRingHomePage home_page = PageFactory.initElements(driver, InfinityRingHomePage.class);
		home_page.clicksigninLink();
		home_page.twait();
		String text_loginPopUp=home_page.gettextSigninWindow();		
		System.out.println(text_loginPopUp+"<<<<<>>>>>>");
		Assert.assertEquals(text_loginPopUp, "Enter your username and password");
		home_page.clickRegisterLink();
		home_page.twait();		
		home_page.selectCategory1();
		home_page.twait();
		home_page.selectWord1();
		home_page.twait();
		home_page.selectCategory2();
		home_page.twait();
		home_page.selectWord2();
		home_page.twait();
		String text_registrationUserName = home_page.getTextforuserName();
		System.out.println("RegisterUserNameCreated"+text_registrationUserName);
		home_page.twait();
		home_page.typePwd();
		home_page.typeconfirmPwd();
		home_page.typeEmail();
		home_page.typeconfirmEmail();
		home_page.clickJoin();
		home_page.twait();
		String oButtonAddBook = home_page.checkbuttonAddBook();
		System.out.println("AddBookButton "+oButtonAddBook);
		home_page.clickbuttonDone();
		home_page.twait();
		String oSignOutLink = home_page.checkSignOut();
		System.out.println("SignOut Link present "+oSignOutLink);
		BaseSetup.WebDriversetOff();
		
		
	}
	
	

}
