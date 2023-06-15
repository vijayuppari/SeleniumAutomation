package LeetcodeByRetarget;

public class ShuffleString {

    public static String sufflethestring(String word, int[] indices){

        char[] resultArray= new char[word.length()];
        char[] charsinwordAttay = word.toCharArray();
        for(int i=0;i<charsinwordAttay.length;i++){
           resultArray[indices[i]] =charsinwordAttay[i];
        }
        return new String(resultArray);
    }

    public static void main(String[] args) {

        System.out.println(sufflethestring("codeleet", new int[]{4,5,6,7,0,2,1,3}));
        System.out.println(sufflethestring("abc", new int[]{0,1,2}));

    }
}
