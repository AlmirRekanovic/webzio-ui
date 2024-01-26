package tests;

import data.ContactUsFormData;
import org.testng.annotations.Test;


public class ContactUsTest extends BaseTest {
    ContactUsFormData formData = ContactUsFormData.builder()
            .name("QA Candidate")
            .lastName("TEST")
            .email("john.doe@news.com")
            .phone("12345678")
            .message("Hello, this is a test message.")
            .companyName("MyCompany")
            .build();

    @Test(priority = 1)
    public void testContactFormSubmission() {
        // Navigate to Contact Us form
        homePage.navigateToContactUs();

        // Populate and submit the form
        contactUsPage.populateContactUsForm(formData);
        contactUsPage.submitForm();

        // Verify success message
        contactUsPage.verifyContactIsSent();
    }

    @Test(priority = 2)
    public void testEmptyFieldsValidation() {
        // Navigate to Contact Us form
        homePage.navigateToContactUs();

        // Submit the form without filling any fields
        contactUsPage.submitForm();

        // Verify required field error messages
        contactUsPage.verifyRequiredMessageIsDisplayed(7);
    }

    @Test(priority = 3)
    public void testInvalidEmailValidation() {
    }

    @Test(priority = 4)
    public void testInvalidPhoneValidation() {
    }
}
