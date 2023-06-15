package Generics;

public class Geneticclass <T> {
    private  T val;
    public Geneticclass(T val){
        this.val=val;
    }

    public T getVal(){
        return val;
    }
}
