package com.qa.tiatros.testcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationT 
{
	WebDriver driver;
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","/Users/krishnendu/Selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().deleteAllCookies();
//        driver.get("https://cbtfuture.tiatros.com/users/registration");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test(enabled=false)
	public void registration() throws InterruptedException, IOException
	{
		driver.get("https://cbtfuture.tiatros.com/users/registration");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign Up")).click();
        // Signup details
        driver.findElement(By.id("user_first_name")).sendKeys("Krishnendu");
        driver.findElement(By.id("user_last_name")).sendKeys("Saha");
        driver.findElement(By.id("user_email")).sendKeys("krishnendu+31@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("Pass123!");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Terms of Use')]"));
        js.executeScript("arguments[0].scrollIntoView();",Element);

        driver.findElement(By.id("sign_up_token")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
        Thread.sleep(3000);

        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        WebElement Element1 = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]"));
        js.executeScript("arguments[0].scrollIntoView();",Element1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("register")).click();
        Thread.sleep(5000);

        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
        String pin;
        System.out.println("Please Enter Pin :- ");
        pin =br.readLine();
        System.out.println("Entered Pin is ::-" + pin);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//input[@id='user_pin']")).sendKeys(pin);
        driver.findElement(By.xpath("//input[@id='verify_pin_link']")).click();
        driver.findElement(By.xpath("//*[@id='goal_msg']/div/div/div[3]/button")).click();
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(3000);

        Select os = new Select(driver.findElement(By.id("date_month")));
        os.selectByValue("1");
        Select os1 = new Select(driver.findElement(By.id("date_day")));
        os1.selectByValue("1");
        Select os2 = new Select(driver.findElement(By.id("date_year")));
        os2.selectByValue("2014");
        Select os4 = new Select(driver.findElement(By.id("user_gender")));
        os4.selectByValue("Male");
        driver.findElement(By.id("zip_code")).sendKeys("90089");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
        driver.findElement(By.id("submit_profile")).click();   
   	}
	
	@Test(enabled=false)
	public void signin_LowMoods() throws InterruptedException
	{
		driver.get("https://cbtfuture.tiatros.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(2000);    
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary ripple-effect btn-rounded']")).click();
        driver.findElement(By.id("user_email")).sendKeys("dipanjan.chakraborty+mp5@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("1Pass@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        
//    ==========================  Low Moods Personal Assessment ====================

      driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div[1]/div/div[2]/div[2]/a")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[2]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[3]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[4]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[5]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[6]/div/div/div[1]/label/div/ins")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[7]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[8]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[9]/div/div/div[1]/label/div/ins")).click();
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[1]/div[10]/div/div/div[1]/label/div/ins")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div[2]/div/div/div/div[1]/label/div/ins")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test(enabled=true)
	public void signin_videoCode() throws InterruptedException
	{
		driver.get("https://cbtfuture.tiatros.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(2000);    
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary ripple-effect btn-rounded']")).click();
        driver.findElement(By.id("user_email")).sendKeys("krishnendu+33@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("q1w2e3R$");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//span[@class='nav-label' and contains(text(),'View and Sign Your Group Participation Pledge')]")).click();
        driver.findElement(By.xpath("//div[@class='row nw-provider-dashboard']//following::div[@class='col-lg-4'][2]//div[2]//"
        		+ "div[@class='col-xs-12 text-center dash-middle-btn']//a[@class='btn btn-primary-blue btn-md btn-block p-sm']")).click();
        
        
        Thread.sleep(7000);
        driver.findElement(By.xpath("//video[@id='video1']")).click();
        Thread.sleep(160000);
        driver.findElement(By.xpath("//input[@id='user_pledge']")).sendKeys("Test Data");
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement Element1 = driver.findElement(By.xpath("//button[@id='pledge_accept_btn']"));
        js.executeScript("arguments[0].scrollIntoView();",Element1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='pledge_accept_btn']")).click();
		
	}
	
	@Test(enabled=false)
	public void signin_StressInventory() throws InterruptedException
	{
		driver.get("https://cbtfuture.tiatros.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(2000);    
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary ripple-effect btn-rounded']")).click();
        driver.findElement(By.id("user_email")).sendKeys("dipanjan.chakraborty+mp5@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("1Pass@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div[3]/div/div[2]/div[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='checkbox_418']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='checkbox_446']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='checkbox_465']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='checkbox_478']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test(enabled=false)
	public void signin_interstingfacts() throws InterruptedException
	{
		driver.get("https://cbtfuture.tiatros.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(2000);    
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary ripple-effect btn-rounded']")).click();
        driver.findElement(By.id("user_email")).sendKeys("dipanjan.chakraborty+mp5@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("1Pass@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.findElement(By.xpath("//span[text()='Tell the facilitator a couple intersting facts about you']")).click();
        driver.findElement(By.xpath("//textarea[@id='user_fact_response']")).sendKeys("Test Data !!!!!");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test(enabled=false)
	public void signin_PhysicalHealth() throws InterruptedException
	{
		driver.get("https://cbtfuture.tiatros.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(2000);    
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary ripple-effect btn-rounded']")).click();
        driver.findElement(By.id("user_email")).sendKeys("dipanjan.chakraborty+mp5@tiatros.com");
        driver.findElement(By.id("user_password")).sendKeys("1Pass@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div[2]/div[1]/div/div[2]/div[4]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[2]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[3]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[4]/div/div/div[1]/label/div/ins")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[5]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[6]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[7]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[8]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[9]/div/div/div[1]/label/div/ins")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[10]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[11]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[12]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[13]/div/div/div[1]/label/div/ins")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[14]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[15]/div/div/div[1]/label/div/ins")).click();
        driver.findElement(By.xpath("//*[@id='form_submit']/div[1]/div/div/div[16]/div/div/div[1]/label/div/ins")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}
