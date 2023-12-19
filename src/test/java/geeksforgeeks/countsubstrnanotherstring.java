package geeksforgeeks;

public class countsubstrnanotherstring {

    public static void main(String[] args) {

        System.out.println(countsubstr("aab","aaaab"));
        System.out.println(countsubstr("abcd","swalencud"));

    }

    public static int countsubstr(String str1, String str2){

        int ans=0;
        for(int i=0;i<str1.length();i++){

            String s3="";
            char[] s4 = str1.toCharArray();
            for(int j=i;j< str1.length();j++){
                s3= s3+s4[j];
                if(str2.indexOf(s3)!=-1)
                    ans++;
            }
        }
        return ans;
    }
}
