package interviewquestions;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Intsummingstatistics {

    public static void main(String[] args) {

        int arr[] = new int []{1,4,6,3,1};
        IntSummaryStatistics summaryStatistics = IntStream.of(arr).summaryStatistics();
        System.out.println("Sum of Array values " + summaryStatistics.getSum());
        System.out.println("Min value of given Array as " + summaryStatistics.getMin());
        System.out.println("Max value of given Array as " + summaryStatistics.getMax());
        System.out.println("Avg value of given Array as " + summaryStatistics.getAverage());
        System.out.println("Total count of given Array as " + summaryStatistics.getCount());


    }


}
