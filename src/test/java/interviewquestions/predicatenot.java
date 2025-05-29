package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicatenot {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,56,34,21,67);
        numbers.stream().filter(Predicate.not(num->num %2==0)).forEach(System.out::println);
    }
}
