package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract class Page {

    private WebDriver driver;

    public <E extends WebDriver> Page(E driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
