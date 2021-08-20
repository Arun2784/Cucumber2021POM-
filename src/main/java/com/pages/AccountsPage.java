package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;

	// 1. By locators
	private By Accountsections = By.cssSelector("div#center_column span");

//2. Constructor	
	public AccountsPage(WebDriver driver) {

		this.driver = driver;

	}

	// 3. Page Actions
	
	public String  getAcountsPageTitle() {
		return driver.getTitle();
		
		
		
	}

	public int getAccountsSectionCount() {

		return driver.findElements(Accountsections).size();
	}

	public List<String> getAcountsSectionsList() {
		List<String> accountlist = new ArrayList<>();
		List<WebElement> accountHeaderlist = driver.findElements(Accountsections);

		for (WebElement e : accountHeaderlist) {

			String text = e.getText();
			System.out.println(text);
			accountlist.add(text);

		}
		return accountlist;

	}

}
