package homework09;

import java.util.ArrayList;

public class PetStore extends PetSale {

    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;
    private ArrayList<GuineaPig> guineaPigs;
    private ArrayList<Iguana> iguanas;
    private ArrayList<Mouse> mice;
    private ArrayList<Pets> pet;

    public PetStore() {
        this.cats = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.guineaPigs = new ArrayList<>();
        this.iguanas = new ArrayList<>();
        this.mice = new ArrayList<>();
        this.pet = new ArrayList<>();
    }

    public void addPet(Pets pets) {
        this.pet.add(pets);
    }

    public void petSale(Pets pet, String name) {
        for (Pets pets : this.pet) {
            if (pet.petName == name) {
                if (pet instanceof Cat) {
                    incomeFromSoldPet += ((Cat) pet).catPrice;
                    whateverMethodAddsMoneyToIncome();
                } else if (pet instanceof Dog) {
                    incomeFromSoldPet += ((Dog) pet).dogPrice;
                    whateverMethodAddsMoneyToIncome();
                } else if (pet instanceof GuineaPig) {
                    incomeFromSoldPet += ((GuineaPig) pet).guineaPigPrice;
                    whateverMethodAddsMoneyToIncome();
                } else if (pet instanceof Iguana) {
                    incomeFromSoldPet += ((Iguana) pet).iguanaPrice;
                    whateverMethodAddsMoneyToIncome();
                } else if (pet instanceof Mouse) {
                    incomeFromSoldPet += ((Mouse) pet).mousePrice;
                    whateverMethodAddsMoneyToIncome();
                }
                this.pet.remove(pets);
            }
        }
    }
}
