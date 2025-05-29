package methodOverriding;

public class anonymousSpecialCar extends anonymousCar{



    public static void main(String[] args) {

       /* anonymousSpecialCar specialCar = new anonymousSpecialCar();
        specialCar.horn();

        anonymousCar car = new anonymousCar();
        car.horn();

        anonymousCar car1 = new anonymousSpecialCar();
        car.horn();*/

        new anonymousCar(){
            @Override
            public void horn(){
                System.out.println("Car Horn");
            }
        }.horn();
        anonymousCar car1 = new anonymousCar(){
            @Override
            public void horn(){
                System.out.println("Car1 Horn");
            }
        };
        car1.horn();
    }

}
