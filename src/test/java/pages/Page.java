package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    public String getTitle() {
        return driver.getTitle();
    }

    public void getUrl(final String url) {
        driver.get(url);
    }

    public void clickLink(final String linkID) {
        WebElement getLink = driver.findElement(By.id(linkID));
        getLink.click();
    }
}
