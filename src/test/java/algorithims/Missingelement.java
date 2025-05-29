package algorithims;

import java.util.Map;
import java.util.stream.Collectors;

public class Missingelement {

    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,5,6,7,8};
        int sum = (8*9)/2;
        int actsum=0;
        for(int i=0;i<arr.length;i++){
            actsum =actsum+arr[i];

        }
        System.out.println((sum-actsum));

    }
}
