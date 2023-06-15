package LeetcodeByRetarget;

import java.util.*;
public class Uncommonwordsin2sentenses {


    public static String[] uncommonwords(String s1, String s2){

        Map<String, Integer> counts = new HashMap<>();
        String words= s1 +" " + s2;
        for(String word:words.split(" ")){
            counts.put(word,counts.getOrDefault(word,0)+1);
        }

        List<String> uncommon = new ArrayList<>();
        for (Map.Entry<String, Integer> keyvaluepair : counts.entrySet()) {
                    if(keyvaluepair.getValue()==1) {
                        uncommon.add(keyvaluepair.getKey());
                    }
        }
        String [] resultsarray = new String[uncommon.size()];
        uncommon.toArray(resultsarray);
        return resultsarray;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(uncommonwords("this apple is sweet","this apple is sour")));
        System.out.println(Arrays.toString(uncommonwords("apple apple","banana")));


    }
}
