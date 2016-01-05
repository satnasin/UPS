package com.userprofile.scholastic.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseSetup;
import com.userprofile.scholastic.pages.Read1000Page;

public class Read1000PageTest
{
	@Test
	public void parentRegistration()
	{
		WebDriver driver = BaseSetup.startBrowser("firefox","http://www.scholastic.com/ups/campaigns/minutes-2015");
		Read1000Page read1000 = PageFactory.initElements(driver, Read1000Page.class);
		read1000.clickparentGo();
		read1000.typeDOB();
		read1000.clickSubmit();
		String url = read1000.verifyParentPage();
		if(url.equals("http://www.scholastic.com/ups/campaigns/minutes-2015/parent"))
		{
			Reporter.log("Parent Page is dispalyed", true);
		}else
		{
			Reporter.log("Parent Page is not displayed" + url, true);
		}

		
		
		
	}
}
