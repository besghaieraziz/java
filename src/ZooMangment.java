import java.util.Scanner;

class ZooMangment {

    public static void main (String[] args){
        int nbrCage = 20;
        String zooName = "my Zoo";
        // insert data
        Scanner sc = new Scanner(System.in);
        System.out.println("give me zoo name ");
        zooName = sc.nextLine();
        System.out.println("give me number of cages ");

        nbrCage= sc.nextInt();


        System.out.println(zooName + " comporte " + nbrCage+" cages");

    }

}class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }
}

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("border", "lion", 5, true);
        Zoo myZoo = new Zoo("zzh", "VilleZ", 10);

        myZoo.animals[0] = lion;
    }
}

