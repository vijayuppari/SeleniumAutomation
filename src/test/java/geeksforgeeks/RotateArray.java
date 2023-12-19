package geeksforgeeks;

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};
        rightrotateArray(arr, 2);
        leftrotateArray(arr, 2);
    }

    public static void rightrotateArray(int arr[], int n) {
        int last;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Original Array is " + arr[i]);
        }

        for (int i = 0; i < n; i++) {
            last = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("After rotate an Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void leftrotateArray(int arr[], int n) {
        int first,j;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Original Array is " + arr[i]);
        }

        for (int i = 0; i < n; i++) {
            first = arr[0];

            for (j = 0; j<arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println("After rotate an Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}