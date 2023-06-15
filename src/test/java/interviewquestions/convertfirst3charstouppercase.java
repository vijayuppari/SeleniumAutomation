package interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertfirst3charstouppercase {


    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/sravani.alli/photos/?paipv=0&eav=AfY2tq7ss8rWaDxTwGIbhz4cRtEhKxtl3zUVFddL8XGE6VezvffLcHAelibXKNguQGY");

        List<Character> listofarray = Arrays.asList('a', 'b', 'c', 'd', 'e');
        //listofarray.stream().map(Character.)
        listofarray.subList(0,3).stream().map(s->Character.toUpperCase(s)).forEach(System.out::println);;
        /*for(Character c:sublistchars){
            System.out.println(c.);
        }*/
        //listofarray.stream().map(s->(s.charAt(0))+ s.substring(1).toUpperCase()).forEach(System.out::println);

    }
}
