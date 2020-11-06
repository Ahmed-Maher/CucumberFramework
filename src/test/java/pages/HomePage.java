package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Testbase;

public class HomePage extends Testbase {

    public String homePageTitle() {
        String title = driver.getTitle();
        return title;
    }

    @FindBy (xpath = "//a[@href='/contacts']")
    public WebElement contacts;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public ContactPage clickContacts(){
        contacts.click();
        return new ContactPage();
    }
}
