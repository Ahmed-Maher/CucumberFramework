package pages;

import stepDefinitions.Testbase;

public class HomePage extends Testbase {

    public String homePageTitle() {
        String title = driver.getTitle();
        return title;
    }
}
