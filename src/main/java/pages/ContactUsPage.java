package pages;

import data.ContactUsFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class ContactUsPage extends BasePage {

    // XPath expressions for elements on the Contact Us page
    private static final By FIRST_NAME_INPUT = By.xpath("//input[@placeholder='First Name*']");
    private static final By LAST_NAME_INPUT = By.xpath("//input[@placeholder='Last Name*']");
    private static final By BUSINESS_EMAIL_INPUT = By.xpath("//input[@placeholder='Business Email*']");
    private static final By COMPANY_NAME_INPUT = By.xpath("//input[@placeholder='Company Name*']");
    private static final By PHONE_INPUT = By.id(":R9b4m:");
    private static final By MESSAGE_INPUT = By.xpath("//textarea[@placeholder='How can we help you?']");
    private static final By SUBMIT_BUTTON = By.xpath("//span[text()='SUBMIT']");
    private static final By REQUIRED_MESSAGE = By.xpath("//small[text()='Required']");
    private static final By SUCCESS_MESSAGE = By.xpath("//h1[text()='Thank You!']");
    private static final By REASON_DROPDOWN = By.xpath("//select[@class='form-select false']");

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void populateContactUsForm(ContactUsFormData formData) {
        // Implementation to fill the form using XPath
        driver.findElement(FIRST_NAME_INPUT).sendKeys(formData.getName());
        driver.findElement(LAST_NAME_INPUT).sendKeys(formData.getLastName());
        driver.findElement(BUSINESS_EMAIL_INPUT).sendKeys(formData.getEmail());
        driver.findElement(COMPANY_NAME_INPUT).sendKeys(formData.getCompanyName());
        driver.findElement(PHONE_INPUT).sendKeys(formData.getPhone());
        driver.findElement(MESSAGE_INPUT).sendKeys(formData.getPhone());
        selectRandomTopic();
    }

    public void submitForm() {
        // Implementation to submit the form using XPath
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public void verifyContactIsSent() {
        Assert.assertTrue(driver.findElement(SUCCESS_MESSAGE).isDisplayed(), "Success message is not displayed.");
    }

    public void verifyRequiredMessageIsDisplayed(int numberOfFields){
        int requiredMessageCount = driver.findElements(REQUIRED_MESSAGE).size();
        Assert.assertEquals(requiredMessageCount, numberOfFields, "Required field message is missing!");
    }

    public void selectRandomTopic() {
        Select dropdown = new Select(driver.findElement(REASON_DROPDOWN));

        // Get all options from the dropdown
        List<WebElement> options = dropdown.getOptions();

        // Generate a random index within the range of available options
        int randomIndex = new Random().nextInt(options.size());

        // Select the option at the random index
        dropdown.selectByIndex(randomIndex);    }
}
