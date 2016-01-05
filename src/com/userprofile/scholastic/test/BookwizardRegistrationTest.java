package com.userprofile.scholastic.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.BookwizardRegistrationPage;


public class BookwizardRegistrationTest 
{

	@Test
	public void teacherRegistration()
	{
		WebDriver driver = BaseSetup.startBrowser("chrome","http://www.scholastic.com/bookwizard/");
		BookwizardRegistrationPage regTeacher = PageFactory.initElements(driver, BookwizardRegistrationPage.class);
		regTeacher.clickRegister();
		regTeacher.twait();
		driver.switchTo().frame("GB_frame");
		regTeacher.twait();		
		regTeacher.regNow();
		regTeacher.selectTitle();
		regTeacher.typeFirstName();
		regTeacher.typeLastName();
		regTeacher.typeEmail();
		regTeacher.typeCnfEmail();
		regTeacher.typePass();
		regTeacher.typeCpass();
		regTeacher.clickContinue();
		regTeacher.twait();
		regTeacher.selectState();
		regTeacher.twait();
		regTeacher.selectCity();
		regTeacher.twait();
		regTeacher.selectSchoolList();
		regTeacher.tickTerms();
		regTeacher.tickPrivacy();
		regTeacher.clickContinue();
		regTeacher.selectTeacherRole();
		regTeacher.clickContinue();
		regTeacher.twait();
		regTeacher.clickContinue();
		regTeacher.twait();
		regTeacher.closeRegistration();
	
	
	
	
	
	
	
	}	
	
}
