package Interfaces;

public interface Apollo {

    public void sales();

    public void Labservices();

    default void radiology(){
        System.out.println("I am from Apollo Radiology");
    }
}
