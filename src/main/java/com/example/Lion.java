package com.example;
import java.util.List;


public class Lion {

    private Predator predator;
    private boolean hasMane; // имеет ли гриву

    public Lion(String gender, Predator predator) throws Exception {
        this.predator = predator;

        if (gender.equals("Самец")) {
            hasMane = true;
        } else if (gender.equals("Самка")) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола");
        }
    }

    public int getKittens() {
        return ((Feline) predator).getKittens(); // Приведение типов, Feline содержит метод
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}
