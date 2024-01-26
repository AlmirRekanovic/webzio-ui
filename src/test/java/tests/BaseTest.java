package tests;

//import config.AppConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ContactUsPage;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
     ContactUsPage contactUsPage;
     HomePage homePage;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Initialize Page Objects
        contactUsPage = new ContactUsPage(driver);
        homePage = new HomePage(driver);


        // Set up WebDriver configuration
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open the home page
        driver.navigate().to("https://webz.io/");
    }

    @AfterMethod
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
