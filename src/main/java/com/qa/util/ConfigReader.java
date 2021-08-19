package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties initProp() {

		prop = new Properties();
		try {
			FileInputStream fp = new FileInputStream("D:\\Automation\\POMPractice3\\src\\test\\resources\\config\\config.properties");
			prop.load(fp);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;

	}
}
