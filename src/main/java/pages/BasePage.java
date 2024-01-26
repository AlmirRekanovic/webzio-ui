package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        // Add any additional Chrome options here
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");

        // Set Chrome options
        driver = new ChromeDriver(options);
    }
}
