package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class retainAll {

    // RetainAll method is used to get the common elements between both lists
    // which means true or false
    public static void main(String[] args) {

        List<String> ls1 = Arrays.asList("vijay", "Nani", "Hari", "Hamsa");
        List<String> ls2 = Arrays.asList("vijay", "Charan", "Mothkur", "Hari");

        List<String> ls3 = new ArrayList<>();
        ls3.add("vijay");
        ls3.add("Nani");
        ls3.add("Hari");

        List<String> ls4 = new ArrayList<>();
        ls3.add("Hamsa");
        ls3.add("Mothkur");
        ls3.add("vijay");

        System.out.println(ls3.retainAll(ls4));
        System.out.println("Common elements in List1 is " + ls3);


    }
}
