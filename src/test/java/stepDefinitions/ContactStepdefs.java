package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactPage;
import pages.HomePage;


public class ContactStepdefs extends Testbase{

    ContactPage contactPage;
    HomePage homePage;

    public ContactStepdefs() {
        super();
    }

    @Then("user move to contact page")
    public void userMoveToContactPage() {
        homePage = new HomePage();
        waitForElementToBeVisible(homePage.contacts, 10);
        contactPage = homePage.clickContacts();

    }

    @Then("user enters contact information {string} and {string}")
    public void userEntersContactInformationAnd(String arg0, String arg1) {
        contactPage.addContactInfo(arg0, arg1 );
    }

    @Then("user verify the contact information")
    public void userVerifyTheContactInformation() {
        waitForElementToBeVisible(contactPage.fullName, 10);
        Assert.assertEquals(contactPage.fullName(), contactPage.fullName.getText());
    }
}
