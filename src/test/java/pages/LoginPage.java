package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Testbase;

public class LoginPage extends Testbase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "div.button")
    WebElement loginBtn;


    public HomePage login(String em, String pw) {
        email.sendKeys(em);
        password.sendKeys(pw);
        loginBtn.click();
        return new HomePage();
    }

    public String loginPageTitle() {
        String title = driver.getTitle();
        return title;
    }
}
