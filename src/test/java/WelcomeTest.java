import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import selenium.pages.GoogleWelcomePage;

public class WelcomeTest {

    private WebDriver driver;
    private GoogleWelcomePage page;


    @BeforeClass
    public void setUo() {
        driver = new ChromeDriver();
        GoogleWelcomePage page = new GoogleWelcomePage(driver);


    }

    @Test
    public void welcomeTest() {
        page.inputTextInSearchField("gavno");
    }


    @AfterClass
    public void cleanUp() {
        driver.quit();

    }

}
