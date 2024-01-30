package algorithims;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sortlistofintegers {

    public static void main(String[] args) {

        // Sort list of integers
        List<Integer> list1 = Arrays.asList(12,4,56,12,10);
        List<Integer> collect = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        // max number in the list of integers
        List<Integer> list2 = Arrays.asList(12,4,56,12,10);
        Integer max = list2.stream().max(Integer::compare).get();
        System.out.println(max);

        // Find the count in the list of integers
        List<Integer> list3 = Arrays.asList(12,4,56,12,10);
        long count = list2.stream().count();
        System.out.println(count);

        // Remove duplicate in the list of integers
        Set<Integer> hset = new HashSet<>();
        List<Integer> list4 = Arrays.asList(12,4,56,12,10);
        List<Integer> collect1 = list4.stream().filter(e -> !hset.add(e)).collect(Collectors.toList());
        System.out.println(collect1);

        // Find the duplicate in the list of integers
        List<Integer> list5 = Arrays.asList(12,4,56,12,10);
        Set<Integer> collect2 = list2.stream().collect(Collectors.toSet());
        System.out.println(collect2);

        // Find the numbers starts with 1in the given list
        List<Integer> list6 = Arrays.asList(12,4,56,12,10);
        List<String> collect3 = list6.stream().map(e -> e + "").filter(ls -> ls.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect3);


    }
}
