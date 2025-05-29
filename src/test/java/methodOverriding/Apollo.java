package methodOverriding;

public class Apollo extends Hospital{

    public static void onology(){
        System.out.println("Apollo Oncology");
    }

    public  void pedatric(){
        System.out.println("Apollo pedatric");
    }

    public static void main(String[] args) {
        Hospital hospital = new Apollo();
        hospital.onology();
        hospital.pedatric();

    }
}
