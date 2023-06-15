package Interfaces;

public interface Care {

    public void oncology();
    public void Labservices();

    default void radiology(){
        System.out.println("I am from CARE Radiology");
    }
}
