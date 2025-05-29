package geeksforgeeks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Googlesearch {

    public static void main(String[] args) throws InterruptedException {

       clickonthirdsearchresultsinlistbox();


    }

        public static void clickonthirdsearchresults() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver tutorial");
            searchBox.submit();
            Thread.sleep(2000); // sleep for 2 seconds, adjust timing as needed
            List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));

            // Ensure there are enough results
            if (searchResults.size() >= 3) {
                // Get the third search result (index 2)
                WebElement thirdResult = searchResults.get(2);
                System.out.println("Third result title: " + thirdResult.getText());
                // Optionally, click on the third result
                thirdResult.click();
                // Wait for the page to load after clicking the link
                Thread.sleep(2000);
            } else {
                System.out.println("There are less than 3 search results.");
            }
            driver.quit();
        }

    public static void clickonthirdsearchresultsinlistbox() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver tutorial");
        Thread.sleep(5000); // sleep for 2 seconds, adjust timing as needed
        List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

        // Ensure there are enough results
        if (searchResults.size() >= 3) {
            WebElement thirdResult = searchResults.get(2);
            System.out.println("Third result title: " + thirdResult.getText());
            thirdResult.click();
            Thread.sleep(2000);
        } else {
            System.out.println("There are less than 3 search results.");
        }
        driver.quit();
    }

}

