package io.zipcoder.polymorphism;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console console = new Console();
        Integer amountOfPets = console.returnInteger("How many pets do you have?");
        ArrayList<Pet> listPets = new ArrayList<Pet>();
        String petType = "";

        for (int i = 0; i < amountOfPets ; i++) {
           petType = console.returnString("What Type of pet do you have?");

            switch(petType.toUpperCase()){
                case "DOG":
                    listPets.add(new Dog(console.returnString("Name of Dog?")));
                    break;
                case "CAT":
                    listPets.add(new Cat(console.returnString("Name of your Cat?")));
                    break;
                case "IGUANA":
                    listPets.add(new Iguana(console.returnString("Name of our Iguana")));
                    break;
                    default:
                        i -= 1;
                        break;
            }
        }

        System.out.println(listPets);


    }
}
