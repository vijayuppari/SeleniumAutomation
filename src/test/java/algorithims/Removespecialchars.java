package algorithims;

public class Removespecialchars {

    public static void main(String[] args) {

        int count=0;
        String specharacter="";
        //Approach :1
       /* String input = "Java@#$MindTechie!";
        String actualstring = input.replaceAll("[A-Za-z]", "");
        System.out.println(actualstring);*/

        //Approach :2
     /*   for(int i=0;i<input.length();i++){
            if(!Character.isLetterOrDigit(input.charAt(i)) && !Character.isWhitespace(input.charAt(i))){
                count++;
            }
            else{
                specharacter =specharacter+input.charAt(i);
            }
        }
        System.out.println(specharacter);*/

        //Approach 3:
           String input = "Java@#$MindTechie!";
           String specialchar ="";
           for(int i=0;i<input.length();i++){
               char c = input.charAt(i);
               if(Character.isLetterOrDigit(c)){
                   specialchar=specialchar+c;
               }
           }
        System.out.println(specialchar);
    }
}
