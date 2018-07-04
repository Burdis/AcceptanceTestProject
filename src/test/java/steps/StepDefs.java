package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Page;

public class StepDefs extends Page {

    @Given("^I go to (.*)$")
    public void iGoTo(final String url) {
        getUrl(url);
    }

    @Then("I will be on (.*)$")
    public void iWillBeOn(final String currentPage) {
        Assert.assertEquals(getTitle(), currentPage);
    }

    @Then("I click on the link")
    public void iClickOnTheLink() {
        clickLink("gb_P");
    }

}
