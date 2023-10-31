package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeatedcharacter {

    public static void main(String[] args) {
        FirstNonrepeated("vijaykumaruppariv");

    }


    public static void FirstNonrepeated(String str){
        Map<Character, Integer> hmap =new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch:chars){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }

        //for(int i=0;i<=str.length()-1;i++){// First Non repeat character
        for(int i=str.length()-1;i>=0;i--){// Last non repeat character
            char value = str.charAt(i);
            Integer freq = hmap.get(value);
            if(freq==1){
                System.out.println(value);
                break;
            }
        }
    }
}
