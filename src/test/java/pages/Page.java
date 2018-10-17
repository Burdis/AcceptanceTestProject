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
        WebElement getLink = driver.findElement(By.className(linkID));
        getLink.click();
    }

    public void enterBirthDate() {
        WebElement getDay = driver.findElement(By.id("dob-day"));
        WebElement getMonth = driver.findElement(By.id("dob-month"));
        WebElement getYear = driver.findElement(By.id("dob-year"));

        getDay.sendKeys("19");
        getMonth.sendKeys("05");
        getYear.sendKeys("1994");
    }

}
