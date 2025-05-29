package algorithims;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumListofListvalues {

    public static void main(String[] args) {

        // Just one list
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        //Integer reduce = list1.stream().reduce(0, Integer::sum);
        //System.out.println(reduce);

        // Morethan one list
        List<Integer> list2 = Arrays.asList(6,7,8);
        List<Integer> list3= Arrays.asList(9,10);

        List<List<Integer>> lists = Arrays.asList(list1, list2, list3);

        Integer collect = lists.stream().flatMap(s -> s.stream()).mapToInt(Integer::intValue).sum();
        System.out.println(collect);

        Stream<Integer> integerStream = lists.stream().flatMap(s -> s.stream());
        Integer reduce = integerStream.reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
