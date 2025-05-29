package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Appendallstringsinthearray {

    public static void main(String[] args) {

        String [] arr = new String[]{"vijay","swamy","venky"};
        String collect = Stream.of(arr).collect(Collectors.joining(":"));
        System.out.println(collect);


    }
}
