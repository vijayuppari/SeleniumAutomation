package interviewquestions;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class getsecondminvaluefromArrayusingjava8 {

    public static Integer getsecondminvalue(int arr[]){
            int secondminvalue = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IndexOutOfBoundsException());
        return secondminvalue;
    }
    public static void main(String[] args) {

       int arr[]={6,3,7,9,4,9,1,1};
        System.out.println(getsecondminvalue(arr));

    }

}
