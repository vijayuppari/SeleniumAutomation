package LeetcodeByRetarget;

public class MergeStringAlternatively {

        public static String mergestrings(String word1, String word2){

            StringBuilder result = new StringBuilder();

            int minLen= Math.min(word1.length(),word2.length());
           for(int i=0;i<minLen;i++){
               result.append(word1.charAt(i)).append(word2.charAt(i));
           }

           // Approach 1
           /*if(word1.length()>minLen){
               result.append(word1.substring(minLen));
           }

           if(word2.length()>minLen){
                result.append(word2.substring(minLen));
            }*/

            // Approach 2:
            result.append(word1.substring(minLen)).append(word2.substring(minLen));
            return result.toString();
        }
    public static void main(String[] args) {

        System.out.println(mergestrings("abc", "pqr"));
        System.out.println(mergestrings("ab", "pqrs"));
        System.out.println(mergestrings("abcd", "pq"));
        System.out.println(mergestrings("a", ""));
        System.out.println(mergestrings("", "b"));


    }
}
