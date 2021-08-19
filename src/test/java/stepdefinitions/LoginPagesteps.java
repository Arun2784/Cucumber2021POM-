package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPagesteps {
	private static String title;
	private LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
	//private Driverfactory driverfatory = new Driverfactory();

	@Given("user is on login page")
	public void user_is_on_login_page() throws Throwable {

		Driverfactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("User gets the title of the Page")
	public void user_gets_the_title_of_the_Page() throws Throwable {
		title = loginPage.getLoginPageTitle();
		System.out.println("My login title is " + title);
	}

	// @Then("Page title should be {string}")
	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String ExpectedTitleName) {

		Assert.assertTrue(title.contains(ExpectedTitleName));

	}

	@Then("Forgot Password link should be displayed")
	public void forgot_Password_link_should_be_displayed() throws Throwable {
		Assert.assertTrue(loginPage.isForgotPwdLinExist());
	}

	// @When("User Enter UserName {string}")

	@When("^User Enter UserName \"([^\"]*)\"$")
	public void user_Enter_UserName(String username) {
		loginPage.enterUserName(username);

	}

	//@When("user Enter Password {string}")
	@When("^user Enter Password \"([^\"]*)\"$")
	public void user_Enter_Password(String passw) {
		loginPage.enterPassword(passw);
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_Login_Button() {

		loginPage.clickOnLogin();
	}

}
