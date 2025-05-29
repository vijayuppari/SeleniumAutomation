package naveenautomationlabs;

public class Singletonbrowser {

    private Singletonbrowser(){}

    private static volatile Singletonbrowser instance;

    public synchronized static Singletonbrowser getInstance(){
        // its block level locking,
        // if we provide block level locking its not required to give method as synchronized
        if(instance ==null){
            synchronized (Singletonbrowser.class){
                if(instance==null){
                    instance = new Singletonbrowser();
                }
            }
        }
        return instance;
    }

    public void displyMsg(){
        System.out.println("Its a singleton class");
    }
}
