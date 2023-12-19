package interviewquestions;

public class SingletonImpl {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

    }
}
