package algorithims;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Findduplictecharcount {


    // Approach 1:
    public static void main1(String[] args) {

        String s = "hmabbcccdh";
        Map<Character, Integer> hmap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (hmap.containsKey(ch))
                hmap.put(ch, hmap.get(ch) + 1);
            else
                hmap.put(ch, 1);
        }

        // Print duplicate elements count character is greater than 1
       /* for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if(entry.getValue()>1){
                System.out.println("Key is " + entry.getKey() + " value is " + entry.getValue());
           }
        }*/

        // Find first non repeated character in string
        /*for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);
            Integer freq = hmap.get(ele);
            if(freq==1) {
                System.out.println("First Non repeated character is " + ele);
                break;
            }
        }*/

        // Find Last non repeated character in string
        for (int i = s.length() - 1; i > 0; i--) {
            char ele = s.charAt(i);
            Integer freq = hmap.get(ele);
            if (freq == 1) {
                System.out.println("First Non repeated character is " + ele);
                break;
            }
        }
    }

    // Approach 2:

    public static void main5(String[] args) {

        String str ="vijay kumar uppari";
        String str1 ="vijay kumar uppari";
        String[] arr = str.toUpperCase().split("");

        Map<String, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        String[] arr1 = str.toUpperCase().split("");
        Map.Entry<String, Long> stringLongEntry = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

         System.out.println(stringLongEntry);
    }

    // Reverse words in sentence
    public static void main3(String[] args) {

        StringBuilder sbFinal = new StringBuilder();
        StringBuilder sbword = new StringBuilder();
        String str ="vijay kumar uppari";
        String[] arr = str.split(" ");
        for(String word: arr) {

            for (int i = word.length()-1; i >= 0; i--) {
                sbword.append(word.charAt(i));
            }
        }
        System.out.println(sbFinal.append(sbword).append(" "));
    }

    // remove duplicates from string
    public static void main(String[] args) {

        String str ="vijaykumaruppari";
        Set<String> hset = new HashSet<>();
        Arrays.stream(str.split("")).collect(Collectors.toSet()).forEach(System.out::println);

    }

}
