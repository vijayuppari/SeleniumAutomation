package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetRowandcolumnvalues {

    private static WebDriver driver;

    public static void main(String[] args) {

         driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        checkexpectedcountry("Germany");
        driver.quit();

    }

    public static boolean checkexpectedcountry(String countryname) {
        List<WebElement> totalrows = driver.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println("Total number of Rows " + totalrows.size());
        List<WebElement> totlcolumns = driver.findElements(By.xpath("//*[@id='customers']//th"));
        System.out.println("Total number of Columns " + totlcolumns.size());
        boolean flag= false;
        for (int i = 2; i < totalrows.size(); i++) {
            for (int j = 1; j <=totlcolumns.size(); j++) {
                String extext = driver.findElement(By.xpath("//*[@id='customers']//tbody//tr[" + i + "]//td["+j+"]")).getText();
                if (extext.equals(countryname)) {
                    flag=true;
                    System.out.println("Expected country found "+ countryname);
                    break;
                }
            }
        }
        if(flag){
            return true;
        }
        System.out.println("Expected country not found in the Table");
        return false;
    }
}