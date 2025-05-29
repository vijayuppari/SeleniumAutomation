package algorithims;

import java.util.*;

public class sumofconsecutivenumofArray {


    public static void main(String[] args) {
        int [] arr = new int[]{52,963,4,55,6,7};
        sumofArray(arr);
    }
    public static void sumofArray(int[] arr1){

        List ls = new ArrayList();
        int sum=0;

        for(int i=0;i<arr1.length-1;i++){
            sum= arr1[i]+arr1[i+1];
            System.out.println(sum);
            ls.add(sum);
        }
        Comparable max = Collections.max(ls);
        System.out.println("Maximum Number in the List as " + max);

        Comparable index = ls.indexOf(max);
        System.out.println("Index of number as " + index);
    }
}
