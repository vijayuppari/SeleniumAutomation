package Generics;

public class Genericinterfaceimple implements GenericInterface <Integer>{
    public static void main(String[] args) {
        Genericinterfaceimple o1= new Genericinterfaceimple();
        System.out.println(o1.getinterfacevalue(10));
    }
    @Override
    public Integer getinterfacevalue(Integer val) {
        return val;
    }
}
