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

    public static boolean bubblesort(int[] arr){

        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }

            }
            if((!flag || flag) == false){
                break;
            }
        }
        return flag;
    }
}
