package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimitivetoList {

    public static void main(String[] args) {

        // Non primitive
        Integer[] nonprimitive = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(nonprimitive);
        System.out.println(list);

        //  primitive
        int[] primitive = new int[]{1,2,3,4,5};
        List<int[]> list1 = Arrays.asList(primitive);
        System.out.println(list1);// So, in this case we will get the Object instead of List, so we should follow below approch

        int[] primitive1 = new int[]{1,2,3,4,5};
        List<Integer> list2 = Arrays.stream(primitive1).boxed().collect(Collectors.toList());
        System.out.println(list2);


    }
}
