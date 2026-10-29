package it.unibo.diet;

public class Omnivore implements Diet {
    public boolean canEatVegetables() {
        return true;
    }

    public boolean canEatMeat() {
        return true;
    }
}