package selenium.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class GoogleWelcomePage extends Page {

    @FindBy(css = "id=''fakebox-input")
    private WebElement inputFind;


    public <E extends WebDriver> GoogleWelcomePage(E driver) {
        super(driver);
    }

    public void inputTextInSearchField(String text) {
        new WebDriverWait(getDriver(),5)
                .pollingEvery(1, TimeUnit.SECONDS)
                .until((WebDriver driver ) -> {
                    try {
                        inputFind.sendKeys(text);
                        return true;
                    }catch (Exception ex ) {
                        return false;
                    }
                });
    }



}
