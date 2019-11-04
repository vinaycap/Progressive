package com.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Pages.GetQuote;
import com.qa.Pages.SelectAutoPage;
import com.qa.TestBase.TestBase;
import com.qa.Utility.TestUtil;

public class GetQuoteTestCase extends TestBase{

	SelectAutoPage obj1;
	GetQuote obj2;
	public GetQuoteTestCase(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		obj1 = new SelectAutoPage();	
		SelectAutoPage.logintoGetQuote();
		Thread.sleep(5000);
	}
	
	@DataProvider
	public Object[][] logindata() {
		Object data[][]= TestUtil.getTestData("Sheet1");
		return data;
	}
	
	
	
	
	@Test(dataProvider="logindata")
	public void loginTest(String FirstName,String LastName,String DOB,String Street,String City) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_FirstName_Value']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_LastName_Value']")).sendKeys(LastName);
		driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_DateOfBirth_Value']")).sendKeys(DOB);
		driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_MailingAddress_Value']")).sendKeys(Street);
		driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_City_Value']")).sendKeys(City);
	}
	
//	@AfterMethod
//	public void close() {
//		driver.quit();
//	}
	
}
