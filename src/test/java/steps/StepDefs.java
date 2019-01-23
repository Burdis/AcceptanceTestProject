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
        Given("I go to url (.*)$", (final String url) -> {});

        Then("I should be on my selected page", () ->{});

        When("^I click on the link (.*)$", (final String link) -> {});

        And("I should be on the next page", () -> {});

        When("I enter my birth date", () -> {});
    }

}
