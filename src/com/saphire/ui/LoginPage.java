package com.saphire.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	public void loadLoginPage(){
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bdf4dc")));
	}
	public WebElement getUserName(){
		return driver.findElement(By.id("identifierId"));
	}
	public WebElement getPassword(){
		return driver.findElement(By.name("password"));
	}
	public WebElement getLoginButton(){
		return driver.findElement(By.xpath("//span[text()='Next']"));
	}
	
}
