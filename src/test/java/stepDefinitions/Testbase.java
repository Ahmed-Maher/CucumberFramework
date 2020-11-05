package stepDefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

    public static WebDriver driver;

    public void initConf() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.freecrm.com/");
    }


    public void quitBrowser(){
        driver.quit();
    }

}
