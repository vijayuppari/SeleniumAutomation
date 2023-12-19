package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonelementsinbothArrays {

    public static void main(String[] args) {

        int xyz[]= {1,2,4,6,8,10};
        int abc[]= {7,2,4,67,10,17};
        List<Integer> list1 = Arrays.asList(34, 56, 7, 30, 321, 45);
        List<Integer> list2 = Arrays.asList(341, 7, 17, 310, 21, 30);
        fetchCommonelements(xyz,abc);
        fetchCommonelementslist(list1,list2);

    }

    private static void fetchCommonelements(int[] xyz, int[] abc) {

        List<Integer> ls = Arrays.stream(xyz).filter(number -> Arrays.stream(abc).anyMatch(abcNumber -> abcNumber==number)).boxed().
                collect(Collectors.toList());
        System.out.println("Common elements in 2 arrays are " + ls);

    }

    private static void fetchCommonelementslist(List<Integer> ls1,List<Integer> ls2) {

        List<Integer> commonele = ls1.stream().filter(ls2::contains).collect(Collectors.toList());
        System.out.println("Common elements in 2 lists are " + commonele);

    }
}
