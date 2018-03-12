package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        String driverPath = "src/test/java/utils/drivers/chromedriver"; //you will need to download chromedriver for your OS if not using mac
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Runtime.getRuntime().addShutdownHook(new Thread("Driver shutdown thread") {
            public void run() {
                driver.quit();
            }
        });

        return driver;
    }
}
