package methodOverriding;

public class Lesadog extends Dog {

    public String color= "Black";

    public void barking() throws IndexOutOfBoundsException{
        System.out.println("Child class dog is barking");
    }

    public void m2(){
        System.out.println("Child m2");
    }
}
