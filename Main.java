public class Main{

    public static void main(String[] args){

        Vehicle v1 = new Vehicle();
        v1.brand = "Volkswagen";
        v1.model = "Beetle";
        v1.year = 1985;

        Vehicle v2 = new Vehicle();
        v2.brand = "Nissan";
        v2.model = "GT-R";
        v2.year = 2015;

        Vehicle v3 = new Vehicle();
        v3.brand = "Mitsubishi";
        v3.model = "Lancer";
        v3.year = 2010;

        v1.displayInfo();
        System.out.println(v1.calculateAge());
        System.out.println(v1.isVintage());
        v2.displayInfo();
        System.out.println(v2.calculateAge());
        System.out.println(v2.isVintage());
        v3.displayInfo();
        System.out.println(v3.calculateAge());
        System.out.println(v3.isVintage());

    }
}