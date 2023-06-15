package LeetcodeByRetarget;

public class NumberofConsistentStrings {

    public static int consistentstrings(String allowed,  String[] words){

        int counter=0;
        for(String word:words){
            boolean flag=true;
         char[] ch=  word.toCharArray();
            for(char c: ch){
                if(allowed.indexOf(c)==-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                counter++;
            }
        }
        return  counter;
    }

    public static void main(String[] args) {

        System.out.println(consistentstrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(consistentstrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(consistentstrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));

    }
}
