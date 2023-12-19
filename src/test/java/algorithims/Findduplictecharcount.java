package algorithims;

import java.util.HashMap;
import java.util.Map;

public class Findduplictecharcount {

    public static void main(String[] args) {

        String s ="hmabbcccdh";
        Map<Character,Integer> hmap = new HashMap<>();
        for(Character ch: s.toCharArray()){
            if(hmap.containsKey(ch))
                hmap.put(ch, hmap.get(ch)+1);
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
        for(int i=s.length()-1;i>0;i--){
            char ele = s.charAt(i);
            Integer freq = hmap.get(ele);
            if(freq==1) {
                System.out.println("First Non repeated character is " + ele);
                break;
            }
        }
    }
}
