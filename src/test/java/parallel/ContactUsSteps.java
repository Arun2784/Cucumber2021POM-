package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.Driverfactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

	private ContactUsPage contactusPage = new ContactUsPage(Driverfactory.getDriver());

	@Given("user navigates to contact us page")
	public void user_navigates_to_contact_us_page() {

		Driverfactory.getDriver().get("http://automationpractice.com/index.php?controller=contact");
	}

	@When("user fills the form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException, InterruptedException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader
				.getData("D:\\Automation\\POMPractice3\\src\\main\\java\\com\\excelData\\automation.xlsx", sheetName);
		String heading = testData.get(rowNumber).get("Subjectheading");
		String email = testData.get(rowNumber).get("email");
		String orderRef = testData.get(rowNumber).get("orderref");

		String mesg = testData.get(rowNumber).get("message");

		contactusPage.fillContactUsForm(heading, email, orderRef, mesg);

	}

	@Then("user clic on  send Button")
	public void user_clic_on_send_button() {
		contactusPage.clickSend();

	}

	@Then("it shows a successfull message {string}")
	public void it_shows_a_successfull_message(String ExpectedMsg) {
		String actualSuccessMsg = contactusPage.getSuccessMessg();
		Assert.assertEquals(actualSuccessMsg, ExpectedMsg);

	}
}
