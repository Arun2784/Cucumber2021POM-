package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.Driverfactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPagesteps {

	private LoginPage loginPage = new LoginPage(Driverfactory.getDriver());

	@Given("user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		
		Driverfactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("User gets the title of the Page$")
	public void user_gets_the_title_of_the_Page() throws Throwable {

	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitleName) {

		String title = loginPage.getLoginPageTitle();

		System.out.println("My login title is " + title);

		Assert.assertTrue(title.contains(ExpectedTitleName));

	}

	@Given("user is on Login page$")
	public void user_is_on_Login_page_for_passwordChanges() throws Throwable {

	}

	@Then("Forgot Password link should be displayed$")
	public void forgot_Password_link_should_be_displayed() throws Throwable {

	}

	@Given("^User is on Login page$")
	public void user_is_on_Login_page_for_Login() throws Throwable {

	}

	@When("User Enter UserName \"([^\"]*)\"$")
	public void user_Enter_UserName(String arg1) throws Throwable {

	}

	@When("user Enter Password \"([^\"]*)\"$")
	public void user_Enter_Password(String arg1) throws Throwable {

	}

	@When("user clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {

	}

	@Then("^User gets the title of the home Page$")
	public void user_gets_the_title_of_the_home_Page() throws Throwable {

	}

}
