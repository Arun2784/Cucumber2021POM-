package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.Driverfactory;
import com.qa.util.ConfigReader;

import cucumber.api.java.Before;

public class Applicationshooks {

	private Driverfactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getproperty() {

		configReader = new ConfigReader();
		prop = configReader.initProp();

	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");

		driverfactory = new Driverfactory();
		driverfactory.init_driver(browserName);

	}

}
