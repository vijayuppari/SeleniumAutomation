package methodOverriding;

public class mainmethodcalling {

    // We can not achieve the method overriding for data members, we can achieve it only for methods

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.barking();

        Lesadog lesadog = new Lesadog();
        lesadog.barking();

        Dog dogp = new Lesadog();
        dogp.barking();

        // Its not possible and we will get Classcast exception- Down casting not possible
       /*Lesadog ldog= (Lesadog) new Dog();
        ldog.barking();*/

        System.out.println(dogp.color);


    }
}
