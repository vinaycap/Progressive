package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class SelectAutoPage extends TestBase{

	@FindBy(xpath="//*[@id='main']/div[1]/div/div/div[2]/div[1]/ul/li[1]/a/p")
	static WebElement AutoOption;
	
	@FindBy(xpath="//*[@id=\"logo\"]")
	static WebElement logo;
	
	@FindBy(xpath="//input[@id='zipCode_overlay']")
	static WebElement Zipcodeenter;
	
	
	@FindBy(xpath="//*[@id=\"qsButton_overlay\"]")
	static WebElement GetaQuotebutton;
	
	public SelectAutoPage(){
		PageFactory.initElements(driver, this);
	}
	
	public static String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public static boolean validateImage(){
		return logo.isDisplayed();
	}
	
	public static GetQuote logintoGetQuote() throws InterruptedException {
		Thread.sleep(5000);
		AutoOption.click();
		Thread.sleep(5000);
		Zipcodeenter.sendKeys("44321");
		GetaQuotebutton.click();
	Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement element = wait.until(
//	ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='NameAndAddressFormModel_FirstName_Value']")));
//	driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_LastName_Value']")).sendKeys("vinay");
	//	WebElement firstn= driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_LastName_Value_Label']"));
	//	JavascriptExecutor jse = (JavascriptExecutor)driver;

	//	driver.switchTo().defaultContent();
//jse.executeScript("document.getElementById('NameAndAddressFormModel_LastName_Value_Label').value='Vinay';");
//jse.executeScript("document.getElementById('NameAndAddressFormModel_LastName_Value_Label').setAttribute('value', 'Vinay')");
	//	((JavascriptExecutor) driver).executeScript("arguments[0].value='Vinay';", firstn);
	//String text= 	driver.findElement(By.xpath("//*[@id='NameAndAddressFormModel_LastName_Value_Label']")).getText();
	//System.out.println(text);
		
		return new GetQuote();
		
	}
	
	
}
