package Sorting;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {

        int arr[]={12,45,9,3,47,90};
        int arr1[]={12,45,0,3,0,47,90};
        int arr2[]={12,45,9,3,-1,47,90,-40};
        int arr3[]={12,45,9,3,47,90,12,3};


        bubblesort(arr);
        bubblesort(arr1);
        bubblesort(arr2);
        bubblesort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

    public static void bubblesort(int[] arr){

        // ex: iteration 1:5,4,3,2,1
        // 4,5,3,2,1
        //4,3,5,2,1
        //4,3,2,5,1
        //4,3,2,1,5
        // ex: iteration 2: 4,3,2,1,5
        // 3,4,2,1,5
        //3,2,4,1,5
        //3,2,1,4,5
        // ex: iteration 3: 3,2,1,4,5
        // 2,3,1,4,5
        //2,1,3,4,5
        // ex: iteration 4: 2,1,3,4,5
        // 1,2,3,4,5

      for(int i=0;i<arr.length;i++){
          for(int j=1;j<arr.length-i;j++){
              if(arr[j]<arr[j-1]){
                  int temp= arr[j];
                  arr[j]= arr[j-1];
                  arr[j-1]= temp;
              }
          }
      }
    }
}
