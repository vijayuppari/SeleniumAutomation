package geeksforgeeks;

import java.util.Arrays;

public class BinarySearch {
    // Binary Search is applicable only for Sorted Array

    //Calculate the mid and compare the mid-element with the key. If the key is less than mid-element,
    // move to left and if it is greater than the mid then move search space to the right.

    public static void main(String[] args) {
        int arr[] = new int[]{2,6,1,10,5,89,45,34};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length-1,2));


    }
    public static int binarySearch(int arr[], int first, int last, int target){

        int mid =(first+last)/2;
        while(first<last){
            if(arr[mid]<target){
                first =mid+1;
            }
            else if (arr[mid]==target) {
                System.out.println("Element found index is " + arr[mid]);
                break;
            }
            else {
                last =mid-1;
            }
            mid =(first+last)/2;
        }
        if(first>last){
            System.out.println("Element is not found in the array " );
        }
        return mid;
    }


}
