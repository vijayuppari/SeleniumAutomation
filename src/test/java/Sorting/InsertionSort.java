package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[]=new int[]{10,45,12,4,232,34};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= current;
        }
    }
}
