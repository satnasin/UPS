package com.userprofile.scholastic.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.InfinityRingHomePage;

public class InfinityRingLoginTest {
	@Test
	public void logintoApp()
	{
		WebDriver driver = BaseSetup.startBrowser("firefox", "http://infinityring.scholastic.com/#");
		InfinityRingHomePage home_page = PageFactory.initElements(driver, InfinityRingHomePage.class);
		home_page.clicksigninLink();
		home_page.twait();
		String text_loginPopUp=home_page.gettextSigninWindow();		
		System.out.println(text_loginPopUp+"<<<<<>>>>>>");
		Assert.assertEquals(text_loginPopUp, "Enter your username and password");
		home_page.typeuserName("bikingarriving1599");
		home_page.typepassWord("password");
		home_page.clickSignIn();
		home_page.twait();
		String oSignOutLink = home_page.checkSignOut();
		System.out.println("SignOut Link present "+oSignOutLink);
		BaseSetup.WebDriversetOff();
	}
	
	

}
