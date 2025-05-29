package algorithims;

import java.util.Arrays;

public class sumofevennumbersinArray {

    public static void main(String[] args) {
        int[] arr = new int []{1,2,3,4,5,6};
        int sum = Arrays.stream(arr).filter(ele -> ele % 2 == 0).sum();
        System.out.println(sum);
    }
}
