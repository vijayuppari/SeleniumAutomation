package interviewquestions;

import java.util.*;

public class executescriptsinopenedbrowser {


    public static void main(String[] args) {

        Map<Integer, String> hamp= new HashMap<>();

        hamp.put(100,"Vijay");
        hamp.put(200,"Naresh");
        hamp.put(300,"Vamshi");
        hamp.put(200,"Sameer");

        // Get the Keys
        List<Integer> ls = new ArrayList<Integer>(hamp.keySet());
        for (Integer ele1 : ls){
            System.out.println(ele1);
        }
        System.out.println("**********************");

        // Get the Values
        List<String> ls2 = new ArrayList<String>(hamp.values());
        for (String ele2 : ls2){
            System.out.println(ele2);
        }
        System.out.println("**********************");
            // Get both Keys and values
        List<Map.Entry<Integer,String>> ls3 = new ArrayList<Map.Entry<Integer, String>>(hamp.entrySet());
        System.out.println("Key and values of List are " + ls3);

        for (Map.Entry ele : hamp.entrySet()){
            System.out.println(ele.getKey() + "and value is "+ele.getValue());

        }


    }
}
