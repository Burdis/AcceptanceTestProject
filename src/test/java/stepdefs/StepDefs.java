package stepdefs;

import com.sun.istack.internal.NotNull;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;


public class StepDefs {

    private static WebDriver driver = Driver.getDriver();
    private static WebDriverWait wait = new WebDriverWait(driver, 5);

    @Given("^test$")
    public void test() {

    }

}
