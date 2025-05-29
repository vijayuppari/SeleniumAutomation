package algorithims;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class commonelementsinarrays {

    public static void commonelements(int arr1[], int arr2[]){

        Set<Integer> hset = new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            hset.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(hset.contains(arr2[i])){
                System.out.println(arr2[i]);
            }
        }

    }

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5};
        int arr1[]=new int[]{1,2,6,4,7};
        commonelements(arr,arr1);


        /*int arr2[]=new int[]{1,2,6,4,7,5,4,2};
        Set<Integer> hset1 = new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            if(hset1.add(arr2[i])){
                System.out.println(arr2[i]);
            }
        }*/

    }
}
