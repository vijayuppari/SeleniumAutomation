package interviewquestions;

import java.util.Map;
import java.util.stream.Collectors;

public class findDuplicateElements {

    public static void main(String[] args) {

        String ss= "vijay kumar";
        Map<Character, Long> collect = ss.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(collect);

    }
}
