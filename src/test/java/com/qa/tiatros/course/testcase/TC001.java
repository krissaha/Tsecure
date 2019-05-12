package com.qa.tiatros.course.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.tiatros.base.TestBase;
import com.qa.tiatros.pages.CourseDashboardPage;
import com.qa.tiatros.pages.Course_Sessions_page;
import com.qa.tiatros.pages.FinalExercise_T_Page;
import com.qa.tiatros.pages.PeerReviewPage;
import com.qa.tiatros.pages.PersonalCharacter_T_Page;
import com.qa.tiatros.pages.PsychoeducationLecture_T_Page;
import com.qa.tiatros.pages.SigninPage;
import com.qa.tiatros.pages.SignupPage;
import com.qa.tiatros.pages.TeamCheckIn_T_Page;
import com.qa.tiatros.util.CustomListener;

import Thread.ResilienceDiscussion_T_Page;

@Listeners(CustomListener.class)
public class TC001 extends TestBase {

	// Global object declairation

	SignupPage sp;
	SigninPage sgn;
	CourseDashboardPage cdp;
	Course_Sessions_page csp;
	TeamCheckIn_T_Page temp1;
	ResilienceDiscussion_T_Page temp2;
	PsychoeducationLecture_T_Page temp3;
	PersonalCharacter_T_Page temp4;
	FinalExercise_T_Page temp5;
	PeerReviewPage prp;

	public TC001() {
		super();
	}

	@BeforeMethod
	public void initobjects() throws Exception { // This Before Method will run always before any @Test.
		init();
		sp = new SignupPage();
		sgn = new SigninPage();
		cdp = new CourseDashboardPage();
		csp = new Course_Sessions_page();
		temp1 = new TeamCheckIn_T_Page();
		temp2 = new ResilienceDiscussion_T_Page();
		temp3 = new PsychoeducationLecture_T_Page();
		temp4 = new PersonalCharacter_T_Page();
		temp5 = new FinalExercise_T_Page();
		prp = new PeerReviewPage();
	}

	@Test(enabled = true)
	public void clickonsession1() throws Throwable {

		sgn = new SigninPage();
		sgn.verify_text12();
		cdp = sgn.signin_Course();
		Thread.sleep(3000);
		csp = cdp.click_on_course();
		//csp.clickOn_Session1();

////		// Session 1: Team checkIN
//		temp1 = csp.click_1();
//		temp1.verification_text20();
//		temp1.course_tour1();
//
//		// Session 1: Resilience Discussion
//		temp2 = csp.click_2();
//		temp2.verification_text21();
//		temp2.course_tour2();

//		// Session 1: Psychoeducation Lecture
//		temp3 = csp.click_3();
//		temp3.verification_text22();
//		temp3.course_tour3();

		// Session 1: Personal Character Test
		temp4 = csp.click_4();
		temp4.verification_text23();
		temp4.course_tour4();
		
		// Session 1: Final Excercise
		temp5 = csp.click_5();
		temp5.course_tour5();
		
		// Session 1: Peer Review 
		prp = csp.click_6();
		prp.peerReviewClick();
		csp.verify_complete_message();
		
	}
	
	@Test(enabled = false)
	public void clickonsession2() throws Throwable
	{
		sgn = new SigninPage();
		sgn.verify_text12();
		cdp = sgn.signin_Course();
		Thread.sleep(3000);
		csp = cdp.click_on_course();
		
//		// Session 2: Team checkIN
//		temp1 = csp.click_1();
//		temp1.verification_text20();
//		temp1.course_tour1();
//		
//		// Session 2: Resilience Discussion
//		temp2 = csp.click_2();
//		temp2.verification_text21();
//		temp2.course_tour2();
		
		// Session 2: Psychoeducation Lecture
		temp3 = csp.click_3();
		temp3.verification_text22();
		temp3.course_tour3();
		
		// Session 2: Final Excercise
		temp5 = csp.click_5();
		temp5.course_tour5();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() // This AfterMethod will run every time after any @Test
	{
		driver.quit();
	}
}