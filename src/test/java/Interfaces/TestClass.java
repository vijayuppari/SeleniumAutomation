package Interfaces;

public class TestClass implements Interface1,Interface2{
    @Override
    public void m1() {
        System.out.println("m1 method called..");
    }

    public static void main(String[] args) {

        Interface1 i1 = new TestClass();
        i1.m1();

        Interface2 i2 = new TestClass();
        i2.m1();
    }
}
