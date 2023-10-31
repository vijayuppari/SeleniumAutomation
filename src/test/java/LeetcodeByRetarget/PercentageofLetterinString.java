package LeetcodeByRetarget;

public class PercentageofLetterinString {

    public static void main(String[] args) {

        System.out.println(percentageofLetter("foobar",'o'));
        System.out.println(percentageofLetter("jjjjj",'k'));
        System.out.println(percentageofLetter("a",'a'));

    }


    public static int percentageofLetter(String s, char letter){

        long count = s.chars().filter(ch -> ch==letter).boxed().count();
        double percentage = ((double)count / (double)s.length()) * 100;
        return (int)Math.floor(percentage);


    }
}
