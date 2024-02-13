package tn.esprit.gestionzoo.entities;

public class Animal {  private String family, name;
    private int age;
    private boolean isMammal;

    public Animal(
            String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            // Gérer l'âge négatif, ici je l'initialise à 0
            this.age = 0;
        }
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

