package Generics;

public class Genericmethodimpl {

    public static <T> void main(String[] args) {

        Genericmethod obj = new Genericmethod();
        System.out.println(obj.getval(10.5));
        System.out.println(obj.getval(200));
        System.out.println(obj.getval("vijay"));
    }
}
