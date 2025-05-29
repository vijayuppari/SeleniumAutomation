package interviewquestions;

import java.util.Arrays;
import java.util.List;

public class takeWhilemethod {

    //This method was introduced in Java 9 as part of the Stream API. This method is used to create a new stream containing elements from the input stream that meet a specified condition. It takes a predicate as an argument. Elements are collected while
    // the condition is true and processing halts when the condition becomes false.

    public static void main(String[] args) {

        // takewhile method early termination
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 8, 4, 2, 36, 43, 1);
        list.stream().takeWhile(num->num<8).forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1, 2, 4, 5, 8, 4, 2, 36, 43, 1);
        list1.stream().filter(num->num<8).forEach(System.out::println);
    }
}
