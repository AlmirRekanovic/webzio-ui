package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    // XPath expressions for elements on the Home page
    private static final By COMPANY_DROPDOWN = By.xpath("//div[.='COMPANY']");
    private static final By CONTACTUS_SECTION = By.xpath("//div[.='Contact Us']");

    private static By Section(String sectionName){
        return By.xpath("//div[.='" + sectionName + "']");
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToContactUs(){
        driver.findElement(COMPANY_DROPDOWN).click();
        driver.findElement(CONTACTUS_SECTION).click();
    }

    public void navigateTo(String sectionName){
        driver.findElement(COMPANY_DROPDOWN).click();
        driver.findElement(Section(sectionName)).click();
    }

    public void clickOnCompanySection(){
        driver.findElement(COMPANY_DROPDOWN).click();
    }
}
