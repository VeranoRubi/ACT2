public class Main{

    public static void main(String[] args){

        Vehicle v1 = new Vehicle("Volkswagen","Beetle",1985);
        Vehicle v2 = new Vehicle("Nissan","GT-R",2015);
        Vehicle v3 = new Vehicle("Mitsubishi","Lancer",2010);
 
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