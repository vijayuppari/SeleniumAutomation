package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBy {

    public static void main(String[] args) {

        List<String> ls = Arrays.asList("pune", "Banglore", "Bihar", "Hyderabad");
        Map<Character, List<String>> cityfirstchar = ls.stream().collect(Collectors.groupingBy(city -> city.charAt(0)));
        cityfirstchar.forEach((firstletter,lettersreain) ->
            System.out.println(firstletter + " " + lettersreain));

        List<String> ls1 = Arrays.asList("pune", "Banglore", "Bihar", "Hyderabad");
        Map<Character, Long> collect = ls1.stream().collect(Collectors.groupingBy(city -> city.charAt(0), Collectors.counting()));

        collect.forEach((k,v)-> System.out.println(k+ " " + v));
    }
}
