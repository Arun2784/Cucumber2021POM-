package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.Driverfactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {

	private LoginPage loginPage = new LoginPage(Driverfactory.getDriver());

	private AccountsPage accountsPage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credtable) {

		List<Map<String, String>> credList = credtable.asMaps();

		String UserName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		Driverfactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		accountsPage = loginPage.doLogin(UserName, password);
	}

	@Given("user is on Accounts Page")
	public void user_is_on_accounts_page() {

		String title = accountsPage.getAcountsPageTitle();

		System.out.println("Accounts page title is: " + title);

	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionTable) {
		List<String> expAccountSectionList = sectionTable.asList();
		System.out.println("Expected Account Section List: " + expAccountSectionList);
		List<String> actualAccountSectionList = accountsPage.getAcountsSectionsList();
		System.out.println("Actual Account Section List: " + actualAccountSectionList);

		Assert.assertTrue(expAccountSectionList.containsAll(actualAccountSectionList));

	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSectionCount) {
		Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedSectionCount);

	}

}
