package io.zipcoder.polymorphism;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "Whimper";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPet:\n" +
                "\tName= " + name;
    }
}
