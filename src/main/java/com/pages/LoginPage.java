package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators
	private By emailid = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By ForgotPwdLink = By.linkText("Forgot your password?");

	// 2. Constructor pof the Page class

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// 3. Page Actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinExist() {
		return driver.findElement(ForgotPwdLink).isDisplayed();

	}

	public void enterUserName(String userName) {
		driver.findElement(emailid).sendKeys(userName);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

}
