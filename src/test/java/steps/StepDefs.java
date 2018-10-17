package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import pages.Page;

import static io.restassured.RestAssured.given;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) -> getUrl(url));

        Then("I should be on my selected page", () ->
                Assert.assertEquals(getTitle(),"Check if you have to pay for prescriptions"));

        When("^I click on the link (.*)$", (final String link) -> clickLink(link));

        And("I should be on the next page", () ->
                Assert.assertEquals(getTitle(), "What is your date of birth?"));

        When("I enter my birth date", () -> enterBirthDate());
    }

    private int code;

    @Given("^stepdef 1$")
    public void iGoTo(final String url) {
        getUrl(url);
    }

    @Then("^stepdef 2$")
    public void iWillBeOn(final String currentPage) {
        Assert.assertEquals(getTitle(), currentPage);
    }

    @Then("^stepdef 3$")
    public void iClickOnTheLink() {
        clickLink("gb_P");
    }

    @Then("^stepdef 4$")
    public void iSendTheJson() {
        final Response response;
        final String url = "test";
        final JSONObject json = new JSONObject("{\"test\":\"test\"}");

        response = given().body(json).post(url);

        code = response.getStatusCode();

        Assert.assertEquals(200, code);
    }
}
