package algorithims;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convertlistofstringwordstouppercase {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("aa", "bb", "cc", "dd");
        List<String> collect = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);


    }
}
