package interviewquestions;

public class MissingNumber {

    public static void main(String[] args) {

        int arr[]= new int[]{1,2,3,5};
        MissingNumber(arr);


        String str ="Vijay Kumar Uppari";
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for(String s1: s){
            if(!(s1 ==" ")){
                sb.append(s1);
            }
        }
        System.out.println(sb.toString());
    }

    public static void MissingNumber(int [] arr){

        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        for(int j=1;j<=5;j++){
            sum1 =sum1+j;
        }
        System.out.println(sum1-sum);

    }


}
