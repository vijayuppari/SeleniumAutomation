package geeksforgeeks;

public class LinearSearch {


    // Linear search will check each element in the array until we find the target element, its
    // not recommended for large arrays.
    public static void main(String[] args) {
        int arr[] = new int[]{2,6,1,10,5,89,45,34};
        System.out.println(linearSearch(arr,89));

    }


    public static int linearSearch(int arr[], int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
