package io.zipcoder.polymorphism;

public class Iguana extends Pet {
    public Iguana(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "*stick tongue out twice*";
    }
}
