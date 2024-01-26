package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavbarTest extends BaseTest {
    @Test
    public void testNavbarLinks() {

        homePage.clickOnCompanySection();
        String  careersLinkText = driver.findElement(By.xpath("//div[@class='sub-title']//a[@href='/careers']")).getText().trim();
        String  aboutUsLinkText = driver.findElement(By.xpath("//div[@class='sub-title']//a[@href='/about-us']")).getText().trim();
        String  pressLinkText = driver.findElement(By.xpath("//div[@class='sub-title']//a[@href='/press']")).getText().trim();
        String  trustCenterLinkText = driver.findElement(By.xpath("//div[@class='sub-title']//a[@href='https://pages.webz.io/trust-center']")).getText().trim();
        String  contactUsLinkText = driver.findElement(By.xpath("//a[@href='/tte/contact-us']//div[@class='sub-title']")).getText().trim();

        Assert.assertEquals(careersLinkText,"Careers","Link text does not match expected value");
        Assert.assertEquals(aboutUsLinkText,"About Us","Link text does not match expected value");
        Assert.assertEquals(pressLinkText,"Press","Link text does not match expected value");
        Assert.assertEquals(trustCenterLinkText,"Trust Center","Link text does not match expected value");
        Assert.assertEquals(contactUsLinkText,"Contact Us","Link text does not match expected value");

    }
}
