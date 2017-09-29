package stepdefs;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import static org.junit.Assert.assertEquals;

public class StepDefs implements En{

    private WebDriver driver = Driver.getDriver();

    public StepDefs(){

        Given("^I go to (.*)$", (String url) -> {
            driver.navigate().to("https://" + url + ".co.uk/");
        });

        Then("^I will be on (.*)$", (String title) -> {
            String titleBrowser = driver.getTitle();
            assertEquals(title , titleBrowser);
        });

        Then("^I will click on (.*)$", (String title) -> {
            WebElement titleBrowser = driver.findElement(By.linkText("Gmail"));
            titleBrowser.click();
        });
    }
}
