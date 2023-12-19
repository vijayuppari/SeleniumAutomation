package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class largestsuminthegivenArray {

    public static void main(String[] args) {

        int a[]={1,2,3,4,7,8,8};
        int S=11;
        Maxlengthsubarray(a, S);

    }


    public static void Maxlengthsubarray(int a[], int S){

        Map<Integer, Integer> maxmap= new HashMap<>();
        maxmap.put(0, -1);
        int sum=0;
        int len=0;
        int end_index= -1;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(!maxmap.containsKey(sum)){
                maxmap.put(sum, i);
            }
            if(maxmap.containsKey(sum-S) && len<i-maxmap.get(sum-S)){
                len=i-maxmap.get(sum-S);
                end_index=i;
            }
        }
        System.out.println(" "+ (end_index-len-1)+ " " + end_index + " ");
    }


}
