package stepdefs;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import static org.junit.Assert.assertEquals;

public class StepDefs implements En{

    private static WebDriver driver = Driver.getDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 5);

    public StepDefs(){

        Given("^I go to my selected site$", () -> {

        });

        Then("^I will be on (.*)$", (String title) -> {

        });
    }
}
