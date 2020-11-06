package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Testbase;

public class ContactPage extends Testbase {

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@href='/contacts/new']")
    WebElement newContact;

    @FindBy (name = "first_name")
    WebElement firstName;

    @FindBy (name = "last_name")
    WebElement lastName;

    @FindBy (css = "i.save.icon")
    WebElement saveButton;

    @FindBy (css = "i.large.user.red.icon")
    public WebElement fullName;


    public void addContactInfo(String fn, String ln) {
        newContact.click();
        firstName.sendKeys(fn);
        lastName.sendKeys(ln);
        saveButton.click();
    }

    public String fullName() {
        return fullName.getText();
    }

}
