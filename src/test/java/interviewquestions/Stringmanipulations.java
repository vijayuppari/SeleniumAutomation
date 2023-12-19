package interviewquestions;

public class Stringmanipulations {

    public static void main(String[] args) {

        String str="Wel10come20toIndia36";
        String str1 =str.replaceAll("[a-zA-z]","");
        Integer s2 =Integer.parseInt(str1);

        System.out.println("Total numbers in the input " + str1.length());
        int sum=0;
        while(s2>0){
          int rem=  s2%10;
          sum=sum+rem;
          s2=s2/10;
        }
        System.out.println(sum);
    }
}
