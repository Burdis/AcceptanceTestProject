package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import pages.Page;

import static io.restassured.RestAssured.given;

public class StepDefs extends Page {

    private int code;

    @Given("^I go to (.*)$")
    public void iGoTo(final String url) {
        getUrl(url);
    }

    @Then("^I will be on (.*)$")
    public void iWillBeOn(final String currentPage) {
        Assert.assertEquals(getTitle(), currentPage);
    }

    @Then("^I click on the link$")
    public void iClickOnTheLink() {
        clickLink("gb_P");
    }

    @Then("^I send json to an endpoint$")
    public void iSendTheJson() {
        final Response response;
        final String url = "test";
        final JSONObject json = new JSONObject("{\"test\":\"test\"}");

        response = given().body(json).post(url);

        code = response.getStatusCode();

        Assert.assertEquals(200, code);
    }
}
