package com.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pages.GetQuote;
import com.qa.Pages.SelectAutoPage;
import com.qa.TestBase.TestBase;

public class SelectAutoTestCase extends TestBase{

	SelectAutoPage obj1;
	GetQuote obj2;
	public SelectAutoTestCase(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		obj1 = new SelectAutoPage();	
	}
	
//	@Test(priority=1)
//	public void loginPageTitleTest(){
//		String title = SelectAutoPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "Progressive: Ranked One Of The Best Insurance Companies | Progressive");
//	}
//	
//	@Test(priority=2)
//	public void crmLogoImageTest(){
//		boolean flag = SelectAutoPage.validateImage();
//		Assert.assertTrue(flag);
//	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		SelectAutoPage.logintoGetQuote();
		Thread.sleep(5000);
//		WebDriverWait wait= new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("NameAndAddressFormModel_FirstName_Value")));
//		driver.findElement(By.id("NameAndAddressFormModel_FirstName_Value")).sendKeys("Vinay");
	}
	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
//	
	
}
