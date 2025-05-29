package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class CopyofListmethod {

    //This method was introduced in Java 10 as part of the java.util.List interface. It is used to create unmodifiable lists. This method returns an unmodifiable view of the s
    // pecified list that throws UnsupportedOperationException if modification is attempted.

    public static void main(String[] args) {

        List<String> ls3 = new ArrayList<>();
        ls3.add("vijay");
        ls3.add("Nani");
        ls3.add("Hari");

        List<String> unmodifibalels4 = List.copyOf(ls3);
        System.out.println("First list is " + ls3);
        System.out.println("Unmodifible list  list is " + unmodifibalels4);

        try{
            unmodifibalels4.add("Aadi");
        }
        catch (UnsupportedOperationException exception){
            System.out.println("Can not modified the new List");
        }
    }
}
