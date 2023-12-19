package HashMapconcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHihestsalaryinmap {


    public static void main(String[] args) {

        // Input 1;
        HashMap<String,Integer> hmap= new HashMap<>();
        hmap.put("vijay",100);
        hmap.put("Harish",900);
        hmap.put("Sameer",1200);
        hmap.put("Aakash",1800);
        hmap.put("Naveen",2000);

        // Input 2;
        HashMap<String,Integer> hmap1= new HashMap<>();
        hmap1.put("vijay",100);
        hmap1.put("Harish",900);
        hmap1.put("Sameer",1200);
        hmap1.put("Aakash",1800);
        hmap1.put("HameshA",1800);
        hmap1.put("Srikanth",1800);
        hmap1.put("Naveen",2000);
        hmap1.put("Suresh",2000);

        // Print HashMap
        //hmap.forEach((k,v)-> System.out.println(k + " " + v));

        // Print hashmap based on Key
        List<Map.Entry<String, Integer>> sortbykey = hmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        System.out.println(sortbykey);

        List<Map.Entry<String, Integer>> sortbyvalue = hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(sortbyvalue);

        // Print hashmap based on values
       /* List<Map.Entry<String, Integer>> sortbyvalue = hmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList());
        System.out.println(sortbyvalue);*/

        // get nth highest
       //System.out.println(nthhighestsalary(2,hmap));
        System.out.println(dynamicnthhighestsalary(1,hmap1));

    }

    public static Map.Entry<String, Integer> nthhighestsalary(int num, HashMap<String, Integer> hmap){
        return  hmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(num-1);
    }

    public static Map.Entry<Integer, List<String>> dynamicnthhighestsalary(int num, HashMap<String, Integer> hmap){
       return hmap.entrySet().stream()
               .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey,Collectors.toList())
               ))
                       .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
               .get(num-1);
    }

}
