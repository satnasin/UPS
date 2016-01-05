package com.userprofile.scholastic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunityLoginPage 
{
	WebDriver driver;
	
	public CommunityLoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}

	@FindBy(xpath=".//*[@id='schl3o']/div/div[4]/div[2]/div/div[2]/div[4]/span[1]/a")
	WebElement signLink;
	@FindBy(xpath="//div[@id='kids_registration_target']/div/form/p[1]/input")
	WebElement ScreenName;
	@FindBy(xpath="//div[@id='kids_registration_target']/div/form/p[2]/input")
	WebElement Pass;
	@FindBy(xpath="//div[@id='kids_registration_target']/div/form/div/input")
	WebElement Go;
	@FindBy(xpath="//div[@id='kids_registration_popup_container']/div/div/div[1]/h1")
	WebElement loginPopup;
	
	
	public void clickSignIn()
	{
		signLink.click();
		
	}

	
	public void typeUname()
	{
		ScreenName.sendKeys("bikingchasing710");
		
	}
	
	
	public void typePassword()
	{
		Pass.sendKeys("pass");
	}
	
	public void clickGo()
	{
		Go.click();
	}
	
	public String  checkSignInNowPopUp()
	{
		String text_loginPopup= loginPopup.getText();
		return text_loginPopup;
		
	}
}
