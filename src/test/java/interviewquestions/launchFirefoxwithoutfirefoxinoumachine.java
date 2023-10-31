package interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefoxwithoutfirefoxinoumachine {

        // Selenium inroduced new browsers for Chrome, Firefox and Edge. Is that mean really we dont need
        // any browsers installed in our machine automatically selenium will install and run it, those will install
    // users-> selenium-> Cache
    // Incase if u want to run in your local browsers that we can do it
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://playwright.dev/");
        System.out.println("Title of the page is : " + driver.getTitle());
        driver.close();

    }



}
