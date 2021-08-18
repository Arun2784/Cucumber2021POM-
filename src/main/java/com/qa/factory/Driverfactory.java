package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

	/**
	 * This method is use to initlialize the threadlocal driver on the basis of
	 * given browser
	 * 
	 * @param browser
	 * @return this will return tldriver
	 */
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is " + browser);

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());

		} else {

			System.out.println("Please Pass the correct browser Value");
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	/**
	 * This is used to get the driver with Threadlocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {

		return tldriver.get();

	}

}
