package interviewquestions;

import java.util.Arrays;
import java.util.List;

public class typeinferenceoflocalvariable {

    // This "var" keyword is supports different data types
    public static void main(String[] args) {

        List<String> names = Arrays.asList("vijay", "Nani", "Harish");
        List<Integer> names1 = Arrays.asList(1,2,3,4);
        for(var name: names1){
            System.out.println(name);
        }

    }
}
