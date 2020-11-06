package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepdefs extends Testbase {
    LoginPage loginPage;
    HomePage homePage;


    @Given("user is already on the login page")
    public void userIsAlreadyOnTheLoginPage() {
        initConf();
        loginPage = new LoginPage();
    }

    @When("the title of the login page is Free CRM")
    public void theTitleOfTheLoginPageIsFreeCRM() {
        Assert.assertEquals(loginPage.loginPageTitle(), "Cogmento CRM");
    }

    @Then("user enters the {string} and {string} and click on the login button")
    public void userEntersTheEmailAndPassword(String arg0, String arg1) {
        homePage = loginPage.login(arg0, arg1);
    }


    @Then("the user on the home page")
    public void theUserOnTheHomePage() {
        Assert.assertEquals(homePage.homePageTitle(), "Cogmento CRM");
    }

    @Then("the user close the browser")
    public void theUserCloseTheBrowser() {
        quitBrowser();
    }
}
