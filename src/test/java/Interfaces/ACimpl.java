package Interfaces;

public class ACimpl implements Apollo,Care{


    @Override
    public void sales() {
        System.out.println("Sales from APOLLO");
    }

    @Override
    public void Labservices() {
        System.out.println("Common Lab services");
    }

    @Override
    public void oncology() {
        System.out.println("Marketing from CARE");
    }

    @Override
    public void radiology() {
        Apollo.super.radiology();
    }

    public static void main(String[] args) {

        Apollo ap = new ACimpl();
        ap.radiology();
        ap.sales();

       /*Care ca = new ACimpl();
        ca.radiology();*/
    }
}
