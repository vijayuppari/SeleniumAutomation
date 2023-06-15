package interviewquestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class sumofarrayofelements {

    public static void main(String[] args) {
        Integer[]ele= new Integer[]{1,2,3};
        sumofarrayele(ele);
    }


    public static void sumofarrayele(Integer elements[]){

        // Approach 1:
        List<Integer> lisofele = Arrays.asList(elements);
        int sum1 = lisofele.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("Sum of Array Elements are "+sum1);

        // Approach 2:
        List<Integer> lisofele1 = Arrays.asList(elements);
        Integer sum2 = lisofele1.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Array Elements are "+sum2);

        // Approach 3:
        List<Integer> lisofele4 = Arrays.asList(elements);
        Integer sum4 = lisofele1.stream().reduce(0,Integer::sum);
        System.out.println("Sum of Array Elements are "+sum4);

        // Approach 4:
        List<String> lisofele2 = Arrays.asList("2","3","5");
        int sum3 = lisofele2.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Sum of Array Elements are "+sum3);

        // Approach 5:
        List<Integer> lisofele5 = Arrays.asList(elements);
        IntSummaryStatistics sum6 = lisofele5.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Sum of Array Elements are "+sum6);
    }
}
