package com.saphire.test.smoke;

import org.testng.annotations.Test;

import com.saphire.test.config.TestConfiguration;
import com.saphire.ui.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestLoginUser115 {
	WebDriver driver;
	LoginPage login;
  @Test
  public void f() throws Exception {
	  login.loadLoginPage();
	  login.getUserName().sendKeys("butunkp09@gmail.com");
	  login.getLoginButton().click();
	  Thread.sleep(1000);
	  login.getPassword().sendKeys("8895293768");
	  login.getLoginButton().click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=TestConfiguration.createDriverInstance();
	  login=new LoginPage(driver);
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(2000);
	  driver.close();
  }

}
