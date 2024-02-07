package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangestringasperlngthinList {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("vijay", "Nani", "Hari", "Uppari");
        Arrangewordsasperlength(strings);

        List<String> strings1 = Arrays.asList("vijay", " ", "", "Uppari");
        combinewords(strings1);

    }

    public static void Arrangewordsasperlength(List<String> words){

        words.stream().collect(Collectors.groupingBy(String::length)).entrySet().forEach(x -> System.out.println(x));

    }

    public static void combinewords(List<String> words){
        String collect = words.stream().collect(Collectors.joining());
        System.out.println(collect);
    }


}
