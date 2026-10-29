package it.unibo.diet;

public class Herbivore implements Diet {
    public boolean canEatVegetables() {
        return true;
    }

    public boolean canEatMeat() {
        return false;
    }
}