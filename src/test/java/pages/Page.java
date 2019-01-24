package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    public String getTitle() {

        return "placeholder";
    }

    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void clickLink(final String linkID) {

    }

    public void enterBirthDate() {

    }

}
