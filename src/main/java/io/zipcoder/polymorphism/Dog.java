package io.zipcoder.polymorphism;

public class Dog  extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Bork";
    }

    @Override
    public String toString() {
        return super.toString() + " sais " + speak() + "\n";
    }
}
