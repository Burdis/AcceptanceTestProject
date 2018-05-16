package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Page;

public class StepDefs {

    private Page page;

    @Given("^I go to (.*)$")
    public void iGoTo(final String url) {
        page.getUrl(url);
    }

    @Then("I will be on (.*)$")
    public void iWillBeOn(final String currentPage) {
        Assert.assertEquals(page.getTitle(), currentPage);
    }

    @Then("I click on the link")
    public void iClickOnTheLink() {
        page.clickLink("linkId");
    }

}
