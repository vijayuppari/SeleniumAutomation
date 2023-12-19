package interviewquestions;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "c", "d" };
        // Approach 1:
       /* StringBuilder  sb = new StringBuilder();
        for (String c: arr){
            sb.append(c + ";");
        }
        System.out.println(sb);*/

        // Approach 2:
        String join = String.join("", arr);
        System.out.println(join);
        //Arrays.stream(arr).map(String::join).forEach(System.out::println);

        //String str= "naveen";
        //System.out.println(str.substring(1,str.length()));


        String str = "naveen automation labs";
        String[] splitteddstr = str.split(" ");

        for (String s : splitteddstr) {
            String firstchar = s.substring(0, 1).toUpperCase() + ""+ s.substring(1).toLowerCase();
             System.out.println(firstchar);
        }


    }
}
