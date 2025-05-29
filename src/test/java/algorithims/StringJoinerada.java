

import java.util.StringJoiner;

public class StringJoinerada {

    public static void main(String[] args) {

        StringJoiner strjoiner = new StringJoiner(";");
        strjoiner.add("X").add("Y").add("Z");
        System.out.println(strjoiner);

        StringJoiner strjoiner1 = new StringJoiner(":");
        strjoiner1.add("M").add("N");
        System.out.println(strjoiner1);

        StringJoiner merge = strjoiner.merge(strjoiner1);
        System.out.println(merge);


    }
}
