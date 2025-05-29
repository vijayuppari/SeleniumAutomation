package Javatechie;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class xyz1 {

    public static void main(String[] args) {

        //removedupfromstring("vijaykumaruppari");
        //reversenum(123);
        //printfb();

        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());

        DateTimeFormatter sd =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(now.format(sd));


    }

    public static void removedupfromstring( String str){

        Set hset = new HashSet();
        List<String> collect = Stream.of(str.split("")).filter(ch -> hset.add(ch)).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void reversenum(int num){
        int sum=0;
        while (num>0){
            int reminder = num % 10;
            sum=(sum)+reminder*reminder*reminder;
            num=num/10;
        }
        System.out.println(sum);
    }

    public static void printfb(){

        int k=0,a=1,b=1;
        System.out.println("1 ");
        while (k<=15){
            k=a+b;
            System.out.println(k+ " ");
            a=b;
            b=k;
        }


    }
}
