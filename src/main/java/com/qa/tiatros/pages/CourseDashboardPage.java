package com.qa.tiatros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.qa.tiatros.base.TestBase;
import com.qa.tiatros.util.UtilTest;

public class CourseDashboardPage extends TestBase {

	// Page factory - OR

	@FindBy(xpath = "//div[@class='modal-content animated bounceInRight']//div[3]//following::button[@type='button'and contains(text(),'OK')][2]")
	WebElement ok_button;
	//div[@class='modal-content animated bounceInRight']//div[3]//following::button[@type='button'and contains(text(),'OK')][2]
	
	
	@FindBy(xpath = "//div[@class='row wrapper border-bottom white-bg page-heading']/div//li[2]//strong[contains(text(),'course')][2]")
	WebElement verification_text18;

	@FindBy(xpath = "//h2[contains(text(),'Current Program')]")
	WebElement verification_text19;

	@FindBy(xpath = "//div[@class='col-lg-11 pull-center dashboard-new']/div[1]/ul/li[@id='dashboard']")
	WebElement dashboard;

	@FindBy(xpath = "//div[@class='col-lg-11 pull-center dashboard-new']/div[1]/ul/li[@id='course']")
	WebElement course;

	@FindBy(xpath = "//div[@class='col-lg-11 pull-center dashboard-new']/div[1]/ul/li[@id='conversations']")
	WebElement peer;

	@FindBy(xpath = "//div[@class='col-lg-11 pull-center dashboard-new']/div[1]/ul/li[@id='moments']")
	WebElement joymoments;

	@FindBy(xpath = "//div[@class='col-lg-11 pull-center dashboard-new']/div[1]/ul/li[@id='members']")
	WebElement mygroup;
	
	@FindBy(xpath = "//div[@class='i-checks clearfix accept-9']/div/ins[@class='iCheck-helper']")
	WebElement scale_click;
	
	@FindBy(xpath = "//div[@class='modal-footer']/div/input[@id='btn_cancel']")
	WebElement cancel;

	// Initializing the page object

	public CourseDashboardPage() {
		PageFactory.initElements(driver, this);
	}

	// All Verifications and Validations

//	public void verify_text19() {
//		boolean vt = verification_text19.isDisplayed();
//		Assert.assertEquals(vt, true);
//	}
//
//	public void verify_text18() {
//		boolean vt = verification_text18.isDisplayed();
//		Assert.assertEquals(vt, true);
//	}

	// Business Component

	public Course_Sessions_page click_on_course() throws Throwable {

		if ( equals(ok_button) == true) {
			Thread.sleep(5000);
			UtilTest.element_click(driver, ok_button);
			Thread.sleep(3000);
			boolean vt = verification_text19.isDisplayed();
			Assert.assertEquals(vt, true);
			boolean vt1 = verification_text18.isDisplayed();
			Assert.assertEquals(vt1, true);
			UtilTest.element_click(driver, course);
			return new Course_Sessions_page();
		} else {
			// UtilTest.element_click(driver, ok_button);
			Thread.sleep(3000);
			boolean vt = verification_text19.isDisplayed();
			Assert.assertEquals(vt, true);
			boolean vt1 = verification_text18.isDisplayed();
			Assert.assertEquals(vt1, true);
			UtilTest.element_click(driver, course);
			return new Course_Sessions_page();
		}
	}
}