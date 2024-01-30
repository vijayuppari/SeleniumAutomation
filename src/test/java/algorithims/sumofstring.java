package algorithims;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sumofstring {

    public static void main(String[] args) {

        String str = "Item1 10 Item2 25 Item3 30 Item4 45";
        int sum = Arrays.stream(str.split(" ")).filter(e -> e.matches("\\d+")).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);

    }
}
