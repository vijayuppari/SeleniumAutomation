package LeetcodeByRetarget;

import java.util.ArrayList;
import java.util.List;

public class Sortingthesentenceleetcode {

// Approach 1: Using String
    public static String sorting(String str){

        String[] words = str.split(" ");
        String [] wordswithcorrectposition = new String[words.length];
        for(String word:words){
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            wordswithcorrectposition[index-1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ",wordswithcorrectposition);
    }

    public static String sortingusingList(String str){

        String[] words = str.split(" ");
        List<String> wordsList = new ArrayList<>(List.of(words));
        for(String word: words){
            int index = Character.getNumericValue(word.charAt(word.length()-1));
            wordsList.set(index-1,word.substring(0,word.length()-1));
        }
            return String.join(" ",wordsList);
    }

    public static void main(String[] args) {

        System.out.println(sorting("is2 sentence4 This1 a3"));
        System.out.println(sorting("Myself2 Me1 I4 and3"));
        System.out.println(sortingusingList("is2 sentence4 This1 a3"));
        System.out.println(sortingusingList("Myself2 Me1 I4 and3"));

    }
}
