package interviewquestions;

public class ReverseofArray {

    public static void main(String[] args) {

        int ele[]=new int[]{1,2,3,4,5};
        arrayreverse(ele);

    }


    public static void arrayreverse(int array[]){

        for(int i =array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }


    }
}
