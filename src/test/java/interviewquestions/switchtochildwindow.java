package interviewquestions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class switchtochildwindow {

   private static WebDriver driver;

    public static void main(String[] args) {

 //       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://petdiseasealerts.org/forecast-map#/");
        driver.manage().window().maximize();
        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);



        Set<String> getwindowHandles = driver.getWindowHandles();
        List<String>  handles= new ArrayList<>(getwindowHandles);

        if(switchtoparentwindow("Facebook",handles)){
            System.out.println("Window "+ driver.getCurrentUrl()+ "........" + driver.getTitle());
        }
    }


    public static boolean switchtoparentwindow(String windowName, List<String> handles){
        
        for(String expected:handles){
            String title = driver.switchTo().window(expected).getTitle();
            if(title.equals(windowName)){
                System.out.println("Found the right window ");
                return true;
            }
        }
        return false;
    }
}
