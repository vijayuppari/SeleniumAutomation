package Generics;

public class Genericinterfaceimplewithgenericclass <T> implements GenericInterface <T>{


    public static void main(String[] args) {

        Genericinterfaceimplewithgenericclass o1= new Genericinterfaceimplewithgenericclass();
        System.out.println(o1.getinterfacevalue(10));
        System.out.println(o1.getinterfacevalue(10.5));
        System.out.println(o1.getinterfacevalue("vijay"));
    }


    @Override
    public T getinterfacevalue(T val) {
        return val;
    }
}
