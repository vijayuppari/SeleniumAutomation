package LeetcodeByRetarget;

import java.util.HashMap;

public class jewelsandstones {

    public static int jewlsandstones(String Jewels, String Stones){
        int count=0;
        HashMap<Character,Integer> charcount= new HashMap<>();
        for(char ch: Stones.toCharArray()){
            charcount.put(ch,charcount.getOrDefault(ch,0)+1);
        }

        for(char ch: Jewels.toCharArray()){
            count=count+charcount.getOrDefault(ch,0);
        }
    return count;
    }

    public static void main(String[] args) {
        System.out.println(jewlsandstones("aA","aAAbbbbb"));
        System.out.println(jewlsandstones("z","ZZZ"));

    }
}
